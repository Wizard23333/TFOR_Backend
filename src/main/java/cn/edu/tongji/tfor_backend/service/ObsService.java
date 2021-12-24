package cn.edu.tongji.tfor_backend.service;

import cn.edu.tongji.tfor_backend.configuration.OBS;
import com.alibaba.fastjson.JSONObject;
import com.obs.services.BasicObsCredentialsProvider;
import com.obs.services.ObsClient;
import com.obs.services.model.PostSignatureRequest;
import com.obs.services.model.PostSignatureResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public interface ObsService {
    // 创建ObsClient实例
    private static void createClient() {
        OBS.obsClient = new ObsClient(new BasicObsCredentialsProvider(OBS.ak, OBS.sk), OBS.endPoint);
    }

    // 关闭obsClient
    private static void close() throws IOException {
        OBS.obsClient.close();
    }

    static JSONObject getUploadAuth() throws IOException {
        createClient();

        PostSignatureRequest request = new PostSignatureRequest();
        // 设置表单参数
        Map<String, Object> formParams = new HashMap<String, Object>();
        // 设置对象访问权限为公共读
        formParams.put("x-obs-acl", "public-read");
        // 设置对象MIME类型
        formParams.put("content-type", "multipart/form-data");

        request.setFormParams(formParams);
        // 设置表单上传请求有效期，单位：秒
        request.setExpires(3600);
        PostSignatureResponse response = OBS.obsClient.createPostSignature(request);

        // 获取表单上传请求参数
        System.out.println("\t" + response.getPolicy());
        System.out.println("\t" + response.getSignature());

        JSONObject res = new JSONObject();

        res.put("requestURL", OBS.requestURL);
        res.put("access-key", OBS.ak);
        res.put("policy", response.getPolicy());
        res.put("signature", response.getSignature());

        close();
        return res;
    }
}
