package cn.edu.tongji.tfor_backend.service;

import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

@Service
public interface ObsGetService {
    public String join(List<?> items, String delimiter);

    public boolean isValid(String input);

    public String urlEncode(String input) throws UnsupportedEncodingException;

    public String hamcSha1(String input) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException;

    public String headerSignature(String httpMethod, Map<String, String[]> headers, Map<String, String> queries,
                                  String bucketName, String objectName) throws Exception ;

    public String querySignature(String httpMethod, Map<String, String[]> headers, Map<String, String> queries,
                                 String bucketName, String objectName, long expires) throws Exception;

    public String getURL(String endpoint, Map<String, String> queries,
                         String bucketName, String objectName, String signature, long expires) ;

    public String getUploadURL(String objectName) throws Exception ;
}
