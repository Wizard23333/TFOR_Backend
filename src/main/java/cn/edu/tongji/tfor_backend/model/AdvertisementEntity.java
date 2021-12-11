package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "advertisement", schema = "seDB", catalog = "")
public class AdvertisementEntity {
    private int contentId;
    private int admId;
    private Timestamp lastEditTime;
    private byte[] picture;
    private String postTitle;
    private byte[] video;

    @Id
    @Column(name = "content_id")
    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "adm_id")
    public int getAdmId() {
        return admId;
    }

    public void setAdmId(int admId) {
        this.admId = admId;
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
    @Column(name = "picture")
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
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
        AdvertisementEntity that = (AdvertisementEntity) o;
        return contentId == that.contentId && admId == that.admId && Objects.equals(lastEditTime, that.lastEditTime) && Arrays.equals(picture, that.picture) && Objects.equals(postTitle, that.postTitle) && Arrays.equals(video, that.video);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(contentId, admId, lastEditTime, postTitle);
        result = 31 * result + Arrays.hashCode(picture);
        result = 31 * result + Arrays.hashCode(video);
        return result;
    }
}
