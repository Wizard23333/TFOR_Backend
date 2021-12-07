package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_TABLESPACES", schema = "information_schema", catalog = "")
public class InnodbTablespacesEntity {
    private Object space;
    private String name;
    private Object flag;
    private String rowFormat;
    private Object pageSize;
    private Object zipPageSize;
    private String spaceType;
    private Object fsBlockSize;
    private Object fileSize;
    private Object allocatedSize;
    private Object autoextendSize;
    private String serverVersion;
    private Object spaceVersion;
    private String encryption;
    private String state;

    @Basic
    @Column(name = "SPACE")
    public Object getSpace() {
        return space;
    }

    public void setSpace(Object space) {
        this.space = space;
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
    public Object getFlag() {
        return flag;
    }

    public void setFlag(Object flag) {
        this.flag = flag;
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
    @Column(name = "PAGE_SIZE")
    public Object getPageSize() {
        return pageSize;
    }

    public void setPageSize(Object pageSize) {
        this.pageSize = pageSize;
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
    @Column(name = "FS_BLOCK_SIZE")
    public Object getFsBlockSize() {
        return fsBlockSize;
    }

    public void setFsBlockSize(Object fsBlockSize) {
        this.fsBlockSize = fsBlockSize;
    }

    @Basic
    @Column(name = "FILE_SIZE")
    public Object getFileSize() {
        return fileSize;
    }

    public void setFileSize(Object fileSize) {
        this.fileSize = fileSize;
    }

    @Basic
    @Column(name = "ALLOCATED_SIZE")
    public Object getAllocatedSize() {
        return allocatedSize;
    }

    public void setAllocatedSize(Object allocatedSize) {
        this.allocatedSize = allocatedSize;
    }

    @Basic
    @Column(name = "AUTOEXTEND_SIZE")
    public Object getAutoextendSize() {
        return autoextendSize;
    }

    public void setAutoextendSize(Object autoextendSize) {
        this.autoextendSize = autoextendSize;
    }

    @Basic
    @Column(name = "SERVER_VERSION")
    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    @Basic
    @Column(name = "SPACE_VERSION")
    public Object getSpaceVersion() {
        return spaceVersion;
    }

    public void setSpaceVersion(Object spaceVersion) {
        this.spaceVersion = spaceVersion;
    }

    @Basic
    @Column(name = "ENCRYPTION")
    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    @Basic
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbTablespacesEntity that = (InnodbTablespacesEntity) o;

        if (space != null ? !space.equals(that.space) : that.space != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (rowFormat != null ? !rowFormat.equals(that.rowFormat) : that.rowFormat != null) return false;
        if (pageSize != null ? !pageSize.equals(that.pageSize) : that.pageSize != null) return false;
        if (zipPageSize != null ? !zipPageSize.equals(that.zipPageSize) : that.zipPageSize != null) return false;
        if (spaceType != null ? !spaceType.equals(that.spaceType) : that.spaceType != null) return false;
        if (fsBlockSize != null ? !fsBlockSize.equals(that.fsBlockSize) : that.fsBlockSize != null) return false;
        if (fileSize != null ? !fileSize.equals(that.fileSize) : that.fileSize != null) return false;
        if (allocatedSize != null ? !allocatedSize.equals(that.allocatedSize) : that.allocatedSize != null)
            return false;
        if (autoextendSize != null ? !autoextendSize.equals(that.autoextendSize) : that.autoextendSize != null)
            return false;
        if (serverVersion != null ? !serverVersion.equals(that.serverVersion) : that.serverVersion != null)
            return false;
        if (spaceVersion != null ? !spaceVersion.equals(that.spaceVersion) : that.spaceVersion != null) return false;
        if (encryption != null ? !encryption.equals(that.encryption) : that.encryption != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = space != null ? space.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (rowFormat != null ? rowFormat.hashCode() : 0);
        result = 31 * result + (pageSize != null ? pageSize.hashCode() : 0);
        result = 31 * result + (zipPageSize != null ? zipPageSize.hashCode() : 0);
        result = 31 * result + (spaceType != null ? spaceType.hashCode() : 0);
        result = 31 * result + (fsBlockSize != null ? fsBlockSize.hashCode() : 0);
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        result = 31 * result + (allocatedSize != null ? allocatedSize.hashCode() : 0);
        result = 31 * result + (autoextendSize != null ? autoextendSize.hashCode() : 0);
        result = 31 * result + (serverVersion != null ? serverVersion.hashCode() : 0);
        result = 31 * result + (spaceVersion != null ? spaceVersion.hashCode() : 0);
        result = 31 * result + (encryption != null ? encryption.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
