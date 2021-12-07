package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ST_UNITS_OF_MEASURE", schema = "information_schema", catalog = "")
public class StUnitsOfMeasureEntity {
    private String unitName;
    private String unitType;
    private Double conversionFactor;
    private String description;

    @Basic
    @Column(name = "UNIT_NAME")
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Basic
    @Column(name = "UNIT_TYPE")
    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @Basic
    @Column(name = "CONVERSION_FACTOR")
    public Double getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
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

        StUnitsOfMeasureEntity that = (StUnitsOfMeasureEntity) o;

        if (unitName != null ? !unitName.equals(that.unitName) : that.unitName != null) return false;
        if (unitType != null ? !unitType.equals(that.unitType) : that.unitType != null) return false;
        if (conversionFactor != null ? !conversionFactor.equals(that.conversionFactor) : that.conversionFactor != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unitName != null ? unitName.hashCode() : 0;
        result = 31 * result + (unitType != null ? unitType.hashCode() : 0);
        result = 31 * result + (conversionFactor != null ? conversionFactor.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
