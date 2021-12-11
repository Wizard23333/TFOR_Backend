package cn.edu.tongji.tfor_backend.service;

import cn.edu.tongji.tfor_backend.model.AdvertisementEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import org.apache.coyote.Response;

public interface PostService {
    int postContent(PostEntity postEntity);
    int postAdvertisement(AdvertisementEntity advertisementEntity);
}
