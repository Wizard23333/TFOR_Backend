package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.model.*;
import cn.edu.tongji.tfor_backend.repository.*;
import cn.edu.tongji.tfor_backend.service.ZoneInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


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
    @Resource
    UserEntityRepository userEntityRepository;

    @Override
    public List<ZoneEntity> getAllZones() {
        return zoneEntityRepository.findAllZones(); // call the repository layer's function
    }

    @Override
    public List<PostSimpleInfo> getRecommend(Integer userId) {
        // 关注分区的列表
        List<UserFollowZoneEntity> userFollowZoneEntityList = userFollowZoneEntityRepository.findByUserId(userId);
        // 如果没有关注的分区的话， 直接返回热榜
        if (userFollowZoneEntityList.size() == 0) {
            return this.getRank(3);
        }
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

    @Override
    public List<PostSimpleInfo> getRank(Integer day) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 时间格式

        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis()); // 当前的时间戳
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(timestamp1);
        System.out.format(df.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_MONTH, -day);
        Timestamp timestamp2 = new Timestamp(calendar.getTime().getTime()); // day 天前的时间戳
        System.out.format(df.format(calendar.getTime()));

        List<PostSimpleInfo> rankList = this.getPostInfoListByPostList(
                postEntityRepository.findTop50ByLastEditTimeBetweenOrderByLikeNumDesc(timestamp2, timestamp1)
        );
        return rankList;
    }

    @Override
    public List<PostSimpleInfo> search(String keyword) {
        return this.getPostInfoListByPostList(
                postEntityRepository.findByPostTitleContainingOrTextContaining(
                        keyword, keyword
                ));
    }

    @Override
    public List<PostSimpleInfo> getByZoneId(Integer zoneId) {
        return this.getPostInfoListByContentIdList(zoneOwnPostEntityRepository.findByZoneId(zoneId));
    }

    // 根据zoneid的列表获取zone的具体列表
    @Override
    public List<ZoneEntity> getZoneListByIdList(List<Integer> zoneIdList) {
        List<ZoneEntity> zoneEntityList = new ArrayList<>();
        for (Integer item: zoneIdList){
            zoneEntityList.add(zoneEntityRepository.findByZoneId(item));
        }
        return zoneEntityList;
    }

    // 根据ZoneOwnPostEntity获取帖子简略信息
    private List<PostSimpleInfo> getPostInfoListByContentIdList(List<ZoneOwnPostEntity> zoneOwnPostEntityList) {
        List<PostSimpleInfo> list = new ArrayList<>();
        for (ZoneOwnPostEntity item : zoneOwnPostEntityList) {
            PostEntity tempPost = postEntityRepository.findByContentId(item.getContentId());
            PostSimpleInfo simpleInfo = new PostSimpleInfo();
            simpleInfo.setPostTitle(tempPost.getPostTitle());
            simpleInfo.setPostId(tempPost.getContentId());
            simpleInfo.setUserId(tempPost.getUserId());
            simpleInfo.setUserName(userEntityRepository.findByUserId(tempPost.getUserId()).getUserName());
            simpleInfo.setLikeNum(tempPost.getLikeNum());
            simpleInfo.setLabel(tempPost.getLabel());
            list.add(simpleInfo);
        }
        return list;
    }

    // 根据帖子详细信息得到简略信息
    private List<PostSimpleInfo> getPostInfoListByPostList(List<PostEntity> postEntityList) {
        List<PostSimpleInfo> postSimpleInfos = new ArrayList<>();
        for (PostEntity item : postEntityList) {
            PostSimpleInfo postSimpleInfo = new PostSimpleInfo();
            postSimpleInfo.setPostId(item.getContentId());
            postSimpleInfo.setPostTitle(item.getPostTitle());
            postSimpleInfo.setUserId(item.getUserId());
            postSimpleInfo.setUserName(userEntityRepository.findByUserId(postSimpleInfo.getUserId()).getUserName());
            postSimpleInfo.setLikeNum(item.getLikeNum());
            postSimpleInfo.setLabel(item.getLabel());
            postSimpleInfos.add(postSimpleInfo);
        }
        return postSimpleInfos;
    }

    public ZoneEntity getZoneInfoById(Integer zoneId) {
        ZoneEntity z = zoneEntityRepository.getById(zoneId);
        return z;
    }
}