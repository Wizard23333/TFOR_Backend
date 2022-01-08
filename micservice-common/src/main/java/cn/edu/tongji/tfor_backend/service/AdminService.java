package cn.edu.tongji.tfor_backend.service;

import cn.edu.tongji.tfor_backend.exceptionclass.AdminException;
import cn.edu.tongji.tfor_backend.model.CommentEntity;
import cn.edu.tongji.tfor_backend.model.PostEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<PostEntity> getReportedPostList(int reportNum);
    List<CommentEntity> getReportedCommentList(int reportNum);
    List<PostEntity> getReviewedPostList();
    List<CommentEntity> getReviewedCommentList();
    void setPostState(String contentId, int label) throws AdminException;
    void setCommentState(String contentId, int label) throws AdminException;
}
