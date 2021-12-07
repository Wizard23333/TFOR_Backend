package cn.edu.tongji.tfor_backend.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class UserFollowUserEntityPK implements Serializable {
    private int userFollowingId;
    private int userFollowedId;

    @Column(name = "user_following_id")
    @Id
    public int getUserFollowingId() {
        return userFollowingId;
    }

    public void setUserFollowingId(int userFollowingId) {
        this.userFollowingId = userFollowingId;
    }

    @Column(name = "user_followed_id")
    @Id
    public int getUserFollowedId() {
        return userFollowedId;
    }

    public void setUserFollowedId(int userFollowedId) {
        this.userFollowedId = userFollowedId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserFollowUserEntityPK that = (UserFollowUserEntityPK) o;

        if (userFollowingId != that.userFollowingId) return false;
        if (userFollowedId != that.userFollowedId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userFollowingId;
        result = 31 * result + userFollowedId;
        return result;
    }
}
