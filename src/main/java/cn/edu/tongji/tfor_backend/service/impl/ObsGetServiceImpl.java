package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.configuration.OBS;
import cn.edu.tongji.tfor_backend.model.UserEntity;
import cn.edu.tongji.tfor_backend.service.ObsGetService;
import com.alibaba.fastjson.JSONObject;
import com.obs.services.ObsClient;
import com.obs.services.model.ListObjectsRequest;
import com.obs.services.model.ObjectListing;
import com.obs.services.model.ObsObject;
import org.springframework.stereotype.Service;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

@Service
public class ObsGetServiceImpl implements ObsGetService {
    @Override
    public String urlEncode(String input) throws UnsupportedEncodingException
    {
        return URLEncoder.encode(input, OBS.DEFAULT_ENCODING)
                .replaceAll("%7E", "~") //for browser
                .replaceAll("%2F", "/");
    }

    @Override
    public String join(List<?> items, String delimiter)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++)
        {
            String item = items.get(i).toString();
            sb.append(item);
            if (i < items.size() - 1)
            {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }

    @Override
    public boolean isValid(String input) {
        return input != null && !input.equals("");
    }

    @Override
    public String hamcSha1(String input) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        SecretKeySpec signingKey = new SecretKeySpec(OBS.sk.getBytes(OBS.DEFAULT_ENCODING), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(signingKey);
        return Base64.getEncoder().encodeToString(mac.doFinal(input.getBytes(OBS.DEFAULT_ENCODING)));
    }

    private String stringToSign(String httpMethod, Map<String, String[]> headers, Map<String, String> queries,
                                String bucketName, String objectName) throws Exception{
        String contentMd5 = "";
        String contentType = "";
        String date = "";

        TreeMap<String, String> canonicalizedHeaders = new TreeMap<String, String>();

        String key;
        List<String> temp = new ArrayList<String>();
        for(Map.Entry<String, String[]> entry : headers.entrySet()) {
            key = entry.getKey();
            if(key == null || entry.getValue() == null || entry.getValue().length == 0) {
                continue;
            }

            key = key.trim().toLowerCase(Locale.ENGLISH);
            if(key.equals("content-md5")) {
                contentMd5 = entry.getValue()[0];
                continue;
            }

            if(key.equals("content-type")) {
                contentType = entry.getValue()[0];
                continue;
            }

            if(key.equals("date")) {
                date = entry.getValue()[0];
                continue;
            }

            if(key.startsWith(OBS.OBS_PREFIX)) {

                for(String value : entry.getValue()) {
                    if(value != null) {
                        temp.add(value.trim());
                    }
                }
                canonicalizedHeaders.put(key, this.join(temp, ","));
                temp.clear();
            }
        }

        if(canonicalizedHeaders.containsKey("x-obs-date")) {
            date = "";
        }


        // handle method/content-md5/content-type/date
        StringBuilder stringToSign = new StringBuilder();
        stringToSign.append(httpMethod).append(OBS.SIGN_SEP)
                .append(contentMd5).append(OBS.SIGN_SEP)
                .append(contentType).append(OBS.SIGN_SEP)
                .append(date).append(OBS.SIGN_SEP);

        // handle canonicalizedHeaders
        for(Map.Entry<String, String> entry : canonicalizedHeaders.entrySet()) {
            stringToSign.append(entry.getKey()).append(":").append(entry.getValue()).append(OBS.SIGN_SEP);
        }

        // handle CanonicalizedResource
        stringToSign.append("/");
        if(this.isValid(bucketName)) {
            stringToSign.append(bucketName).append("/");
            if(this.isValid(objectName)) {
                stringToSign.append(this.urlEncode(objectName));
            }
        }

        TreeMap<String, String> canonicalizedResource = new TreeMap<String, String>();
        for(Map.Entry<String, String> entry : queries.entrySet()) {
            key = entry.getKey();
            if(key == null) {
                continue;
            }

            if(OBS.SUB_RESOURCES.contains(key)) {
                canonicalizedResource.put(key, entry.getValue());
            }
        }

        if(canonicalizedResource.size() > 0) {
            stringToSign.append("?");
            for(Map.Entry<String, String> entry : canonicalizedResource.entrySet()) {
                stringToSign.append(entry.getKey());
                if(this.isValid(entry.getValue())) {
                    stringToSign.append("=").append(entry.getValue());
                }
                stringToSign.append("&");
            }
            stringToSign.deleteCharAt(stringToSign.length()-1);
        }

//		System.out.println(String.format("StringToSign:%s%s", SIGN_SEP, stringToSign.toString()));

        return stringToSign.toString();
    }

    @Override
    public String headerSignature(String httpMethod, Map<String, String[]> headers, Map<String, String> queries,
                                  String bucketName, String objectName) throws Exception {

        //1. stringToSign
        String stringToSign = this.stringToSign(httpMethod, headers, queries, bucketName, objectName);

        //2. signature
        return String.format("OBS %s:%s", OBS.ak, this.hamcSha1(stringToSign));
    }

    @Override
    public String querySignature(String httpMethod, Map<String, String[]> headers, Map<String, String> queries,
                                 String bucketName, String objectName, long expires) throws Exception {
        if(headers.containsKey("x-obs-date")) {
            headers.put("x-obs-date", new String[] {String.valueOf(expires)});
        }else {
            headers.put("date", new String[] {String.valueOf(expires)});
        }
        //1. stringToSign
        String stringToSign = this.stringToSign(httpMethod, headers, queries, bucketName, objectName);

        //2. signature
        return this.urlEncode(this.hamcSha1(stringToSign));
    }

    @Override
    public String getURL(String endpoint, Map<String, String> queries,
                         String bucketName, String objectName, String signature, long expires) {
        StringBuilder URL = new StringBuilder();
        URL.append("https://").append(bucketName).append(".").append(endpoint).append("/").
                append(objectName).append("?");
        String key;
        for (Map.Entry<String, String> entry : queries.entrySet()) {
            key = entry.getKey();
            if (key == null) {
                continue;
            }
            if (OBS.SUB_RESOURCES.contains(key)) {
                String value = entry.getValue();
                URL.append(key);
                if (value != null) {
                    URL.append("=").append(value).append("&");
                } else {
                    URL.append("&");
                }
            }
        }
        URL.append("AccessKeyId=").append(OBS.ak).append("&Expires=").append(expires).
                append("&Signature=").append(signature);
        return URL.toString();
    }

    @Override
    public String getUploadURL(String objectName) throws Exception {
        // 若直接使用URL在浏览器地址栏中访问，无法带上头域，此处headers加入头域会导致签名不匹配，使用headers需要客户端处理
        Map<String, String[]> headers = new HashMap<String, String[]>();
        Map<String, String> queries = new HashMap<String, String>();

        // 请求消息参数Expires，设置24小时后失效
        long expires = (System.currentTimeMillis() + 86400000L) / 1000;
        String signature = this.querySignature("GET", headers, queries, OBS.bucketName, objectName, expires);
        return this.getURL(OBS.endPoint, queries, OBS.bucketName, objectName, signature, expires);
    }

    @Override
    public List<String> getCommentImageList(String commentId) throws Exception {
        // 若直接使用URL在浏览器地址栏中访问，无法带上头域，此处headers加入头域会导致签名不匹配，使用headers需要客户端处理
        Map<String, String[]> headers = new HashMap<String, String[]>();
        Map<String, String> queries = new HashMap<String, String>();

        // 创建ObsClient实例
        final ObsClient obsClient = new ObsClient(OBS.ak, OBS.sk, "https://" + OBS.endPoint);

        ListObjectsRequest request = new ListObjectsRequest("tfor");
        // 设置列举带有prefix前缀的1000个对象
        request.setMaxKeys(1000);
        request.setPrefix("comment/"+commentId);
        ObjectListing result = obsClient.listObjects(request);

        List<String> resList = new LinkedList<>();
        for(ObsObject obsObject : result.getObjects()){
            JSONObject res = new JSONObject();
            String objectName =  obsObject.getObjectKey();
            // 请求消息参数Expires，设置24小时后失效
            long expires = (System.currentTimeMillis() + 86400000L) / 1000;
            String signature = this.querySignature("GET", headers, queries, OBS.bucketName, objectName, expires);
            String url = this.getURL(OBS.endPoint, queries, OBS.bucketName, objectName, signature, expires);
            resList.add(url);
        }
        return resList;
    }
}
