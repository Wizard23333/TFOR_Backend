package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_history", schema = "seDB", catalog = "")
public class UserHistoryEntity {
    private int historyId;
    private int userId;
    private String contentId;

    @Id
    @Column(name = "history_id")
    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
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
        UserHistoryEntity that = (UserHistoryEntity) o;
        return historyId == that.historyId && userId == that.userId && Objects.equals(contentId, that.contentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historyId, userId, contentId);
    }
}
