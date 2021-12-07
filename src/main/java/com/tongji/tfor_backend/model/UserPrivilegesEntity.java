package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_PRIVILEGES", schema = "information_schema", catalog = "")
public class UserPrivilegesEntity {
    private String grantee;
    private String tableCatalog;
    private String privilegeType;
    private String isGrantable;

    @Basic
    @Column(name = "GRANTEE")
    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
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
    @Column(name = "PRIVILEGE_TYPE")
    public String getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
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

        UserPrivilegesEntity that = (UserPrivilegesEntity) o;

        if (grantee != null ? !grantee.equals(that.grantee) : that.grantee != null) return false;
        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (privilegeType != null ? !privilegeType.equals(that.privilegeType) : that.privilegeType != null)
            return false;
        if (isGrantable != null ? !isGrantable.equals(that.isGrantable) : that.isGrantable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = grantee != null ? grantee.hashCode() : 0;
        result = 31 * result + (tableCatalog != null ? tableCatalog.hashCode() : 0);
        result = 31 * result + (privilegeType != null ? privilegeType.hashCode() : 0);
        result = 31 * result + (isGrantable != null ? isGrantable.hashCode() : 0);
        return result;
    }
}
