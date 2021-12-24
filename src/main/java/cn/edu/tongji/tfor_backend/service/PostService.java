package cn.edu.tongji.tfor_backend.service;

import cn.edu.tongji.tfor_backend.model.AdvertisementEntity;
import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.model.ZoneOwnPostEntity;
import org.apache.coyote.Response;

public interface PostService {
    int postContent(PostEntity postEntity);
    int enterZone(ZoneOwnPostEntity zoneOwnPostEntity);
    int postAdvertisement(AdvertisementEntity advertisementEntity);
    int postComment(CommentEntity commentEntity);
    int deleteContent(int pid);
    int deleteAdvertisement(int aid);
    int deleteComment(int cid);
}
