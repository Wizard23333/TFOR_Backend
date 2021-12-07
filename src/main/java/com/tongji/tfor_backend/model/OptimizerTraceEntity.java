package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OPTIMIZER_TRACE", schema = "information_schema", catalog = "")
public class OptimizerTraceEntity {
    private String query;
    private String trace;
    private int missingBytesBeyondMaxMemSize;
    private byte insufficientPrivileges;

    @Basic
    @Column(name = "QUERY")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Basic
    @Column(name = "TRACE")
    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    @Basic
    @Column(name = "MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
    public int getMissingBytesBeyondMaxMemSize() {
        return missingBytesBeyondMaxMemSize;
    }

    public void setMissingBytesBeyondMaxMemSize(int missingBytesBeyondMaxMemSize) {
        this.missingBytesBeyondMaxMemSize = missingBytesBeyondMaxMemSize;
    }

    @Basic
    @Column(name = "INSUFFICIENT_PRIVILEGES")
    public byte getInsufficientPrivileges() {
        return insufficientPrivileges;
    }

    public void setInsufficientPrivileges(byte insufficientPrivileges) {
        this.insufficientPrivileges = insufficientPrivileges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OptimizerTraceEntity that = (OptimizerTraceEntity) o;

        if (missingBytesBeyondMaxMemSize != that.missingBytesBeyondMaxMemSize) return false;
        if (insufficientPrivileges != that.insufficientPrivileges) return false;
        if (query != null ? !query.equals(that.query) : that.query != null) return false;
        if (trace != null ? !trace.equals(that.trace) : that.trace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = query != null ? query.hashCode() : 0;
        result = 31 * result + (trace != null ? trace.hashCode() : 0);
        result = 31 * result + missingBytesBeyondMaxMemSize;
        result = 31 * result + (int) insufficientPrivileges;
        return result;
    }
}
