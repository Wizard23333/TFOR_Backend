package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.model.UserEntity;
import cn.edu.tongji.tfor_backend.repository.UserEntityRepository;
import cn.edu.tongji.tfor_backend.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    UserEntityRepository userEntityRepository;

    @Override
    public void createUserByObject(UserEntity newUser){
        userEntityRepository.save(newUser);
    }

    //判断用户id是否存在
    @Override
    public boolean existById(int uid){
        return userEntityRepository.existsById(uid);
    }

    //通过用户id获取密码
    @Override
    public String getPwdById(int uid){
        return userEntityRepository.getPwdById(uid);
    }

    @Override
    public boolean loginByPwd(int uid, String pwd){
        //用户存在
        if (userEntityRepository.existsById(uid)){
            String realPwd = userEntityRepository.getPwdById(uid);
            return Objects.equals(pwd, realPwd);
        }
        return false;
    }

    @Override
    @Transactional
    public void changeUserName(int uid, String userName){
        if(userName!=null){
            userEntityRepository.changeUserName(uid, userName);
        }
    }

    @Override
    @Transactional
    public void changeUserGender(int uid, String userGender){
        if (userGender!=null){
            userEntityRepository.changeUserGender(uid, userGender);
        }
    }

    @Override
    @Transactional
    public void changeUserImage(int uid, String userImage){
        if (userImage!=null){
            userEntityRepository.changeUserImage(uid, userImage);
        }
    }

    @Override
    @Transactional
    public void changeEmail(int uid, String newEmail){
        //邮箱号未被使用
        if(userEntityRepository.ifExistsByEmail(newEmail)==0){
            userEntityRepository.changeEmail(uid, newEmail);
        }
    }

    @Override
    @Transactional
    public void changePhoneNbr(int uid, String newTelNbr){
        //邮箱号未被使用
        if(userEntityRepository.ifExistsByTel(newTelNbr)==0){
            userEntityRepository.changePhoneNbr(uid, newTelNbr);
        }
    }

}
