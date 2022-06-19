package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {
    //获取用户密码
    @Query(value = "select user_pwd from user where user_id=:uid", nativeQuery = true)
    String getPwdById(@Param("uid") int uid);

    //通过邮箱获取用户id
    @Query(value = "select user_id from user where user_email=:email", nativeQuery = true)
    int getUidByEmail(@Param("email") String email);

    //通过电话获取用户id
    @Query(value = "select user_id from user where user_tel=:telNbr", nativeQuery = true)
    int getUidByTel(@Param("telNbr") String telNbr);

    //修改用户姓名
    @Modifying
    @Query(value = "update user set user_name=:newUserName where user_id=:uid", nativeQuery = true)
    void changeUserName(@Param("uid") int uid, @Param("newUserName") String newUserName);

    //修改用户性别
    @Modifying
    @Query(value = "update user set user_gender=:newUserGender where user_id=:uid", nativeQuery = true)
    void changeUserGender(@Param("uid") int uid, @Param("newUserGender") String newUserGender);

    //修改用户头像
    @Modifying
    @Query(value = "update user set user_image=:newUserImage where user_id=:uid", nativeQuery = true)
    void changeUserImage(@Param("uid") int uid, @Param("newUserImage") String newUserImage);

    //修改邮箱字段
    @Modifying
    @Query(value = "update user set user_email=:newEmail where user_id=:uid", nativeQuery = true)
    void changeEmail(@Param("uid") int uid, @Param("newEmail") String newEmail);

    //修改电话号码字段
    @Modifying
    @Query(value = "update user set user_tel=:tel_num where user_id=:uid", nativeQuery = true)
    void changePhoneNbr(@Param("uid") int uid, @Param("tel_num") String tel_num);

    //判断输入的邮箱是否存在
    @Query(value = "select count(*) from user where user_email=:newEmail", nativeQuery = true)
    int ifExistsByEmail(@Param("newEmail") String newEmail);

    //判断输入的手机号是否存在
    @Query(value = "select count(*) from user where user_tel=:newTelNbr", nativeQuery = true)
    int ifExistsByTel(@Param("newTelNbr") String newTelNbr);

    UserEntity findByUserId(Integer userId);

    boolean existsByUserId(Integer userId);

    Long deleteByUserTel(String userTel);

}