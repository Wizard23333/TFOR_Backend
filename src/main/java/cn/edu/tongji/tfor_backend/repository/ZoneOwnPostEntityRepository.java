package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.ZoneOwnPostEntity;
import cn.edu.tongji.tfor_backend.model.ZoneOwnPostEntityPK;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ZoneOwnPostEntityRepository extends JpaRepository<ZoneOwnPostEntity, ZoneOwnPostEntityPK> {

    List<ZoneOwnPostEntity> findByZoneId(Integer zoneId);
}