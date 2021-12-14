package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntity;
import cn.edu.tongji.tfor_backend.model.ZoneEntity;
import cn.edu.tongji.tfor_backend.model.ZoneOwnPostEntity;
import cn.edu.tongji.tfor_backend.repository.PostEntityRepository;
import cn.edu.tongji.tfor_backend.repository.UserFollowZoneEntityRepository;
import cn.edu.tongji.tfor_backend.repository.ZoneEntityRepository;
import cn.edu.tongji.tfor_backend.repository.ZoneOwnPostEntityRepository;
import cn.edu.tongji.tfor_backend.service.ZoneInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// implements of the service interface
@Service
public class ZoneInfoServiceImpl implements ZoneInfoService {

    @Resource
    ZoneEntityRepository zoneEntityRepository;
    @Resource
    PostEntityRepository postEntityRepository;
    @Resource
    UserFollowZoneEntityRepository userFollowZoneEntityRepository;
    @Resource
    ZoneOwnPostEntityRepository zoneOwnPostEntityRepository;

    @Override
    public List<ZoneEntity> getAllZones() {
        return zoneEntityRepository.findAllZones(); // call the repository layer's function
    }

    @Override
    public List<PostSimpleInfo> getRecommend(Integer userId) {
        // 关注分区的列表
        List<UserFollowZoneEntity> userFollowZoneEntityList = userFollowZoneEntityRepository.findByUserId(userId);
        List<PostSimpleInfo> recommendList = new ArrayList<>();
        // 每个分区的推荐条数
        int numOfEachZone = (int) Math.ceil(50.0 / userFollowZoneEntityList.size());
        // 在每个分区中随机选取帖子
        for (UserFollowZoneEntity item : userFollowZoneEntityList) {
            PostSimpleInfo simpleInfo = new PostSimpleInfo();
            List<ZoneOwnPostEntity> contentIdList = zoneOwnPostEntityRepository.findByZoneId(item.getZoneId());
            Collections.shuffle(contentIdList); // 打乱顺序
            recommendList.addAll(this.getPostInfoListByContentIdList(
                    contentIdList.subList(0, numOfEachZone < contentIdList.size() ? numOfEachZone : contentIdList.size())// 截取
            ));

        }
        return recommendList;
    }

    // 根据contentId获取帖子简略信息
    private List<PostSimpleInfo> getPostInfoListByContentIdList(List<ZoneOwnPostEntity> zoneOwnPostEntityList) {
        List<PostSimpleInfo> list = new ArrayList<>();
        for (ZoneOwnPostEntity item : zoneOwnPostEntityList) {
            PostEntity tempPost = postEntityRepository.findByContentId(item.getContentId());
            PostSimpleInfo simpleInfo = new PostSimpleInfo();
            simpleInfo.setPostTitle(tempPost.getPostTitle());
            simpleInfo.setPostId(tempPost.getContentId());
            simpleInfo.setUserId(tempPost.getUserId());
            simpleInfo.setLikeNum(tempPost.getLikeNum());
            list.add(simpleInfo);
        }
        return list;
    }
}