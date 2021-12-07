package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE_ROUTINE_GRANTS", schema = "information_schema", catalog = "")
public class RoleRoutineGrantsEntity {
    private String grantor;
    private String grantorHost;
    private String grantee;
    private String granteeHost;
    private String specificCatalog;
    private String specificSchema;
    private String specificName;
    private String routineCatalog;
    private String routineSchema;
    private String routineName;
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
    @Column(name = "SPECIFIC_CATALOG")
    public String getSpecificCatalog() {
        return specificCatalog;
    }

    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    @Basic
    @Column(name = "SPECIFIC_SCHEMA")
    public String getSpecificSchema() {
        return specificSchema;
    }

    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    @Basic
    @Column(name = "SPECIFIC_NAME")
    public String getSpecificName() {
        return specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    @Basic
    @Column(name = "ROUTINE_CATALOG")
    public String getRoutineCatalog() {
        return routineCatalog;
    }

    public void setRoutineCatalog(String routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    @Basic
    @Column(name = "ROUTINE_SCHEMA")
    public String getRoutineSchema() {
        return routineSchema;
    }

    public void setRoutineSchema(String routineSchema) {
        this.routineSchema = routineSchema;
    }

    @Basic
    @Column(name = "ROUTINE_NAME")
    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
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

        RoleRoutineGrantsEntity that = (RoleRoutineGrantsEntity) o;

        if (grantor != null ? !grantor.equals(that.grantor) : that.grantor != null) return false;
        if (grantorHost != null ? !grantorHost.equals(that.grantorHost) : that.grantorHost != null) return false;
        if (grantee != null ? !grantee.equals(that.grantee) : that.grantee != null) return false;
        if (granteeHost != null ? !granteeHost.equals(that.granteeHost) : that.granteeHost != null) return false;
        if (specificCatalog != null ? !specificCatalog.equals(that.specificCatalog) : that.specificCatalog != null)
            return false;
        if (specificSchema != null ? !specificSchema.equals(that.specificSchema) : that.specificSchema != null)
            return false;
        if (specificName != null ? !specificName.equals(that.specificName) : that.specificName != null) return false;
        if (routineCatalog != null ? !routineCatalog.equals(that.routineCatalog) : that.routineCatalog != null)
            return false;
        if (routineSchema != null ? !routineSchema.equals(that.routineSchema) : that.routineSchema != null)
            return false;
        if (routineName != null ? !routineName.equals(that.routineName) : that.routineName != null) return false;
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
        result = 31 * result + (specificCatalog != null ? specificCatalog.hashCode() : 0);
        result = 31 * result + (specificSchema != null ? specificSchema.hashCode() : 0);
        result = 31 * result + (specificName != null ? specificName.hashCode() : 0);
        result = 31 * result + (routineCatalog != null ? routineCatalog.hashCode() : 0);
        result = 31 * result + (routineSchema != null ? routineSchema.hashCode() : 0);
        result = 31 * result + (routineName != null ? routineName.hashCode() : 0);
        result = 31 * result + (privilegeType != null ? privilegeType.hashCode() : 0);
        result = 31 * result + (isGrantable != null ? isGrantable.hashCode() : 0);
        return result;
    }
}
