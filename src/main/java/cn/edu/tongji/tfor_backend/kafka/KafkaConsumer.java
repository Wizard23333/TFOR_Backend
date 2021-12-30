package cn.edu.tongji.tfor_backend.kafka;

import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.service.PostService;
import cn.edu.tongji.tfor_backend.service.impl.PostServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.alibaba.fastjson.JSON;

@Component
public class KafkaConsumer {
    @Autowired
    PostService postService;

    final Logger logger = LoggerFactory.getLogger(PostServiceImpl.class);

    //监听commentTopic主题,有消息就读取
    @KafkaListener(topics = {"commentTopic"})
    public void receiveMessage(String message) {
        //收到通道的消息之后执行更新评论操作
        logger.info("###################"+message);
        CommentEntity newComment = JSON.parseObject(message, CommentEntity.class);
        postService.postComment(newComment);
    }
}
