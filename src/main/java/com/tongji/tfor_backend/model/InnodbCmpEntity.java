package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_CMP", schema = "information_schema", catalog = "")
public class InnodbCmpEntity {
    private int pageSize;
    private int compressOps;
    private int compressOpsOk;
    private int compressTime;
    private int uncompressOps;
    private int uncompressTime;

    @Basic
    @Column(name = "page_size")
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
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

        InnodbCmpEntity that = (InnodbCmpEntity) o;

        if (pageSize != that.pageSize) return false;
        if (compressOps != that.compressOps) return false;
        if (compressOpsOk != that.compressOpsOk) return false;
        if (compressTime != that.compressTime) return false;
        if (uncompressOps != that.uncompressOps) return false;
        if (uncompressTime != that.uncompressTime) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pageSize;
        result = 31 * result + compressOps;
        result = 31 * result + compressOpsOk;
        result = 31 * result + compressTime;
        result = 31 * result + uncompressOps;
        result = 31 * result + uncompressTime;
        return result;
    }
}
