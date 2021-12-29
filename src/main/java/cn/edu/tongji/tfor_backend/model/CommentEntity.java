package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "comment", schema = "seDB")
public class CommentEntity {
    private String contentId;
    private int userId;
    private int likeNum;
    private int commentNum;
    private Timestamp lastEditTime;
    private String text;
    private byte[] picture;
    private int reportNum;
    private String reviewState;
    private String label;
    private String fatherContentId;
    private byte fatherType;

    @Id
    @Column(name = "content_id", nullable = false, length = 255)
    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
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
    @Column(name = "like_num", nullable = false)
    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    @Basic
    @Column(name = "comment_num", nullable = false)
    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    @Basic
    @Column(name = "last_edit_time", nullable = false)
    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    @Basic
    @Column(name = "text", nullable = false, length = -1)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "picture", nullable = true)
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "report_num", nullable = false)
    public int getReportNum() {
        return reportNum;
    }

    public void setReportNum(int reportNum) {
        this.reportNum = reportNum;
    }

    @Basic
    @Column(name = "review_state", nullable = false, length = 255)
    public String getReviewState() {
        return reviewState;
    }

    public void setReviewState(String reviewState) {
        this.reviewState = reviewState;
    }

    @Basic
    @Column(name = "label", nullable = false, length = 255)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "father_content_id", nullable = false, length = 255)
    public String getFatherContentId() {
        return fatherContentId;
    }

    public void setFatherContentId(String fatherContentId) {
        this.fatherContentId = fatherContentId;
    }

    @Basic
    @Column(name = "father_type", nullable = false)
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
    public int hashCode(){
        return this.likeNum;
    }
}
