package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_TEMP_TABLE_INFO", schema = "information_schema", catalog = "")
public class InnodbTempTableInfoEntity {
    private Object tableId;
    private String name;
    private Object nCols;
    private Object space;

    @Basic
    @Column(name = "TABLE_ID")
    public Object getTableId() {
        return tableId;
    }

    public void setTableId(Object tableId) {
        this.tableId = tableId;
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
    @Column(name = "N_COLS")
    public Object getnCols() {
        return nCols;
    }

    public void setnCols(Object nCols) {
        this.nCols = nCols;
    }

    @Basic
    @Column(name = "SPACE")
    public Object getSpace() {
        return space;
    }

    public void setSpace(Object space) {
        this.space = space;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbTempTableInfoEntity that = (InnodbTempTableInfoEntity) o;

        if (tableId != null ? !tableId.equals(that.tableId) : that.tableId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nCols != null ? !nCols.equals(that.nCols) : that.nCols != null) return false;
        if (space != null ? !space.equals(that.space) : that.space != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableId != null ? tableId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nCols != null ? nCols.hashCode() : 0);
        result = 31 * result + (space != null ? space.hashCode() : 0);
        return result;
    }
}
