package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_COLUMNS", schema = "information_schema", catalog = "")
public class InnodbColumnsEntity {
    private Object tableId;
    private String name;
    private Object pos;
    private int mtype;
    private int prtype;
    private int len;
    private int hasDefault;
    private String defaultValue;

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
    @Column(name = "POS")
    public Object getPos() {
        return pos;
    }

    public void setPos(Object pos) {
        this.pos = pos;
    }

    @Basic
    @Column(name = "MTYPE")
    public int getMtype() {
        return mtype;
    }

    public void setMtype(int mtype) {
        this.mtype = mtype;
    }

    @Basic
    @Column(name = "PRTYPE")
    public int getPrtype() {
        return prtype;
    }

    public void setPrtype(int prtype) {
        this.prtype = prtype;
    }

    @Basic
    @Column(name = "LEN")
    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    @Basic
    @Column(name = "HAS_DEFAULT")
    public int getHasDefault() {
        return hasDefault;
    }

    public void setHasDefault(int hasDefault) {
        this.hasDefault = hasDefault;
    }

    @Basic
    @Column(name = "DEFAULT_VALUE")
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbColumnsEntity that = (InnodbColumnsEntity) o;

        if (mtype != that.mtype) return false;
        if (prtype != that.prtype) return false;
        if (len != that.len) return false;
        if (hasDefault != that.hasDefault) return false;
        if (tableId != null ? !tableId.equals(that.tableId) : that.tableId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pos != null ? !pos.equals(that.pos) : that.pos != null) return false;
        if (defaultValue != null ? !defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableId != null ? tableId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pos != null ? pos.hashCode() : 0);
        result = 31 * result + mtype;
        result = 31 * result + prtype;
        result = 31 * result + len;
        result = 31 * result + hasDefault;
        result = 31 * result + (defaultValue != null ? defaultValue.hashCode() : 0);
        return result;
    }
}
