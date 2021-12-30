package cn.edu.tongji.tfor_backend.service;

import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.model.UserEntity;
import cn.edu.tongji.tfor_backend.model.ZoneEntity;

import java.util.List;
import java.util.Map;


public interface UserInfoService {

    boolean existById(int uid);

    String getPwdById(int uid);

    int getUidByTel(String tel);

    boolean createUserByObject(UserEntity newUser);

    boolean loginByPwd(int uid, String pwd);

    void changeUserName(int uid, String userName);

    void changeUserGender(int uid, String userGender);

    void changeUserImage(int uid, String userImage);

    void changeEmail(int uid, String newEmail);

    void changePhoneNbr(int uid, String newTelNbr);

    UserEntity getUserInfoByUserId(Integer userId);

    UserEntity getUserInfoByUserIdWithAuth(Integer userId);

    Map<String, Integer> getUserRelationInfoByUserId(Integer userId);

    List<UserEntity> getUserFollowingListByUserId(Integer userId);

    List<PostEntity> getUserCollectionPostByUserId(Integer userId);

    List<ZoneEntity> getFollowZoneListByUserId(Integer userId);

    // 通过userid查找发布的帖子
    List<PostEntity> getPostListByUserId(Integer userId);

}
