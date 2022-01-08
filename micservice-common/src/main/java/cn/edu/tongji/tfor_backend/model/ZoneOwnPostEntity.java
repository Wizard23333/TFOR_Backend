package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "zone_own_post", schema = "seDB", catalog = "")
@IdClass(ZoneOwnPostEntityPK.class)
public class ZoneOwnPostEntity {
    private int zoneId;
    private String contentId;

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
        ZoneOwnPostEntity that = (ZoneOwnPostEntity) o;
        return zoneId == that.zoneId && Objects.equals(contentId, that.contentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, contentId);
    }
}
