package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.model.UserEntity;
import cn.edu.tongji.tfor_backend.repository.UserEntityRepository;
import cn.edu.tongji.tfor_backend.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    UserEntityRepository userEntityRepository;

    @Override
    public void createUserByObject(UserEntity newUser){
        userEntityRepository.save(newUser);
    }

    @Override
    public String loginByPwd(int uid, String pwd){
        if(userEntityRepository.existsById(uid)){
            //返回token
            return "1";
        }
        return "0";
    }

    @Override
    public String loginByEmail(String email){
        if (userEntityRepository.ifExistsByEmail(email)!=0){
            return "1";
        }
        return "0";
    }

    @Override
    public String loginByTel(String tel){
        if (userEntityRepository.ifExistsByTel(tel)!=0){
            return "1";
        }
        return "0";
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
