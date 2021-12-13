package cn.edu.tongji.tfor_backend.service;

import cn.edu.tongji.tfor_backend.model.UserEntity;


public interface UserInfoService {

    boolean existById(int uid);

    String getPwdById(int uid);

    void createUserByObject(UserEntity newUser);

    boolean loginByPwd(int uid, String pwd);

    void changeUserName(int uid, String userName);

    void changeUserGender(int uid, String userGender);

    void changeUserImage(int uid, String userImage);

    void changeEmail(int uid, String newEmail);

    void changePhoneNbr(int uid, String newTelNbr);

}
