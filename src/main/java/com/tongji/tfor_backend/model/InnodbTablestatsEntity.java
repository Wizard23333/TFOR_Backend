package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_TABLESTATS", schema = "information_schema", catalog = "")
public class InnodbTablestatsEntity {
    private Object tableId;
    private String name;
    private String statsInitialized;
    private Object numRows;
    private Object clustIndexSize;
    private Object otherIndexSize;
    private Object modifiedCounter;
    private Object autoinc;
    private int refCount;

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
    @Column(name = "STATS_INITIALIZED")
    public String getStatsInitialized() {
        return statsInitialized;
    }

    public void setStatsInitialized(String statsInitialized) {
        this.statsInitialized = statsInitialized;
    }

    @Basic
    @Column(name = "NUM_ROWS")
    public Object getNumRows() {
        return numRows;
    }

    public void setNumRows(Object numRows) {
        this.numRows = numRows;
    }

    @Basic
    @Column(name = "CLUST_INDEX_SIZE")
    public Object getClustIndexSize() {
        return clustIndexSize;
    }

    public void setClustIndexSize(Object clustIndexSize) {
        this.clustIndexSize = clustIndexSize;
    }

    @Basic
    @Column(name = "OTHER_INDEX_SIZE")
    public Object getOtherIndexSize() {
        return otherIndexSize;
    }

    public void setOtherIndexSize(Object otherIndexSize) {
        this.otherIndexSize = otherIndexSize;
    }

    @Basic
    @Column(name = "MODIFIED_COUNTER")
    public Object getModifiedCounter() {
        return modifiedCounter;
    }

    public void setModifiedCounter(Object modifiedCounter) {
        this.modifiedCounter = modifiedCounter;
    }

    @Basic
    @Column(name = "AUTOINC")
    public Object getAutoinc() {
        return autoinc;
    }

    public void setAutoinc(Object autoinc) {
        this.autoinc = autoinc;
    }

    @Basic
    @Column(name = "REF_COUNT")
    public int getRefCount() {
        return refCount;
    }

    public void setRefCount(int refCount) {
        this.refCount = refCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbTablestatsEntity that = (InnodbTablestatsEntity) o;

        if (refCount != that.refCount) return false;
        if (tableId != null ? !tableId.equals(that.tableId) : that.tableId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (statsInitialized != null ? !statsInitialized.equals(that.statsInitialized) : that.statsInitialized != null)
            return false;
        if (numRows != null ? !numRows.equals(that.numRows) : that.numRows != null) return false;
        if (clustIndexSize != null ? !clustIndexSize.equals(that.clustIndexSize) : that.clustIndexSize != null)
            return false;
        if (otherIndexSize != null ? !otherIndexSize.equals(that.otherIndexSize) : that.otherIndexSize != null)
            return false;
        if (modifiedCounter != null ? !modifiedCounter.equals(that.modifiedCounter) : that.modifiedCounter != null)
            return false;
        if (autoinc != null ? !autoinc.equals(that.autoinc) : that.autoinc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableId != null ? tableId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (statsInitialized != null ? statsInitialized.hashCode() : 0);
        result = 31 * result + (numRows != null ? numRows.hashCode() : 0);
        result = 31 * result + (clustIndexSize != null ? clustIndexSize.hashCode() : 0);
        result = 31 * result + (otherIndexSize != null ? otherIndexSize.hashCode() : 0);
        result = 31 * result + (modifiedCounter != null ? modifiedCounter.hashCode() : 0);
        result = 31 * result + (autoinc != null ? autoinc.hashCode() : 0);
        result = 31 * result + refCount;
        return result;
    }
}
