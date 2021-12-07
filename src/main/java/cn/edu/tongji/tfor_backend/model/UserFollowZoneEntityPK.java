package cn.edu.tongji.tfor_backend.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class UserFollowZoneEntityPK implements Serializable {
    private int userId;
    private int zoneId;

    @Column(name = "user_id")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "zone_id")
    @Id
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

        UserFollowZoneEntityPK that = (UserFollowZoneEntityPK) o;

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
