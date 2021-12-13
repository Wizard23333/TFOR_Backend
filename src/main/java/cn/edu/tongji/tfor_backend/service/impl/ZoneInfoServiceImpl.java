package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.model.ZoneEntity;
import cn.edu.tongji.tfor_backend.repository.ZoneEntityRepository;
import cn.edu.tongji.tfor_backend.service.ZoneInfoService;
import lombok.Data;
import lombok.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


// implements of the service interface
@Service
public class ZoneInfoServiceImpl implements ZoneInfoService {

    @Resource
    ZoneEntityRepository zoneEntityRepository;

    @Override
    public List<ZoneEntity> getAllZones() {
        return zoneEntityRepository.findAllZones(); // call the repository layer's function
    }

    @Override
    public List<PostSimpleInfo> getRecommend() {
        return null;
    }


}
