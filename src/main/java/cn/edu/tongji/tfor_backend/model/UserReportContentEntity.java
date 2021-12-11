package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_report_content", schema = "seDB", catalog = "")
@IdClass(UserReportContentEntityPK.class)
public class UserReportContentEntity {
    private int userId;
    private int commentId;
    private int postId;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "comment_id")
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Id
    @Column(name = "post_id")
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserReportContentEntity that = (UserReportContentEntity) o;
        return userId == that.userId && commentId == that.commentId && postId == that.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, commentId, postId);
    }
}
