package cn.edu.tongji.tfor_backend.kafkapost;

import cn.edu.tongji.tfor_backend.exceptionclass.PostException;
import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.service.PostService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @Autowired
    PostService postService;

    //监听commentTopic主题,有消息就读取
    @KafkaListener(topics = {"commentTopic"})
    public void receiveMessage(String message) throws PostException {
        //收到通道的消息之后执行更新评论操作
        CommentEntity newComment = JSON.parseObject(message, CommentEntity.class);
        postService.postComment(newComment);
    }

}
