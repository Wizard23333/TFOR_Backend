package cn.edu.tongji.tfor_backend.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ZoneOwnPostEntityPK implements Serializable {
    private int zoneId;
    private int contentId;

    @Column(name = "zone_id")
    @Id
    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    @Column(name = "content_id")
    @Id
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

        ZoneOwnPostEntityPK that = (ZoneOwnPostEntityPK) o;

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
