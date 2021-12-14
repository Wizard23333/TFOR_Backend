package cn.edu.tongji.tfor_backend.service;


import cn.edu.tongji.tfor_backend.model.ZoneEntity;
import lombok.Data;

import java.util.List;

// this is a Service interface that can be implements
public interface ZoneInfoService {

    List<ZoneEntity> getAllZones();

    // select recommend post from user's followed zones
    List<PostSimpleInfo> getRecommend(Integer userId);

    // 

    @Data
    class PostSimpleInfo{
        String postTitle;
        Integer postId;
        Integer userId;
        Integer likeNum;
    }
}
