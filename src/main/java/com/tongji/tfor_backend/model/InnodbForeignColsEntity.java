package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_FOREIGN_COLS", schema = "information_schema", catalog = "")
public class InnodbForeignColsEntity {
    private String id;
    private String forColName;
    private String refColName;
    private Object pos;

    @Basic
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FOR_COL_NAME")
    public String getForColName() {
        return forColName;
    }

    public void setForColName(String forColName) {
        this.forColName = forColName;
    }

    @Basic
    @Column(name = "REF_COL_NAME")
    public String getRefColName() {
        return refColName;
    }

    public void setRefColName(String refColName) {
        this.refColName = refColName;
    }

    @Basic
    @Column(name = "POS")
    public Object getPos() {
        return pos;
    }

    public void setPos(Object pos) {
        this.pos = pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbForeignColsEntity that = (InnodbForeignColsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (forColName != null ? !forColName.equals(that.forColName) : that.forColName != null) return false;
        if (refColName != null ? !refColName.equals(that.refColName) : that.refColName != null) return false;
        if (pos != null ? !pos.equals(that.pos) : that.pos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (forColName != null ? forColName.hashCode() : 0);
        result = 31 * result + (refColName != null ? refColName.hashCode() : 0);
        result = 31 * result + (pos != null ? pos.hashCode() : 0);
        return result;
    }
}
