package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntityPK;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;
import java.util.List;

public interface UserFollowZoneEntityRepository extends JpaRepository<UserFollowZoneEntity, UserFollowZoneEntityPK> {

    @Transactional
    @Modifying
    @Query(value ="delete from user_follow_zone where user_id=:userId and zone_id=:zoneId",nativeQuery = true)
    void deleteByUserIdAndZoneId(@Param("userId") Integer userId,@Param("zoneId") Integer zoneId);

    List<UserFollowZoneEntity> findByUserId(Integer userId);


}