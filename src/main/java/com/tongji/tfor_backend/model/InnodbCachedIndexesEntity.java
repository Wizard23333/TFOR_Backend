package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_CACHED_INDEXES", schema = "information_schema", catalog = "")
public class InnodbCachedIndexesEntity {
    private Object spaceId;
    private Object indexId;
    private Object nCachedPages;

    @Basic
    @Column(name = "SPACE_ID")
    public Object getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Object spaceId) {
        this.spaceId = spaceId;
    }

    @Basic
    @Column(name = "INDEX_ID")
    public Object getIndexId() {
        return indexId;
    }

    public void setIndexId(Object indexId) {
        this.indexId = indexId;
    }

    @Basic
    @Column(name = "N_CACHED_PAGES")
    public Object getnCachedPages() {
        return nCachedPages;
    }

    public void setnCachedPages(Object nCachedPages) {
        this.nCachedPages = nCachedPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbCachedIndexesEntity that = (InnodbCachedIndexesEntity) o;

        if (spaceId != null ? !spaceId.equals(that.spaceId) : that.spaceId != null) return false;
        if (indexId != null ? !indexId.equals(that.indexId) : that.indexId != null) return false;
        if (nCachedPages != null ? !nCachedPages.equals(that.nCachedPages) : that.nCachedPages != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = spaceId != null ? spaceId.hashCode() : 0;
        result = 31 * result + (indexId != null ? indexId.hashCode() : 0);
        result = 31 * result + (nCachedPages != null ? nCachedPages.hashCode() : 0);
        return result;
    }
}
