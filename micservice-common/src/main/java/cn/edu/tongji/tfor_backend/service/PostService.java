package cn.edu.tongji.tfor_backend.service;

import cn.edu.tongji.tfor_backend.exceptionclass.PostException;
import cn.edu.tongji.tfor_backend.model.AdvertisementEntity;
import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.model.ZoneOwnPostEntity;

import java.util.List;

public interface PostService {
    int postContent(PostEntity postEntity) throws PostException;
    int enterZone(ZoneOwnPostEntity zoneOwnPostEntity);
    int postAdvertisement(AdvertisementEntity advertisementEntity);
    int postComment(CommentEntity commentEntity) throws PostException;
    int deleteContent(String pid);
    int deleteAdvertisement(Integer aid);
    int deleteComment(String cid);
    PostEntity getByPostId(String postId);
    List<PostEntity> getPostListByIdList(List<String> idList);
    List<CommentEntity> getCommentOfPost(String postId);
    void reportPost(String post_id);
    void reportComment(String comment_id);
}
