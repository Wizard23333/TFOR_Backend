package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.UserFollowUserEntity;
import cn.edu.tongji.tfor_backend.model.UserFollowUserEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFollowUserEntityRepository extends JpaRepository<UserFollowUserEntity, UserFollowUserEntityPK> {
}