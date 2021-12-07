package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_CMPMEM", schema = "information_schema", catalog = "")
public class InnodbCmpmemEntity {
    private int pageSize;
    private int bufferPoolInstance;
    private int pagesUsed;
    private int pagesFree;
    private long relocationOps;
    private int relocationTime;

    @Basic
    @Column(name = "page_size")
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Basic
    @Column(name = "buffer_pool_instance")
    public int getBufferPoolInstance() {
        return bufferPoolInstance;
    }

    public void setBufferPoolInstance(int bufferPoolInstance) {
        this.bufferPoolInstance = bufferPoolInstance;
    }

    @Basic
    @Column(name = "pages_used")
    public int getPagesUsed() {
        return pagesUsed;
    }

    public void setPagesUsed(int pagesUsed) {
        this.pagesUsed = pagesUsed;
    }

    @Basic
    @Column(name = "pages_free")
    public int getPagesFree() {
        return pagesFree;
    }

    public void setPagesFree(int pagesFree) {
        this.pagesFree = pagesFree;
    }

    @Basic
    @Column(name = "relocation_ops")
    public long getRelocationOps() {
        return relocationOps;
    }

    public void setRelocationOps(long relocationOps) {
        this.relocationOps = relocationOps;
    }

    @Basic
    @Column(name = "relocation_time")
    public int getRelocationTime() {
        return relocationTime;
    }

    public void setRelocationTime(int relocationTime) {
        this.relocationTime = relocationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbCmpmemEntity that = (InnodbCmpmemEntity) o;

        if (pageSize != that.pageSize) return false;
        if (bufferPoolInstance != that.bufferPoolInstance) return false;
        if (pagesUsed != that.pagesUsed) return false;
        if (pagesFree != that.pagesFree) return false;
        if (relocationOps != that.relocationOps) return false;
        if (relocationTime != that.relocationTime) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pageSize;
        result = 31 * result + bufferPoolInstance;
        result = 31 * result + pagesUsed;
        result = 31 * result + pagesFree;
        result = 31 * result + (int) (relocationOps ^ (relocationOps >>> 32));
        result = 31 * result + relocationTime;
        return result;
    }
}
