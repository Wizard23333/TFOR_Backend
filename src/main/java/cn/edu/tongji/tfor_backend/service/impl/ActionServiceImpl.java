package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.model.UserCollectionEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowUserEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntity;
import cn.edu.tongji.tfor_backend.repository.*;
import cn.edu.tongji.tfor_backend.service.ActionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ActionServiceImpl implements ActionService {
    @Resource
    UserFollowZoneEntityRepository userFollowZoneEntityRepository;

    @Resource
    UserCollectionEntityRepository userCollectionEntityRepository;

    @Resource
    UserFollowUserEntityRepository userFollowUserEntityRepository;

    @Resource
    PostEntityRepository postEntityRepository;

    @Resource
    UserEntityRepository userEntityRepository;

    @Resource
    ZoneEntityRepository zoneEntityRepository;

    @Override
    public boolean followZone(UserFollowZoneEntity userFollowZoneEntity){
        if (!userEntityRepository.existsByUserId(userFollowZoneEntity.getUserId()) ||
                !zoneEntityRepository.existsByZoneId(userFollowZoneEntity.getZoneId())) {
            return false;
        }
        if(userFollowZoneEntityRepository.existsByUserIdAndZoneId(userFollowZoneEntity.getUserId(), userFollowZoneEntity.getZoneId())){
            return false;
        }
        userFollowZoneEntityRepository.save(userFollowZoneEntity);
        return true;
    }

    @Override
    public boolean collectPost(UserCollectionEntity userCollectionEntity) {
        if (!userEntityRepository.existsByUserId(userCollectionEntity.getUserId()) ||
                !postEntityRepository.existsByContentId(userCollectionEntity.getContentId())) {
            return false;
        }
        userCollectionEntityRepository.save(userCollectionEntity);
        return true;
    }

    @Override
    public int followUser(UserFollowUserEntity userFollowUserEntity) {
        userFollowUserEntityRepository.save(userFollowUserEntity);
        return 0;
    }

    @Override
    public int likePost(String cid) {
        System.out.println(cid);
        postEntityRepository.addLikeNum(cid);
        return 0;
    }

    @Override
    public int reportPost(String cid) {
        postEntityRepository.addReportNum(cid);
        return 0;
    }


    @Override
    public int cancelFollowZone(int uid,int zid) {
        System.out.println(uid);
        userFollowZoneEntityRepository.deleteByUserIdAndZoneId(uid,zid);
        return 0;
    }

    @Override
    public int cancelCollectPost(int uid,String cid) {
        userCollectionEntityRepository.deleteByUidAndCid(uid,cid);
        return 0;
    }

    @Override
    public boolean cancelFollowUser(int uid1,int uid2) {
        if(!userEntityRepository.existsByUserId(uid1) || !userEntityRepository.existsByUserId(uid2)) {
            return false;
        }
        if(!userFollowUserEntityRepository.existsByUserFollowingIdAndUserFollowedId(uid1, uid2)) {
            return false;
        }
        userFollowUserEntityRepository.deleteByUsersId(uid1,uid2);
        return true;
    }


}
