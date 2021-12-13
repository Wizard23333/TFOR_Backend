package cn.edu.tongji.tfor_backend.service;

import cn.edu.tongji.tfor_backend.model.UserEntity;


public interface UserInfoService {

    void createUserByObject(UserEntity newUser);

    String loginByPwd(int uid, String pwd);

    String loginByEmail(String email);

    String loginByTel(String tel);

    void changeUserName(int uid, String userName);

    void changeUserGender(int uid, String userGender);

    void changeUserImage(int uid, String userImage);

    void changeEmail(int uid, String newEmail);

    void changePhoneNbr(int uid, String newTelNbr);

}
