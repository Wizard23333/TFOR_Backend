package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.model.UserCollectionEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowUserEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntity;
import cn.edu.tongji.tfor_backend.repository.PostEntityRepository;
import cn.edu.tongji.tfor_backend.repository.UserCollectionEntityRepository;
import cn.edu.tongji.tfor_backend.repository.UserFollowUserEntityRepository;
import cn.edu.tongji.tfor_backend.repository.UserFollowZoneEntityRepository;
import cn.edu.tongji.tfor_backend.service.ActionService;
import org.springframework.http.HttpStatus;
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

    @Override
    public int followZone(UserFollowZoneEntity userFollowZoneEntity){
        System.out.println(userFollowZoneEntity.toString());
        userFollowZoneEntityRepository.save(userFollowZoneEntity);
        return 0;
    }

    @Override
    public int collectPost(UserCollectionEntity userCollectionEntity) {
        userCollectionEntityRepository.save(userCollectionEntity);
        return 0;
    }

    @Override
    public int followUser(UserFollowUserEntity userFollowUserEntity) {
        userFollowUserEntityRepository.save(userFollowUserEntity);
        return 0;
    }

    @Override
    public int likePost(int cid) {
        System.out.println(cid);
        postEntityRepository.addLikeNum(cid);
        return 0;
    }

    @Override
    public int reviewPost(int cid) {

        return 0;
    }

    @Override
    public int cancelFollowZone(int uid,int zid) {
        System.out.println(uid);
        userFollowZoneEntityRepository.deleteByUserIdAndZoneId(uid,zid);
        return 0;
    }

    @Override
    public int cancelCollectPost(int uid,int cid) {
        userCollectionEntityRepository.deleteByUidAndCid(uid,cid);
        return 0;
    }

    @Override
    public int cancelFollowUser(int uid1,int uid2) {
        userFollowUserEntityRepository.deleteByUsersId(uid1,uid2);
        return 0;
    }


}
