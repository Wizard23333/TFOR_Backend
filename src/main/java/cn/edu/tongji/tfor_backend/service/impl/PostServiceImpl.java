package cn.edu.tongji.tfor_backend.service.impl;
import cn.edu.tongji.tfor_backend.enums.PostLabel;
import cn.edu.tongji.tfor_backend.enums.PostState;
import cn.edu.tongji.tfor_backend.exceptionclass.PostException;
import cn.edu.tongji.tfor_backend.model.*;
import cn.edu.tongji.tfor_backend.repository.AdvertisementEntityRepository;
import cn.edu.tongji.tfor_backend.repository.CommentEntityRepository;
import cn.edu.tongji.tfor_backend.repository.PostEntityRepository;
import cn.edu.tongji.tfor_backend.repository.ZoneOwnPostEntityRepository;
import cn.edu.tongji.tfor_backend.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Resource
    PostEntityRepository postEntityRepository;

    @Resource
    AdvertisementEntityRepository advertisementEntityRepository;

    @Resource
    CommentEntityRepository commentEntityRepository;

    @Resource
    ZoneOwnPostEntityRepository zoneOwnPostEntityRepository;

    @Override
    public int postContent(PostEntity p) throws PostException {
        PostEntity newPost = new PostEntity();
        newPost.setUserId(p.getUserId());
        newPost.setLikeNum(0);
        newPost.setCommentNum(0);
        Timestamp now= new Timestamp(System.currentTimeMillis());//get the current system time
        newPost.setLastEditTime(now);
        newPost.setText(p.getText());
        newPost.setPicture(p.getPicture());
        newPost.setReportNum(p.getReportNum());
        PostState postState = PostState.NotReviewed;
        PostLabel postLabel = PostLabel.Normal;
        newPost.setReviewState(postState.toString());
        newPost.setLabel(postLabel.toString());
        newPost.setPostTitle(p.getPostTitle());
        newPost.setVideo(p.getVideo());
        newPost.setContentId(p.getContentId());
        if(postEntityRepository.isPresent(p.getContentId())!=0) {
            PostException exception = new PostException("post contentId already exists");
            throw exception;
        }
        postEntityRepository.save(newPost);

        return 0;
    }

    @Override
    public int enterZone(ZoneOwnPostEntity zoneOwnPostEntity) {
        zoneOwnPostEntityRepository.save(zoneOwnPostEntity);
        return 0;
    }

    @Override
    public int postAdvertisement(AdvertisementEntity a) {
        AdvertisementEntity newAdver = new AdvertisementEntity();

        newAdver.setAdmId(a.getAdmId());
        Timestamp now= new Timestamp(System.currentTimeMillis());//get the current system time
        newAdver.setLastEditTime(now);
        newAdver.setPostTitle(a.getPostTitle());
        newAdver.setVideo(a.getVideo());

        advertisementEntityRepository.save(newAdver);

        return 0;
    }

    @Override
    public int postComment(CommentEntity c) throws PostException {
        CommentEntity newComment = new CommentEntity();

        newComment.setUserId(c.getUserId());
        newComment.setLikeNum(0);
        newComment.setCommentNum(0);
        Timestamp now= new Timestamp(System.currentTimeMillis());//get the current system time
        newComment.setLastEditTime(now);
        newComment.setText(c.getText());
        newComment.setPicture(c.getPicture());
        newComment.setReportNum(0);
        newComment.setReviewState(PostState.NotReviewed.toString());
        newComment.setLabel(PostLabel.Normal.toString());
        newComment.setFatherContentId(c.getFatherContentId());
        newComment.setFatherType(c.getFatherType());
        if (c.getFatherType()==1) {
            if (postEntityRepository.isPresent(c.getFatherContentId())==0) {
                PostException e = new PostException("Father(post) content Id not exists");
                throw e;
            }
        }
        else if(c.getFatherType()==0) {
            if (commentEntityRepository.isPresent(c.getFatherContentId())==0) {
                PostException e = new PostException("Father(comment) content Id not exists");
                throw e;
            }
        }
        else {
            PostException e = new PostException("Invalid father type");
            throw e;
        }
        newComment.setContentId(c.getContentId());
        commentEntityRepository.save(newComment);
        return 0;
    }

    @Override
    @Transactional
    public int deleteContent(String contentId) {
        commentEntityRepository.deleteCommentOfPost(contentId);
        postEntityRepository.delete(postEntityRepository.findByContentId(contentId));
        zoneOwnPostEntityRepository.deleteByPostId(contentId);
        return 0;
    }

    @Override
    public int deleteAdvertisement(Integer contentId) {
        advertisementEntityRepository.delete(advertisementEntityRepository.getById(contentId));
        return 0;
    }

    @Override
    @Transactional
    public int deleteComment(String contentId) {
        commentEntityRepository.deleteCommentOfComment(contentId);
        commentEntityRepository.deleteByContentId(contentId);
        return 0;
    }

    @Override
    public PostEntity getByPostId(String postId) {
        return postEntityRepository.findByContentId(String.valueOf(postId));
    }

    @Override
    public List<PostEntity> getPostListByIdList(List<String> idList) {
        List<PostEntity> postEntityList = new ArrayList<>();
        for(String item : idList) {
            postEntityList.add(this.getByPostId(item));
        }
        return postEntityList;
    }

    public List<CommentEntity> getCommentOfPost(String postId) {
        return commentEntityRepository.getCommentOfPost(postId);
    }

    public void reportPost(String post_id) {
        PostEntity p = postEntityRepository.findByContentId(post_id);
        p.setReportNum(p.getReportNum()+1);
        p.setLabel(PostLabel.Reported.toString());
        postEntityRepository.save(p);
    }

    public void reportComment(String comment_id) {
        CommentEntity c = commentEntityRepository.findByContentId(comment_id);
        c.setReportNum(c.getReportNum()+1);
        c.setLabel(PostLabel.Reported.toString());
        commentEntityRepository.save(c);
    }
}
