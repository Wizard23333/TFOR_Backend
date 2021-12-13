package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.UserCollectionEntity;
import cn.edu.tongji.tfor_backend.model.UserCollectionEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCollectionEntityRepository extends JpaRepository<UserCollectionEntity, UserCollectionEntityPK> {
}