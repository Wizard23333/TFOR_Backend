package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Random;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    JavaMailSenderImpl mailSender;

    //从配置文件中获取发件人
    @Value("${spring.mail.username}")
    private String sender;

    //用于验证的系统校验码
    public static String emailVerifyCode = null;

    //生成6位随机数字作为验证码
    private static final String SYMBOLS = "0123456789";
    private static final Random RANDOM = new SecureRandom();
    public static String generateVerCode() {
        char[] nonceChars = new char[6];
        for (int index = 0; index < nonceChars.length; ++index) {
            nonceChars[index] = SYMBOLS.charAt(RANDOM.nextInt(SYMBOLS.length()));
        }
        return new String(nonceChars);
    }

    //发送邮件
    //设置一系列相关参数
    // @Async
    @Override
    public void sendEmailVerifyCode(String receiver) throws MailSendException {
        SimpleMailMessage message = new SimpleMailMessage();
        String verifyCode = generateVerCode();
        emailVerifyCode = verifyCode;
        message.setSubject("TFOR-同济校园论坛验证码");	//设置邮件标题
        message.setText("尊敬的用户,您好:\n"
                + "\n本次请求的邮件验证码为:" + verifyCode + ",本验证码5分钟内有效，请及时输入。（请勿泄露此验证码）\n"
                + "\n如非本人操作，请忽略该邮件。\n(这是一封自动发送的邮件，请不要直接回复）");	//设置邮件正文
        message.setTo(receiver);	//设置收件人
        message.setFrom(sender);	//设置发件人
        mailSender.send(message);	//发送邮件
    }

    @Override
    public String getEmailVerifyCode(){
        return emailVerifyCode;
    }
}
