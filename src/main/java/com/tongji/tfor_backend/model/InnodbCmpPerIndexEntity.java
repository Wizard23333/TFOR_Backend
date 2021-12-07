package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_CMP_PER_INDEX", schema = "information_schema", catalog = "")
public class InnodbCmpPerIndexEntity {
    private String databaseName;
    private String tableName;
    private String indexName;
    private int compressOps;
    private int compressOpsOk;
    private int compressTime;
    private int uncompressOps;
    private int uncompressTime;

    @Basic
    @Column(name = "database_name")
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Basic
    @Column(name = "table_name")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "index_name")
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Basic
    @Column(name = "compress_ops")
    public int getCompressOps() {
        return compressOps;
    }

    public void setCompressOps(int compressOps) {
        this.compressOps = compressOps;
    }

    @Basic
    @Column(name = "compress_ops_ok")
    public int getCompressOpsOk() {
        return compressOpsOk;
    }

    public void setCompressOpsOk(int compressOpsOk) {
        this.compressOpsOk = compressOpsOk;
    }

    @Basic
    @Column(name = "compress_time")
    public int getCompressTime() {
        return compressTime;
    }

    public void setCompressTime(int compressTime) {
        this.compressTime = compressTime;
    }

    @Basic
    @Column(name = "uncompress_ops")
    public int getUncompressOps() {
        return uncompressOps;
    }

    public void setUncompressOps(int uncompressOps) {
        this.uncompressOps = uncompressOps;
    }

    @Basic
    @Column(name = "uncompress_time")
    public int getUncompressTime() {
        return uncompressTime;
    }

    public void setUncompressTime(int uncompressTime) {
        this.uncompressTime = uncompressTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbCmpPerIndexEntity that = (InnodbCmpPerIndexEntity) o;

        if (compressOps != that.compressOps) return false;
        if (compressOpsOk != that.compressOpsOk) return false;
        if (compressTime != that.compressTime) return false;
        if (uncompressOps != that.uncompressOps) return false;
        if (uncompressTime != that.uncompressTime) return false;
        if (databaseName != null ? !databaseName.equals(that.databaseName) : that.databaseName != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (indexName != null ? !indexName.equals(that.indexName) : that.indexName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = databaseName != null ? databaseName.hashCode() : 0;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (indexName != null ? indexName.hashCode() : 0);
        result = 31 * result + compressOps;
        result = 31 * result + compressOpsOk;
        result = 31 * result + compressTime;
        result = 31 * result + uncompressOps;
        result = 31 * result + uncompressTime;
        return result;
    }
}
