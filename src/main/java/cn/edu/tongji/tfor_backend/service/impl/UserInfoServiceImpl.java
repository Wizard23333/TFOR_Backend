package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.model.UserCollectionEntityPK;
import cn.edu.tongji.tfor_backend.model.UserEntity;
import cn.edu.tongji.tfor_backend.model.ZoneEntity;
import cn.edu.tongji.tfor_backend.repository.*;
import cn.edu.tongji.tfor_backend.service.PostService;
import cn.edu.tongji.tfor_backend.service.UserInfoService;
import cn.edu.tongji.tfor_backend.service.ZoneInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.ZoneId;
import java.util.*;
import java.util.regex.Pattern;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    PostService postService;

    @Autowired
    ZoneInfoService zoneInfoService;

    @Resource
    UserEntityRepository userEntityRepository;

    @Resource
    UserFollowUserEntityRepository userFollowUserEntityRepository;

    @Resource
    UserCollectionEntityRepository userCollectionEntityRepository;

    @Resource
    UserFollowZoneEntityRepository userFollowZoneEntityRepository;

    @Resource
    PostEntityRepository postEntityRepository;

    private final String emailPattern = "^\\s*\\w+(?:\\.?[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";

    private final String telPattern = "^[1][3,4,5,7,8][0-9]{9}$";
    @Override
    public boolean createUserByObject(UserEntity newUser){
        if(newUser.getUserEmail() == null || !Pattern.matches(emailPattern, newUser.getUserEmail())) {
            return false;
        }
        if(newUser.getUserTel() == null || !Pattern.matches(telPattern, newUser.getUserTel())) {
            return false;
        }
        if(newUser.getUserGender() > 1 || newUser.getUserGender() < 0) {
            return false;
        }
        if(newUser.getUserName() == null || newUser.getUserPwd() == null) {
            return false;
        }
        if (userEntityRepository.ifExistsByTel(newUser.getUserTel())==0){
            userEntityRepository.save(newUser);
            return true;
        }
        return false;
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
    public int getUidByTel(String tel) {return userEntityRepository.getUidByTel(tel);}

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

    // 关注人员表
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

    // 收藏列表
    @Override
    public List<PostEntity> getUserCollectionPostByUserId(Integer userId) {
        if (userEntityRepository.findByUserId(userId) == null) {
            return null;
        }
        List<String> contentIdList = userCollectionEntityRepository.findContentIdByUserId(userId);
        return postService.getPostListByIdList(contentIdList); // 调用另一个的service的接口
    }

    // 关注分区表
    @Override
    public List<ZoneEntity> getFollowZoneListByUserId(Integer userId) {
        if (userEntityRepository.findByUserId(userId) == null) {
            return null;
        }
        List<Integer> zoneIdList = userFollowZoneEntityRepository.findZoneIdListByUserId(userId);
        return zoneInfoService.getZoneListByIdList(zoneIdList);
    }

    @Override
    public List<PostEntity> getPostListByUserId(Integer userId) {
        if (userEntityRepository.findByUserId(userId) == null) {
            return null;
        }
        return postEntityRepository.findByUserId(userId);
    }

    @Override
    public boolean checkIfCollected(int userId, String postId){
        UserCollectionEntityPK userCollectionEntityPK = new UserCollectionEntityPK();
        userCollectionEntityPK.setUserId(userId);
        userCollectionEntityPK.setContentId(postId);
        return userCollectionEntityRepository.existsById(userCollectionEntityPK);
    }

    @Override
    @Transactional
    public Long deleteUserByTel(String tel) {
        return userEntityRepository.deleteByUserTel(tel);
    }

}
