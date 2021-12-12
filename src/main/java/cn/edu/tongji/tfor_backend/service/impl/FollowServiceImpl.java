package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.model.UserFollowZoneEntity;
import cn.edu.tongji.tfor_backend.repository.UserFollowZoneEntityRepository;
import cn.edu.tongji.tfor_backend.service.ActionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class FollowServiceImpl implements ActionService {
    @Resource
    UserFollowZoneEntityRepository userFollowZoneEntityRepository;

    @Override
    public int followZone(UserFollowZoneEntity userFollowZoneEntity){
        userFollowZoneEntityRepository.save(userFollowZoneEntity);
        return 0;
    }
}
