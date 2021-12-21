package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.UserFollowUserEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowUserEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface UserFollowUserEntityRepository extends JpaRepository<UserFollowUserEntity, UserFollowUserEntityPK> {
    @Transactional
    @Modifying
    @Query(value = "delete from user_follow_user where user_following_id=:uid1 and user_followed_id=:uid2",nativeQuery = true)
    void deleteByUsersId(@Param("uid1") int uid1,@Param("uid2") int uid2);
}