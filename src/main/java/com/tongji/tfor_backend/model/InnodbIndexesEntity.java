package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_INDEXES", schema = "information_schema", catalog = "")
public class InnodbIndexesEntity {
    private Object indexId;
    private String name;
    private Object tableId;
    private int type;
    private int nFields;
    private int pageNo;
    private int space;
    private int mergeThreshold;

    @Basic
    @Column(name = "INDEX_ID")
    public Object getIndexId() {
        return indexId;
    }

    public void setIndexId(Object indexId) {
        this.indexId = indexId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "TABLE_ID")
    public Object getTableId() {
        return tableId;
    }

    public void setTableId(Object tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "TYPE")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "N_FIELDS")
    public int getnFields() {
        return nFields;
    }

    public void setnFields(int nFields) {
        this.nFields = nFields;
    }

    @Basic
    @Column(name = "PAGE_NO")
    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Basic
    @Column(name = "SPACE")
    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    @Basic
    @Column(name = "MERGE_THRESHOLD")
    public int getMergeThreshold() {
        return mergeThreshold;
    }

    public void setMergeThreshold(int mergeThreshold) {
        this.mergeThreshold = mergeThreshold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbIndexesEntity that = (InnodbIndexesEntity) o;

        if (type != that.type) return false;
        if (nFields != that.nFields) return false;
        if (pageNo != that.pageNo) return false;
        if (space != that.space) return false;
        if (mergeThreshold != that.mergeThreshold) return false;
        if (indexId != null ? !indexId.equals(that.indexId) : that.indexId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (tableId != null ? !tableId.equals(that.tableId) : that.tableId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = indexId != null ? indexId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tableId != null ? tableId.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + nFields;
        result = 31 * result + pageNo;
        result = 31 * result + space;
        result = 31 * result + mergeThreshold;
        return result;
    }
}
