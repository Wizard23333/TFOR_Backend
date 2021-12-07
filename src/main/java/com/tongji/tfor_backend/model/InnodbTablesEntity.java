package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_TABLES", schema = "information_schema", catalog = "")
public class InnodbTablesEntity {
    private Object tableId;
    private String name;
    private int flag;
    private int nCols;
    private long space;
    private String rowFormat;
    private Object zipPageSize;
    private String spaceType;
    private int instantCols;

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
    @Column(name = "FLAG")
    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "N_COLS")
    public int getnCols() {
        return nCols;
    }

    public void setnCols(int nCols) {
        this.nCols = nCols;
    }

    @Basic
    @Column(name = "SPACE")
    public long getSpace() {
        return space;
    }

    public void setSpace(long space) {
        this.space = space;
    }

    @Basic
    @Column(name = "ROW_FORMAT")
    public String getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    @Basic
    @Column(name = "ZIP_PAGE_SIZE")
    public Object getZipPageSize() {
        return zipPageSize;
    }

    public void setZipPageSize(Object zipPageSize) {
        this.zipPageSize = zipPageSize;
    }

    @Basic
    @Column(name = "SPACE_TYPE")
    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    @Basic
    @Column(name = "INSTANT_COLS")
    public int getInstantCols() {
        return instantCols;
    }

    public void setInstantCols(int instantCols) {
        this.instantCols = instantCols;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbTablesEntity that = (InnodbTablesEntity) o;

        if (flag != that.flag) return false;
        if (nCols != that.nCols) return false;
        if (space != that.space) return false;
        if (instantCols != that.instantCols) return false;
        if (tableId != null ? !tableId.equals(that.tableId) : that.tableId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (rowFormat != null ? !rowFormat.equals(that.rowFormat) : that.rowFormat != null) return false;
        if (zipPageSize != null ? !zipPageSize.equals(that.zipPageSize) : that.zipPageSize != null) return false;
        if (spaceType != null ? !spaceType.equals(that.spaceType) : that.spaceType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableId != null ? tableId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + flag;
        result = 31 * result + nCols;
        result = 31 * result + (int) (space ^ (space >>> 32));
        result = 31 * result + (rowFormat != null ? rowFormat.hashCode() : 0);
        result = 31 * result + (zipPageSize != null ? zipPageSize.hashCode() : 0);
        result = 31 * result + (spaceType != null ? spaceType.hashCode() : 0);
        result = 31 * result + instantCols;
        return result;
    }
}
