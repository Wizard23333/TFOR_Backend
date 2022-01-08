package cn.edu.tongji.tfor_backend.kafkauser;

import cn.edu.tongji.tfor_backend.service.EmailService;
import cn.edu.tongji.tfor_backend.service.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @Autowired
    EmailService emailService;

    @Autowired
    TelephoneService telephoneService;


    @KafkaListener(topics = {"emailTopic"})
    public void receiveEmailMessage(String message){

        emailService.sendEmailVerifyCode(message);
    }

    @KafkaListener(topics = {"telTopic"})
    public void receiveTelMessage(String message) {
        telephoneService.sendTelVerifyCode(message);
    }

}
