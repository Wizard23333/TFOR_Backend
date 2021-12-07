package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLESPACES", schema = "information_schema", catalog = "")
public class TablespacesEntity {
    private String tablespaceName;
    private String engine;
    private String tablespaceType;
    private String logfileGroupName;
    private Object extentSize;
    private Object autoextendSize;
    private Object maximumSize;
    private Object nodegroupId;
    private String tablespaceComment;

    @Basic
    @Column(name = "TABLESPACE_NAME")
    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    @Basic
    @Column(name = "ENGINE")
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Basic
    @Column(name = "TABLESPACE_TYPE")
    public String getTablespaceType() {
        return tablespaceType;
    }

    public void setTablespaceType(String tablespaceType) {
        this.tablespaceType = tablespaceType;
    }

    @Basic
    @Column(name = "LOGFILE_GROUP_NAME")
    public String getLogfileGroupName() {
        return logfileGroupName;
    }

    public void setLogfileGroupName(String logfileGroupName) {
        this.logfileGroupName = logfileGroupName;
    }

    @Basic
    @Column(name = "EXTENT_SIZE")
    public Object getExtentSize() {
        return extentSize;
    }

    public void setExtentSize(Object extentSize) {
        this.extentSize = extentSize;
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
    @Column(name = "MAXIMUM_SIZE")
    public Object getMaximumSize() {
        return maximumSize;
    }

    public void setMaximumSize(Object maximumSize) {
        this.maximumSize = maximumSize;
    }

    @Basic
    @Column(name = "NODEGROUP_ID")
    public Object getNodegroupId() {
        return nodegroupId;
    }

    public void setNodegroupId(Object nodegroupId) {
        this.nodegroupId = nodegroupId;
    }

    @Basic
    @Column(name = "TABLESPACE_COMMENT")
    public String getTablespaceComment() {
        return tablespaceComment;
    }

    public void setTablespaceComment(String tablespaceComment) {
        this.tablespaceComment = tablespaceComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TablespacesEntity that = (TablespacesEntity) o;

        if (tablespaceName != null ? !tablespaceName.equals(that.tablespaceName) : that.tablespaceName != null)
            return false;
        if (engine != null ? !engine.equals(that.engine) : that.engine != null) return false;
        if (tablespaceType != null ? !tablespaceType.equals(that.tablespaceType) : that.tablespaceType != null)
            return false;
        if (logfileGroupName != null ? !logfileGroupName.equals(that.logfileGroupName) : that.logfileGroupName != null)
            return false;
        if (extentSize != null ? !extentSize.equals(that.extentSize) : that.extentSize != null) return false;
        if (autoextendSize != null ? !autoextendSize.equals(that.autoextendSize) : that.autoextendSize != null)
            return false;
        if (maximumSize != null ? !maximumSize.equals(that.maximumSize) : that.maximumSize != null) return false;
        if (nodegroupId != null ? !nodegroupId.equals(that.nodegroupId) : that.nodegroupId != null) return false;
        if (tablespaceComment != null ? !tablespaceComment.equals(that.tablespaceComment) : that.tablespaceComment != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tablespaceName != null ? tablespaceName.hashCode() : 0;
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (tablespaceType != null ? tablespaceType.hashCode() : 0);
        result = 31 * result + (logfileGroupName != null ? logfileGroupName.hashCode() : 0);
        result = 31 * result + (extentSize != null ? extentSize.hashCode() : 0);
        result = 31 * result + (autoextendSize != null ? autoextendSize.hashCode() : 0);
        result = 31 * result + (maximumSize != null ? maximumSize.hashCode() : 0);
        result = 31 * result + (nodegroupId != null ? nodegroupId.hashCode() : 0);
        result = 31 * result + (tablespaceComment != null ? tablespaceComment.hashCode() : 0);
        return result;
    }
}
