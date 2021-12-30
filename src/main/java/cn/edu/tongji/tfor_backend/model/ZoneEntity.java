package cn.edu.tongji.tfor_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "zone", schema = "seDB", catalog = "")
public class ZoneEntity {
    private int zoneId;
    private String zoneName;
    private int postNum;
    private int followerNum;

    @Id
    @Column(name = "zone_id")
    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    @Basic
    @Column(name = "zone_name")
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    @Basic
    @Column(name = "post_num")
    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    @Basic
    @Column(name = "follower_num")
    public int getFollowerNum() {
        return followerNum;
    }

    public void setFollowerNum(int followerNum) {
        this.followerNum = followerNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZoneEntity that = (ZoneEntity) o;

        if (zoneId != that.zoneId) return false;
        if (postNum != that.postNum) return false;
        if (followerNum != that.followerNum) return false;
        if (zoneName != null ? !zoneName.equals(that.zoneName) : that.zoneName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zoneId;
        result = 31 * result + (zoneName != null ? zoneName.hashCode() : 0);
        result = 31 * result + postNum;
        result = 31 * result + followerNum;
        return result;
    }
}
