package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.ZoneEntity;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface ZoneEntityRepository extends JpaRepository<ZoneEntity, Integer>{

    @Query("from ZoneEntity") // simplified sql of (select * from ZoneEntity)
    List<ZoneEntity> findAllZones();


    // interface temporarily of no use ()
    public interface ZoneNameOnly {
        public String getZoneName();
    }

}