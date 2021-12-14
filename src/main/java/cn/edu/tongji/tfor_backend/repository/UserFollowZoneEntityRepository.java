package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntityPK;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserFollowZoneEntityRepository extends JpaRepository<UserFollowZoneEntity, UserFollowZoneEntityPK> {

    List<UserFollowZoneEntity> findByUserId(Integer userId);
}