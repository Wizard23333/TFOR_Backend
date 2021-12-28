package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "post", schema = "seDB", catalog = "")
public class PostEntity {
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
    private String postTitle;
    private byte[] video;

    @Id
    @Column(name = "content_id")
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
    @Column(name = "post_title")
    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    @Basic
    @Column(name = "video")
    public byte[] getVideo() {
        return video;
    }

    public void setVideo(byte[] video) {
        this.video = video;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostEntity that = (PostEntity) o;
        return userId == that.userId && likeNum == that.likeNum && commentNum == that.commentNum && reportNum == that.reportNum && Objects.equals(contentId, that.contentId) && Objects.equals(lastEditTime, that.lastEditTime) && Objects.equals(text, that.text) && Arrays.equals(picture, that.picture) && Objects.equals(reviewState, that.reviewState) && Objects.equals(label, that.label) && Objects.equals(postTitle, that.postTitle) && Arrays.equals(video, that.video);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(contentId, userId, likeNum, commentNum, lastEditTime, text, reportNum, reviewState, label, postTitle);
        result = 31 * result + Arrays.hashCode(picture);
        result = 31 * result + Arrays.hashCode(video);
        return result;
    }
}
