package cn.edu.tongji.tfor_backend.service;

public interface TelephoneService {
    void sendTelVerifyCode(String telnum);

    String getTelVerifyCode();
}
