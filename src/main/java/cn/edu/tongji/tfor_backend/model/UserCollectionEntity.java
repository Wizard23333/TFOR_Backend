package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;

@Entity
@Table(name = "user_collection", schema = "seDB", catalog = "")
@IdClass(UserCollectionEntityPK.class)
public class UserCollectionEntity {
    private int userId;
    private int contentId;

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
    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserCollectionEntity that = (UserCollectionEntity) o;

        if (userId != that.userId) return false;
        if (contentId != that.contentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + contentId;
        return result;
    }
}
