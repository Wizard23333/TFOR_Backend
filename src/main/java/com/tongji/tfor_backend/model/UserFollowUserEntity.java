package com.tongji.tfor_backend.model;

import javax.persistence.*;

@Entity
@Table(name = "user_follow_user", schema = "seDB", catalog = "")
@IdClass(UserFollowUserEntityPK.class)
public class UserFollowUserEntity {
    private int userFollowingId;
    private int userFollowedId;

    @Id
    @Column(name = "user_following_id")
    public int getUserFollowingId() {
        return userFollowingId;
    }

    public void setUserFollowingId(int userFollowingId) {
        this.userFollowingId = userFollowingId;
    }

    @Id
    @Column(name = "user_followed_id")
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

        UserFollowUserEntity that = (UserFollowUserEntity) o;

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
