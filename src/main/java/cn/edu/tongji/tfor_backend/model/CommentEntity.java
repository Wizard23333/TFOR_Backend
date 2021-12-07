package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "comment", schema = "seDB", catalog = "")
public class CommentEntity {
    private int contentId;
    private int userId;
    private int likeNum;
    private int commentNum;
    private Timestamp lastEditTime;
    private String text;
    private byte[] picture;
    private int reportNum;
    private String reviewState;
    private String label;
    private int fatherContentId;
    private byte fatherType;

    @Id
    @Column(name = "content_id")
    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "like_num")
    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    @Basic
    @Column(name = "comment_num")
    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    @Basic
    @Column(name = "last_edit_time")
    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "picture")
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "report_num")
    public int getReportNum() {
        return reportNum;
    }

    public void setReportNum(int reportNum) {
        this.reportNum = reportNum;
    }

    @Basic
    @Column(name = "review_state")
    public String getReviewState() {
        return reviewState;
    }

    public void setReviewState(String reviewState) {
        this.reviewState = reviewState;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "father_content_id")
    public int getFatherContentId() {
        return fatherContentId;
    }

    public void setFatherContentId(int fatherContentId) {
        this.fatherContentId = fatherContentId;
    }

    @Basic
    @Column(name = "father_type")
    public byte getFatherType() {
        return fatherType;
    }

    public void setFatherType(byte fatherType) {
        this.fatherType = fatherType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (contentId != that.contentId) return false;
        if (userId != that.userId) return false;
        if (likeNum != that.likeNum) return false;
        if (commentNum != that.commentNum) return false;
        if (reportNum != that.reportNum) return false;
        if (fatherContentId != that.fatherContentId) return false;
        if (fatherType != that.fatherType) return false;
        if (lastEditTime != null ? !lastEditTime.equals(that.lastEditTime) : that.lastEditTime != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (!Arrays.equals(picture, that.picture)) return false;
        if (reviewState != null ? !reviewState.equals(that.reviewState) : that.reviewState != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contentId;
        result = 31 * result + userId;
        result = 31 * result + likeNum;
        result = 31 * result + commentNum;
        result = 31 * result + (lastEditTime != null ? lastEditTime.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(picture);
        result = 31 * result + reportNum;
        result = 31 * result + (reviewState != null ? reviewState.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + fatherContentId;
        result = 31 * result + (int) fatherType;
        return result;
    }
}
