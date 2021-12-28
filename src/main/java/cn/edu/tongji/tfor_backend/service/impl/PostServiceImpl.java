package cn.edu.tongji.tfor_backend.service.impl;
import cn.edu.tongji.tfor_backend.enums.PostLabel;
import cn.edu.tongji.tfor_backend.enums.PostState;
import cn.edu.tongji.tfor_backend.model.*;
import cn.edu.tongji.tfor_backend.repository.AdvertisementEntityRepository;
import cn.edu.tongji.tfor_backend.repository.CommentEntityRepository;
import cn.edu.tongji.tfor_backend.repository.PostEntityRepository;
import cn.edu.tongji.tfor_backend.repository.ZoneOwnPostEntityRepository;
import cn.edu.tongji.tfor_backend.service.PostService;
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
    public int postContent(PostEntity p) {
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
        newPost.setLikeNum(0);
        newPost.setCommentNum(0);
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
        newAdver.setPicture(a.getPicture());
        newAdver.setPostTitle(a.getPostTitle());
        newAdver.setVideo(a.getVideo());

        advertisementEntityRepository.save(newAdver);

        return 0;
    }

    @Override
    public int postComment(CommentEntity c) {
        CommentEntity newComment = new CommentEntity();

        newComment.setUserId(c.getUserId());
        newComment.setLikeNum(0);
        newComment.setCommentNum(0);
        Timestamp now= new Timestamp(System.currentTimeMillis());//get the current system time
        newComment.setLastEditTime(now);
        newComment.setText(c.getText());
        newComment.setPicture(c.getPicture());
        newComment.setReportNum(0);
        newComment.setReviewState("Not Reviewed");
        newComment.setLabel("Normal");
        newComment.setFatherContentId(c.getFatherContentId());
        newComment.setFatherType(c.getFatherType());
        commentEntityRepository.save(newComment);
        return 0;
    }

    @Override
    @Transactional
    public int deleteContent(int contentId) {
        commentEntityRepository.deleteCommentOfPost(contentId);
        postEntityRepository.delete(postEntityRepository.getById(contentId));
        zoneOwnPostEntityRepository.deleteByPostId(contentId);
        return 0;
    }

    @Override
    public int deleteAdvertisement(int contentId) {
        advertisementEntityRepository.delete(advertisementEntityRepository.getById(contentId));
        return 0;
    }

    @Override
    @Transactional
    public int deleteComment(int contentId) {
        commentEntityRepository.deleteCommentOfComment(contentId);
        commentEntityRepository.delete(commentEntityRepository.getById(contentId));
        return 0;
    }

    @Override
    public PostEntity getByPostId(Integer postId) {
        return postEntityRepository.findByContentId(String.valueOf(postId));
    }

    @Override
    public List<PostEntity> getPostListByIdList(List<Integer> idList) {
        List<PostEntity> postEntityList = new ArrayList<>();
        for(Integer item : idList) {
            postEntityList.add(this.getByPostId(item));
        }
        return postEntityList;
    }
}
