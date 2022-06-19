package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.UserFollowUserEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowUserEntityPK;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserFollowUserEntityRepository extends JpaRepository<UserFollowUserEntity, UserFollowUserEntityPK> {
    @Transactional
    @Modifying
    @Query(value = "delete from user_follow_user where user_following_id=:uid1 and user_followed_id=:uid2",nativeQuery = true)
    void deleteByUsersId(@Param("uid1") int uid1,@Param("uid2") int uid2);

    // 计算关注人数和被关注人数
    @Query("select count(userFollowingId) from UserFollowUserEntity where userFollowingId = :userId")
    Integer countFollowingNumByUserId(@Param("userId") Integer userId);

    @Query("select count(userFollowedId) from UserFollowUserEntity where userFollowedId = :userId")
    Integer countFollowedNumByUserId(@Param("userId") Integer userId);

    @Query("select userFollowedId from UserFollowUserEntity where userFollowingId = :userId")
    List<Integer> getUserFollowedIdByUserId(@Param("userId") Integer userId);

    boolean existsByUserFollowingIdAndUserFollowedId(Integer followingId, Integer followedId);
}