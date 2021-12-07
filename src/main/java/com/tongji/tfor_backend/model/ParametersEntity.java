package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PARAMETERS", schema = "information_schema", catalog = "")
public class ParametersEntity {
    private String specificCatalog;
    private String specificSchema;
    private String specificName;
    private Object ordinalPosition;
    private String parameterMode;
    private String parameterName;
    private String dataType;
    private Long characterMaximumLength;
    private Long characterOctetLength;
    private Object numericPrecision;
    private Long numericScale;
    private Object datetimePrecision;
    private String characterSetName;
    private String collationName;
    private String dtdIdentifier;
    private Object routineType;

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
    @Column(name = "ORDINAL_POSITION")
    public Object getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Object ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    @Basic
    @Column(name = "PARAMETER_MODE")
    public String getParameterMode() {
        return parameterMode;
    }

    public void setParameterMode(String parameterMode) {
        this.parameterMode = parameterMode;
    }

    @Basic
    @Column(name = "PARAMETER_NAME")
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    @Basic
    @Column(name = "DATA_TYPE")
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Basic
    @Column(name = "CHARACTER_MAXIMUM_LENGTH")
    public Long getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public void setCharacterMaximumLength(Long characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    @Basic
    @Column(name = "CHARACTER_OCTET_LENGTH")
    public Long getCharacterOctetLength() {
        return characterOctetLength;
    }

    public void setCharacterOctetLength(Long characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    @Basic
    @Column(name = "NUMERIC_PRECISION")
    public Object getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Object numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    @Basic
    @Column(name = "NUMERIC_SCALE")
    public Long getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Long numericScale) {
        this.numericScale = numericScale;
    }

    @Basic
    @Column(name = "DATETIME_PRECISION")
    public Object getDatetimePrecision() {
        return datetimePrecision;
    }

    public void setDatetimePrecision(Object datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    @Basic
    @Column(name = "CHARACTER_SET_NAME")
    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Basic
    @Column(name = "COLLATION_NAME")
    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    @Basic
    @Column(name = "DTD_IDENTIFIER")
    public String getDtdIdentifier() {
        return dtdIdentifier;
    }

    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    @Basic
    @Column(name = "ROUTINE_TYPE")
    public Object getRoutineType() {
        return routineType;
    }

    public void setRoutineType(Object routineType) {
        this.routineType = routineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParametersEntity that = (ParametersEntity) o;

        if (specificCatalog != null ? !specificCatalog.equals(that.specificCatalog) : that.specificCatalog != null)
            return false;
        if (specificSchema != null ? !specificSchema.equals(that.specificSchema) : that.specificSchema != null)
            return false;
        if (specificName != null ? !specificName.equals(that.specificName) : that.specificName != null) return false;
        if (ordinalPosition != null ? !ordinalPosition.equals(that.ordinalPosition) : that.ordinalPosition != null)
            return false;
        if (parameterMode != null ? !parameterMode.equals(that.parameterMode) : that.parameterMode != null)
            return false;
        if (parameterName != null ? !parameterName.equals(that.parameterName) : that.parameterName != null)
            return false;
        if (dataType != null ? !dataType.equals(that.dataType) : that.dataType != null) return false;
        if (characterMaximumLength != null ? !characterMaximumLength.equals(that.characterMaximumLength) : that.characterMaximumLength != null)
            return false;
        if (characterOctetLength != null ? !characterOctetLength.equals(that.characterOctetLength) : that.characterOctetLength != null)
            return false;
        if (numericPrecision != null ? !numericPrecision.equals(that.numericPrecision) : that.numericPrecision != null)
            return false;
        if (numericScale != null ? !numericScale.equals(that.numericScale) : that.numericScale != null) return false;
        if (datetimePrecision != null ? !datetimePrecision.equals(that.datetimePrecision) : that.datetimePrecision != null)
            return false;
        if (characterSetName != null ? !characterSetName.equals(that.characterSetName) : that.characterSetName != null)
            return false;
        if (collationName != null ? !collationName.equals(that.collationName) : that.collationName != null)
            return false;
        if (dtdIdentifier != null ? !dtdIdentifier.equals(that.dtdIdentifier) : that.dtdIdentifier != null)
            return false;
        if (routineType != null ? !routineType.equals(that.routineType) : that.routineType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = specificCatalog != null ? specificCatalog.hashCode() : 0;
        result = 31 * result + (specificSchema != null ? specificSchema.hashCode() : 0);
        result = 31 * result + (specificName != null ? specificName.hashCode() : 0);
        result = 31 * result + (ordinalPosition != null ? ordinalPosition.hashCode() : 0);
        result = 31 * result + (parameterMode != null ? parameterMode.hashCode() : 0);
        result = 31 * result + (parameterName != null ? parameterName.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (characterMaximumLength != null ? characterMaximumLength.hashCode() : 0);
        result = 31 * result + (characterOctetLength != null ? characterOctetLength.hashCode() : 0);
        result = 31 * result + (numericPrecision != null ? numericPrecision.hashCode() : 0);
        result = 31 * result + (numericScale != null ? numericScale.hashCode() : 0);
        result = 31 * result + (datetimePrecision != null ? datetimePrecision.hashCode() : 0);
        result = 31 * result + (characterSetName != null ? characterSetName.hashCode() : 0);
        result = 31 * result + (collationName != null ? collationName.hashCode() : 0);
        result = 31 * result + (dtdIdentifier != null ? dtdIdentifier.hashCode() : 0);
        result = 31 * result + (routineType != null ? routineType.hashCode() : 0);
        return result;
    }
}
