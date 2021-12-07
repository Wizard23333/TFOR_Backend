package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ST_SPATIAL_REFERENCE_SYSTEMS", schema = "information_schema", catalog = "")
public class StSpatialReferenceSystemsEntity {
    private String srsName;
    private Object srsId;
    private String organization;
    private Object organizationCoordsysId;
    private String definition;
    private String description;

    @Basic
    @Column(name = "SRS_NAME")
    public String getSrsName() {
        return srsName;
    }

    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    @Basic
    @Column(name = "SRS_ID")
    public Object getSrsId() {
        return srsId;
    }

    public void setSrsId(Object srsId) {
        this.srsId = srsId;
    }

    @Basic
    @Column(name = "ORGANIZATION")
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Basic
    @Column(name = "ORGANIZATION_COORDSYS_ID")
    public Object getOrganizationCoordsysId() {
        return organizationCoordsysId;
    }

    public void setOrganizationCoordsysId(Object organizationCoordsysId) {
        this.organizationCoordsysId = organizationCoordsysId;
    }

    @Basic
    @Column(name = "DEFINITION")
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StSpatialReferenceSystemsEntity that = (StSpatialReferenceSystemsEntity) o;

        if (srsName != null ? !srsName.equals(that.srsName) : that.srsName != null) return false;
        if (srsId != null ? !srsId.equals(that.srsId) : that.srsId != null) return false;
        if (organization != null ? !organization.equals(that.organization) : that.organization != null) return false;
        if (organizationCoordsysId != null ? !organizationCoordsysId.equals(that.organizationCoordsysId) : that.organizationCoordsysId != null)
            return false;
        if (definition != null ? !definition.equals(that.definition) : that.definition != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = srsName != null ? srsName.hashCode() : 0;
        result = 31 * result + (srsId != null ? srsId.hashCode() : 0);
        result = 31 * result + (organization != null ? organization.hashCode() : 0);
        result = 31 * result + (organizationCoordsysId != null ? organizationCoordsysId.hashCode() : 0);
        result = 31 * result + (definition != null ? definition.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
