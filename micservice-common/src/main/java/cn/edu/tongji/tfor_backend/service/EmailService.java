package cn.edu.tongji.tfor_backend.service;


public interface EmailService {
    void sendEmailVerifyCode(String receiver);

    String getEmailVerifyCode();
}
