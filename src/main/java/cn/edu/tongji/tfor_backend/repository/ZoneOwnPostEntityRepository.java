package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.ZoneOwnPostEntity;
import cn.edu.tongji.tfor_backend.model.ZoneOwnPostEntityPK;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ZoneOwnPostEntityRepository extends JpaRepository<ZoneOwnPostEntity, ZoneOwnPostEntityPK> {
    List<ZoneOwnPostEntity> findByZoneId(Integer zoneId);


    @Query(value="delete z from zone_own_post z where z.content_id=postId", nativeQuery = true)
    @Modifying
    void deleteByPostId(@Param("postId") int postId);
}