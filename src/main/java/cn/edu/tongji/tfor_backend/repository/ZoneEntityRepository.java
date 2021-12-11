package cn.edu.tongji.tfor_backend.repository;

import cn.edu.tongji.tfor_backend.model.ZoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ZoneEntityRepository extends JpaRepository<ZoneEntity, Integer>{

    @Query("from ZoneEntity") // simplified sql of (select * from ZoneEntity)
    List<ZoneEntity> findAllZones();


    // interface temporarily of no use ()
    public interface ZoneNameOnly {
        public String getZoneName();
    }

}