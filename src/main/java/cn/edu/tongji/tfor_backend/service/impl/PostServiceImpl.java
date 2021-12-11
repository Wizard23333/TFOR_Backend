package cn.edu.tongji.tfor_backend.service.impl;
import cn.edu.tongji.tfor_backend.model.AdvertisementEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.repository.AdvertisementEntityRepository;
import cn.edu.tongji.tfor_backend.repository.PostEntityRepository;
import cn.edu.tongji.tfor_backend.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Service
public class PostServiceImpl implements PostService {
    @Resource
    PostEntityRepository postEntityRepository;

    @Resource
    AdvertisementEntityRepository advertisementEntityRepository;

    @Override
    public int postContent(PostEntity p) {
        PostEntity newPost = new PostEntity();
        newPost.setUserId(p.getUserId());
        newPost.setLikeNum(0);
        newPost.setCommentNum(0);
        Timestamp now= new Timestamp(System.currentTimeMillis());//get the current system time
        newPost.setLastEditTime(now);
        newPost.setText(p.getText());
        newPost.setPicture(p.getPicture());
        newPost.setReportNum(p.getReportNum());
        newPost.setReviewState("Not Reviewed");
        newPost.setLabel("Normal");
        newPost.setPostTitle(p.getPostTitle());
        newPost.setVideo(p.getVideo());

        postEntityRepository.save(newPost);

        return 0;
    }

    @Override
    public int postAdvertisement(AdvertisementEntity a) {
        AdvertisementEntity newAdver = new AdvertisementEntity();

        newAdver.setAdmId(a.getAdmId());
        Timestamp now= new Timestamp(System.currentTimeMillis());//get the current system time
        newAdver.setLastEditTime(now);
        newAdver.setPicture(a.getPicture());
        newAdver.setPostTitle(a.getPostTitle());
        newAdver.setVideo(a.getVideo());

        advertisementEntityRepository.save(newAdver);

        return 0;
    }
}
