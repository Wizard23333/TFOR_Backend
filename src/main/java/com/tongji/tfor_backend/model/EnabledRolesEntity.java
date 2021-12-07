package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ENABLED_ROLES", schema = "information_schema", catalog = "")
public class EnabledRolesEntity {
    private String roleName;
    private String roleHost;
    private String isDefault;
    private String isMandatory;

    @Basic
    @Column(name = "ROLE_NAME")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "ROLE_HOST")
    public String getRoleHost() {
        return roleHost;
    }

    public void setRoleHost(String roleHost) {
        this.roleHost = roleHost;
    }

    @Basic
    @Column(name = "IS_DEFAULT")
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Basic
    @Column(name = "IS_MANDATORY")
    public String getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnabledRolesEntity that = (EnabledRolesEntity) o;

        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;
        if (roleHost != null ? !roleHost.equals(that.roleHost) : that.roleHost != null) return false;
        if (isDefault != null ? !isDefault.equals(that.isDefault) : that.isDefault != null) return false;
        if (isMandatory != null ? !isMandatory.equals(that.isMandatory) : that.isMandatory != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleName != null ? roleName.hashCode() : 0;
        result = 31 * result + (roleHost != null ? roleHost.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        result = 31 * result + (isMandatory != null ? isMandatory.hashCode() : 0);
        return result;
    }
}
