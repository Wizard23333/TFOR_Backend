package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;

@Entity
@Table(name = "zone_own_post", schema = "seDB", catalog = "")
@IdClass(ZoneOwnPostEntityPK.class)
public class ZoneOwnPostEntity {
    private int zoneId;
    private int contentId;

    @Id
    @Column(name = "zone_id")
    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
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

        ZoneOwnPostEntity that = (ZoneOwnPostEntity) o;

        if (zoneId != that.zoneId) return false;
        if (contentId != that.contentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zoneId;
        result = 31 * result + contentId;
        return result;
    }
}
