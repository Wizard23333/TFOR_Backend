package cn.edu.tongji.tfor_backend.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ZoneOwnPostEntityPK implements Serializable {
    private int zoneId;
    private String contentId;

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
        ZoneOwnPostEntityPK that = (ZoneOwnPostEntityPK) o;
        return zoneId == that.zoneId && Objects.equals(contentId, that.contentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, contentId);
    }
}
