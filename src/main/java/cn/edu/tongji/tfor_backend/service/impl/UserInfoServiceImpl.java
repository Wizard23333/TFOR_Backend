package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.model.UserEntity;
import cn.edu.tongji.tfor_backend.repository.PostEntityRepository;
import cn.edu.tongji.tfor_backend.repository.UserCollectionEntityRepository;
import cn.edu.tongji.tfor_backend.repository.UserEntityRepository;
import cn.edu.tongji.tfor_backend.repository.UserFollowUserEntityRepository;
import cn.edu.tongji.tfor_backend.service.PostService;
import cn.edu.tongji.tfor_backend.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    PostService postService;

    @Resource
    UserEntityRepository userEntityRepository;

    @Resource
    UserFollowUserEntityRepository userFollowUserEntityRepository;

    @Resource
    UserCollectionEntityRepository userCollectionEntityRepository;

    @Resource
    PostEntityRepository postEntityRepository;

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

    @Override
    public UserEntity getUserInfoByUserId(Integer userId) {
        UserEntity userEntity = new UserEntity();
        userEntity = userEntityRepository.findByUserId(userId);
        if (userEntity != null){
            userEntity.setUserPwd("null"); // do not pass the pwd to the fronter
            userEntity.setUserEmail("xx.com");
            userEntity.setUserTel("00000");
        }
        return  userEntity;
    }

    // 获取敏感信息需要认证
    @Override
    public UserEntity getUserInfoByUserIdWithAuth(Integer userId) {
        UserEntity userEntity = new UserEntity();
        userEntity = userEntityRepository.findByUserId(userId);
        return  userEntity;
    }

    @Override
    public Map<String, Integer> getUserRelationInfoByUserId(Integer userId) {
        if (userEntityRepository.findByUserId(userId) == null) {
            return null;
        }
        Map<String, Integer> info = new HashMap<>();
        info.put("followingNum", userFollowUserEntityRepository.countFollowingNumByUserId(userId));
        info.put("followedNum", userFollowUserEntityRepository.countFollowedNumByUserId(userId));
        info.put("postNum", postEntityRepository.countPostNumByUserId(userId));
        info.put("likeNum", postEntityRepository.sumLikeNumByUserId(userId));
        return info;
    }

    @Override
    public List<UserEntity> getUserFollowingListByUserId(Integer userId) {
        if (userEntityRepository.findByUserId(userId) == null) {
            return null;
        }
        List<Integer> followedIdList = userFollowUserEntityRepository.getUserFollowedIdByUserId(userId);
        List<UserEntity> userList = new ArrayList<>();
        for(Integer item : followedIdList) {
            System.out.println(item);
            userList.add(this.getUserInfoByUserId(item)); // 调用自己的方法
        }
        return userList;
    }

    @Override
    public List<PostEntity> getUserCollectionPostByUserId(Integer userId) {
        if (userEntityRepository.findByUserId(userId) == null) {
            return null;
        }
        List<Integer> contentIdList = userCollectionEntityRepository.findContentIdByUserId(userId);
        return postService.getPostListByIdList(contentIdList); // 调用另一个的service的接口
    }

}
