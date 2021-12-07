package com.tongji.tfor_backend.model;

import javax.persistence.*;

@Entity
@Table(name = "user_history", schema = "seDB", catalog = "")
public class UserHistoryEntity {
    private int historyId;
    private int userId;
    private int contentId;

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

        UserHistoryEntity that = (UserHistoryEntity) o;

        if (historyId != that.historyId) return false;
        if (userId != that.userId) return false;
        if (contentId != that.contentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = historyId;
        result = 31 * result + userId;
        result = 31 * result + contentId;
        return result;
    }
}
