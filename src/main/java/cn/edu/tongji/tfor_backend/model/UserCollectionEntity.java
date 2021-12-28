package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_collection", schema = "seDB", catalog = "")
@IdClass(UserCollectionEntityPK.class)
public class UserCollectionEntity {
    private int userId;
    private String contentId;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "content_id")
    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCollectionEntity that = (UserCollectionEntity) o;
        return userId == that.userId && Objects.equals(contentId, that.contentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, contentId);
    }
}
