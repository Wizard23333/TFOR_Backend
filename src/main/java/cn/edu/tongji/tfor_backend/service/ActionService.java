package cn.edu.tongji.tfor_backend.service;

import cn.edu.tongji.tfor_backend.model.UserCollectionEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowUserEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntity;
import org.springframework.http.HttpStatus;

public interface ActionService {

    int followZone(UserFollowZoneEntity userFollowZoneEntity);

    int collectPost(UserCollectionEntity userCollectionEntity);

    int followUser(UserFollowUserEntity userFollowUserEntity);

    int cancelFollowZone(int uid,int zid);

    int cancelCollectPost(int uid,int cid);

    int cancelFollowUser(int uid1,int uid2);
}
