package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE_TABLE_GRANTS", schema = "information_schema", catalog = "")
public class RoleTableGrantsEntity {
    private String grantor;
    private String grantorHost;
    private String grantee;
    private String granteeHost;
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private Object privilegeType;
    private String isGrantable;

    @Basic
    @Column(name = "GRANTOR")
    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    @Basic
    @Column(name = "GRANTOR_HOST")
    public String getGrantorHost() {
        return grantorHost;
    }

    public void setGrantorHost(String grantorHost) {
        this.grantorHost = grantorHost;
    }

    @Basic
    @Column(name = "GRANTEE")
    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    @Basic
    @Column(name = "GRANTEE_HOST")
    public String getGranteeHost() {
        return granteeHost;
    }

    public void setGranteeHost(String granteeHost) {
        this.granteeHost = granteeHost;
    }

    @Basic
    @Column(name = "TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Basic
    @Column(name = "TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Basic
    @Column(name = "TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "PRIVILEGE_TYPE")
    public Object getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(Object privilegeType) {
        this.privilegeType = privilegeType;
    }

    @Basic
    @Column(name = "IS_GRANTABLE")
    public String getIsGrantable() {
        return isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleTableGrantsEntity that = (RoleTableGrantsEntity) o;

        if (grantor != null ? !grantor.equals(that.grantor) : that.grantor != null) return false;
        if (grantorHost != null ? !grantorHost.equals(that.grantorHost) : that.grantorHost != null) return false;
        if (grantee != null ? !grantee.equals(that.grantee) : that.grantee != null) return false;
        if (granteeHost != null ? !granteeHost.equals(that.granteeHost) : that.granteeHost != null) return false;
        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (privilegeType != null ? !privilegeType.equals(that.privilegeType) : that.privilegeType != null)
            return false;
        if (isGrantable != null ? !isGrantable.equals(that.isGrantable) : that.isGrantable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = grantor != null ? grantor.hashCode() : 0;
        result = 31 * result + (grantorHost != null ? grantorHost.hashCode() : 0);
        result = 31 * result + (grantee != null ? grantee.hashCode() : 0);
        result = 31 * result + (granteeHost != null ? granteeHost.hashCode() : 0);
        result = 31 * result + (tableCatalog != null ? tableCatalog.hashCode() : 0);
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (privilegeType != null ? privilegeType.hashCode() : 0);
        result = 31 * result + (isGrantable != null ? isGrantable.hashCode() : 0);
        return result;
    }
}
