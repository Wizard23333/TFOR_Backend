package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_VIRTUAL", schema = "information_schema", catalog = "")
public class InnodbVirtualEntity {
    private Object tableId;
    private Object pos;
    private Object basePos;

    @Basic
    @Column(name = "TABLE_ID")
    public Object getTableId() {
        return tableId;
    }

    public void setTableId(Object tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "POS")
    public Object getPos() {
        return pos;
    }

    public void setPos(Object pos) {
        this.pos = pos;
    }

    @Basic
    @Column(name = "BASE_POS")
    public Object getBasePos() {
        return basePos;
    }

    public void setBasePos(Object basePos) {
        this.basePos = basePos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbVirtualEntity that = (InnodbVirtualEntity) o;

        if (tableId != null ? !tableId.equals(that.tableId) : that.tableId != null) return false;
        if (pos != null ? !pos.equals(that.pos) : that.pos != null) return false;
        if (basePos != null ? !basePos.equals(that.basePos) : that.basePos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableId != null ? tableId.hashCode() : 0;
        result = 31 * result + (pos != null ? pos.hashCode() : 0);
        result = 31 * result + (basePos != null ? basePos.hashCode() : 0);
        return result;
    }
}
