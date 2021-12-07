package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;

@Entity
@Table(name = "user_follow_zone", schema = "seDB", catalog = "")
@IdClass(UserFollowZoneEntityPK.class)
public class UserFollowZoneEntity {
    private int userId;
    private int zoneId;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "zone_id")
    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserFollowZoneEntity that = (UserFollowZoneEntity) o;

        if (userId != that.userId) return false;
        if (zoneId != that.zoneId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + zoneId;
        return result;
    }
}
