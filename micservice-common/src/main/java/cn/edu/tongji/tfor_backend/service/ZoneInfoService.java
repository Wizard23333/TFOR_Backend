package cn.edu.tongji.tfor_backend.service;


import cn.edu.tongji.tfor_backend.model.ZoneEntity;
import lombok.Data;

import java.util.List;

// this is a Service interface that can be implements
public interface ZoneInfoService {

    List<ZoneEntity> getAllZones();

    // select recommend post from user's followed zones
    List<PostSimpleInfo> getRecommend(Integer userId);

    // select rank of the all posts of near Day days
    List<PostSimpleInfo> getRank(Integer Day);

    List<PostSimpleInfo> search(String keyword);

    List<PostSimpleInfo> getByZoneId(Integer zoneId);

    List<ZoneEntity> getZoneListByIdList(List<Integer> zoneIdList);

    ZoneEntity getZoneInfoById(Integer zoneId);

    @Data
    class PostSimpleInfo{
        String postTitle;
        String postId;
        Integer userId;
        String userName;
        Integer likeNum;
        String label;
    }
}
