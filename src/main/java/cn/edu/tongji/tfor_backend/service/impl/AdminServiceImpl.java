package cn.edu.tongji.tfor_backend.service.impl;

import cn.edu.tongji.tfor_backend.enums.PostLabel;
import cn.edu.tongji.tfor_backend.enums.PostState;
import cn.edu.tongji.tfor_backend.exceptionclass.AdminException;
import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import cn.edu.tongji.tfor_backend.repository.CommentEntityRepository;
import cn.edu.tongji.tfor_backend.repository.PostEntityRepository;
import cn.edu.tongji.tfor_backend.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    PostEntityRepository postEntityRepository;

    @Resource
    CommentEntityRepository commentEntityRepository;

    public List<PostEntity> getReportedPostList(int reportNum) {
        return postEntityRepository.getReportedPostList(reportNum);
    }
    public List<CommentEntity> getReportedCommentList(int reportNum) {
        return commentEntityRepository.getReportedCommentList(reportNum);
    }
    public List<PostEntity> getReviewedPostList() {
        return postEntityRepository.getReviewedPostList();
    }
    public List<CommentEntity> getReviewedCommentList() {
        return commentEntityRepository.getReviewedCommentList();
    }

    public void setPostState(String contentId, int label) throws AdminException {
        if(!postEntityRepository.existsByContentId(contentId)) {
            throw new AdminException("Invalid contentId");
        }
        PostEntity p = postEntityRepository.findByContentId(contentId);
        if (label==1) {
            p.setLabel(PostLabel.Normal.toString());
        }
        else if(label==2) {
            p.setLabel(PostLabel.NotNormal.toString());
        }
        else if(label==3) {
            p.setLabel(PostLabel.FakeNews.toString());
        }
        else if(label==4) {
            p.setLabel(PostLabel.EighteenPlus.toString());
        }
        else {
            AdminException e = new AdminException("Invalid label type");
            throw e;
        }
        p.setReviewState(PostState.Reviewed.toString());
        postEntityRepository.save(p);
    }

    public void setCommentState(String contentId, int label) throws AdminException {
        CommentEntity p = commentEntityRepository.findByContentId(contentId);
        System.out.println(p);
        if (label==1) {
            p.setLabel(PostLabel.Normal.toString());
        }
        else if(label==2) {
            p.setLabel(PostLabel.NotNormal.toString());
        }
        else if(label==3) {
            p.setLabel(PostLabel.FakeNews.toString());
        }
        else if(label==4) {
            p.setLabel(PostLabel.EighteenPlus.toString());
        }
        else {
            AdminException e = new AdminException("Invalid label type");
            throw e;
        }
        p.setReviewState(PostState.Reviewed.toString());
        commentEntityRepository.save(p);
    }
}
