package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "ROUTINES", schema = "information_schema", catalog = "")
public class RoutinesEntity {
    private String specificName;
    private String routineCatalog;
    private String routineSchema;
    private String routineName;
    private Object routineType;
    private String dataType;
    private Long characterMaximumLength;
    private Long characterOctetLength;
    private Object numericPrecision;
    private Object numericScale;
    private Object datetimePrecision;
    private String characterSetName;
    private String collationName;
    private String dtdIdentifier;
    private String routineBody;
    private String routineDefinition;
    private byte[] externalName;
    private String externalLanguage;
    private String parameterStyle;
    private String isDeterministic;
    private Object sqlDataAccess;
    private byte[] sqlPath;
    private Object securityType;
    private Timestamp created;
    private Timestamp lastAltered;
    private Object sqlMode;
    private String routineComment;
    private String definer;
    private String characterSetClient;
    private String collationConnection;
    private String databaseCollation;

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
    @Column(name = "ROUTINE_TYPE")
    public Object getRoutineType() {
        return routineType;
    }

    public void setRoutineType(Object routineType) {
        this.routineType = routineType;
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
    public Object getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Object numericScale) {
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
    @Column(name = "ROUTINE_BODY")
    public String getRoutineBody() {
        return routineBody;
    }

    public void setRoutineBody(String routineBody) {
        this.routineBody = routineBody;
    }

    @Basic
    @Column(name = "ROUTINE_DEFINITION")
    public String getRoutineDefinition() {
        return routineDefinition;
    }

    public void setRoutineDefinition(String routineDefinition) {
        this.routineDefinition = routineDefinition;
    }

    @Basic
    @Column(name = "EXTERNAL_NAME")
    public byte[] getExternalName() {
        return externalName;
    }

    public void setExternalName(byte[] externalName) {
        this.externalName = externalName;
    }

    @Basic
    @Column(name = "EXTERNAL_LANGUAGE")
    public String getExternalLanguage() {
        return externalLanguage;
    }

    public void setExternalLanguage(String externalLanguage) {
        this.externalLanguage = externalLanguage;
    }

    @Basic
    @Column(name = "PARAMETER_STYLE")
    public String getParameterStyle() {
        return parameterStyle;
    }

    public void setParameterStyle(String parameterStyle) {
        this.parameterStyle = parameterStyle;
    }

    @Basic
    @Column(name = "IS_DETERMINISTIC")
    public String getIsDeterministic() {
        return isDeterministic;
    }

    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic;
    }

    @Basic
    @Column(name = "SQL_DATA_ACCESS")
    public Object getSqlDataAccess() {
        return sqlDataAccess;
    }

    public void setSqlDataAccess(Object sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess;
    }

    @Basic
    @Column(name = "SQL_PATH")
    public byte[] getSqlPath() {
        return sqlPath;
    }

    public void setSqlPath(byte[] sqlPath) {
        this.sqlPath = sqlPath;
    }

    @Basic
    @Column(name = "SECURITY_TYPE")
    public Object getSecurityType() {
        return securityType;
    }

    public void setSecurityType(Object securityType) {
        this.securityType = securityType;
    }

    @Basic
    @Column(name = "CREATED")
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "LAST_ALTERED")
    public Timestamp getLastAltered() {
        return lastAltered;
    }

    public void setLastAltered(Timestamp lastAltered) {
        this.lastAltered = lastAltered;
    }

    @Basic
    @Column(name = "SQL_MODE")
    public Object getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(Object sqlMode) {
        this.sqlMode = sqlMode;
    }

    @Basic
    @Column(name = "ROUTINE_COMMENT")
    public String getRoutineComment() {
        return routineComment;
    }

    public void setRoutineComment(String routineComment) {
        this.routineComment = routineComment;
    }

    @Basic
    @Column(name = "DEFINER")
    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    @Basic
    @Column(name = "CHARACTER_SET_CLIENT")
    public String getCharacterSetClient() {
        return characterSetClient;
    }

    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    @Basic
    @Column(name = "COLLATION_CONNECTION")
    public String getCollationConnection() {
        return collationConnection;
    }

    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    @Basic
    @Column(name = "DATABASE_COLLATION")
    public String getDatabaseCollation() {
        return databaseCollation;
    }

    public void setDatabaseCollation(String databaseCollation) {
        this.databaseCollation = databaseCollation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoutinesEntity that = (RoutinesEntity) o;

        if (specificName != null ? !specificName.equals(that.specificName) : that.specificName != null) return false;
        if (routineCatalog != null ? !routineCatalog.equals(that.routineCatalog) : that.routineCatalog != null)
            return false;
        if (routineSchema != null ? !routineSchema.equals(that.routineSchema) : that.routineSchema != null)
            return false;
        if (routineName != null ? !routineName.equals(that.routineName) : that.routineName != null) return false;
        if (routineType != null ? !routineType.equals(that.routineType) : that.routineType != null) return false;
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
        if (routineBody != null ? !routineBody.equals(that.routineBody) : that.routineBody != null) return false;
        if (routineDefinition != null ? !routineDefinition.equals(that.routineDefinition) : that.routineDefinition != null)
            return false;
        if (!Arrays.equals(externalName, that.externalName)) return false;
        if (externalLanguage != null ? !externalLanguage.equals(that.externalLanguage) : that.externalLanguage != null)
            return false;
        if (parameterStyle != null ? !parameterStyle.equals(that.parameterStyle) : that.parameterStyle != null)
            return false;
        if (isDeterministic != null ? !isDeterministic.equals(that.isDeterministic) : that.isDeterministic != null)
            return false;
        if (sqlDataAccess != null ? !sqlDataAccess.equals(that.sqlDataAccess) : that.sqlDataAccess != null)
            return false;
        if (!Arrays.equals(sqlPath, that.sqlPath)) return false;
        if (securityType != null ? !securityType.equals(that.securityType) : that.securityType != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (lastAltered != null ? !lastAltered.equals(that.lastAltered) : that.lastAltered != null) return false;
        if (sqlMode != null ? !sqlMode.equals(that.sqlMode) : that.sqlMode != null) return false;
        if (routineComment != null ? !routineComment.equals(that.routineComment) : that.routineComment != null)
            return false;
        if (definer != null ? !definer.equals(that.definer) : that.definer != null) return false;
        if (characterSetClient != null ? !characterSetClient.equals(that.characterSetClient) : that.characterSetClient != null)
            return false;
        if (collationConnection != null ? !collationConnection.equals(that.collationConnection) : that.collationConnection != null)
            return false;
        if (databaseCollation != null ? !databaseCollation.equals(that.databaseCollation) : that.databaseCollation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = specificName != null ? specificName.hashCode() : 0;
        result = 31 * result + (routineCatalog != null ? routineCatalog.hashCode() : 0);
        result = 31 * result + (routineSchema != null ? routineSchema.hashCode() : 0);
        result = 31 * result + (routineName != null ? routineName.hashCode() : 0);
        result = 31 * result + (routineType != null ? routineType.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (characterMaximumLength != null ? characterMaximumLength.hashCode() : 0);
        result = 31 * result + (characterOctetLength != null ? characterOctetLength.hashCode() : 0);
        result = 31 * result + (numericPrecision != null ? numericPrecision.hashCode() : 0);
        result = 31 * result + (numericScale != null ? numericScale.hashCode() : 0);
        result = 31 * result + (datetimePrecision != null ? datetimePrecision.hashCode() : 0);
        result = 31 * result + (characterSetName != null ? characterSetName.hashCode() : 0);
        result = 31 * result + (collationName != null ? collationName.hashCode() : 0);
        result = 31 * result + (dtdIdentifier != null ? dtdIdentifier.hashCode() : 0);
        result = 31 * result + (routineBody != null ? routineBody.hashCode() : 0);
        result = 31 * result + (routineDefinition != null ? routineDefinition.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(externalName);
        result = 31 * result + (externalLanguage != null ? externalLanguage.hashCode() : 0);
        result = 31 * result + (parameterStyle != null ? parameterStyle.hashCode() : 0);
        result = 31 * result + (isDeterministic != null ? isDeterministic.hashCode() : 0);
        result = 31 * result + (sqlDataAccess != null ? sqlDataAccess.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(sqlPath);
        result = 31 * result + (securityType != null ? securityType.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (lastAltered != null ? lastAltered.hashCode() : 0);
        result = 31 * result + (sqlMode != null ? sqlMode.hashCode() : 0);
        result = 31 * result + (routineComment != null ? routineComment.hashCode() : 0);
        result = 31 * result + (definer != null ? definer.hashCode() : 0);
        result = 31 * result + (characterSetClient != null ? characterSetClient.hashCode() : 0);
        result = 31 * result + (collationConnection != null ? collationConnection.hashCode() : 0);
        result = 31 * result + (databaseCollation != null ? databaseCollation.hashCode() : 0);
        return result;
    }
}
