package cn.edu.tongji.tfor_backend.kafka;

import cn.edu.tongji.tfor_backend.service.impl.PostServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    final Logger logger = LoggerFactory.getLogger(PostServiceImpl.class);

    //发送消息到kafka
    public void sendChannelMess(String channel, String message) {
        logger.info("!!!!!!!!!!!!"+message);
        kafkaTemplate.send(channel, message);
    }
}
