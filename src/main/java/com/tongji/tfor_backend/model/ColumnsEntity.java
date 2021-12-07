package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COLUMNS", schema = "information_schema", catalog = "")
public class ColumnsEntity {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String columnName;
    private Object ordinalPosition;
    private String columnDefault;
    private String isNullable;
    private String dataType;
    private Long characterMaximumLength;
    private Long characterOctetLength;
    private Object numericPrecision;
    private Object numericScale;
    private Object datetimePrecision;
    private String characterSetName;
    private String collationName;
    private String columnType;
    private Object columnKey;
    private String extra;
    private String privileges;
    private String columnComment;
    private String generationExpression;
    private Object srsId;

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
    @Column(name = "COLUMN_NAME")
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
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
    @Column(name = "COLUMN_DEFAULT")
    public String getColumnDefault() {
        return columnDefault;
    }

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    @Basic
    @Column(name = "IS_NULLABLE")
    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
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
    @Column(name = "COLUMN_TYPE")
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    @Basic
    @Column(name = "COLUMN_KEY")
    public Object getColumnKey() {
        return columnKey;
    }

    public void setColumnKey(Object columnKey) {
        this.columnKey = columnKey;
    }

    @Basic
    @Column(name = "EXTRA")
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Basic
    @Column(name = "PRIVILEGES")
    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    @Basic
    @Column(name = "COLUMN_COMMENT")
    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    @Basic
    @Column(name = "GENERATION_EXPRESSION")
    public String getGenerationExpression() {
        return generationExpression;
    }

    public void setGenerationExpression(String generationExpression) {
        this.generationExpression = generationExpression;
    }

    @Basic
    @Column(name = "SRS_ID")
    public Object getSrsId() {
        return srsId;
    }

    public void setSrsId(Object srsId) {
        this.srsId = srsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ColumnsEntity that = (ColumnsEntity) o;

        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (columnName != null ? !columnName.equals(that.columnName) : that.columnName != null) return false;
        if (ordinalPosition != null ? !ordinalPosition.equals(that.ordinalPosition) : that.ordinalPosition != null)
            return false;
        if (columnDefault != null ? !columnDefault.equals(that.columnDefault) : that.columnDefault != null)
            return false;
        if (isNullable != null ? !isNullable.equals(that.isNullable) : that.isNullable != null) return false;
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
        if (columnType != null ? !columnType.equals(that.columnType) : that.columnType != null) return false;
        if (columnKey != null ? !columnKey.equals(that.columnKey) : that.columnKey != null) return false;
        if (extra != null ? !extra.equals(that.extra) : that.extra != null) return false;
        if (privileges != null ? !privileges.equals(that.privileges) : that.privileges != null) return false;
        if (columnComment != null ? !columnComment.equals(that.columnComment) : that.columnComment != null)
            return false;
        if (generationExpression != null ? !generationExpression.equals(that.generationExpression) : that.generationExpression != null)
            return false;
        if (srsId != null ? !srsId.equals(that.srsId) : that.srsId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableCatalog != null ? tableCatalog.hashCode() : 0;
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (columnName != null ? columnName.hashCode() : 0);
        result = 31 * result + (ordinalPosition != null ? ordinalPosition.hashCode() : 0);
        result = 31 * result + (columnDefault != null ? columnDefault.hashCode() : 0);
        result = 31 * result + (isNullable != null ? isNullable.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (characterMaximumLength != null ? characterMaximumLength.hashCode() : 0);
        result = 31 * result + (characterOctetLength != null ? characterOctetLength.hashCode() : 0);
        result = 31 * result + (numericPrecision != null ? numericPrecision.hashCode() : 0);
        result = 31 * result + (numericScale != null ? numericScale.hashCode() : 0);
        result = 31 * result + (datetimePrecision != null ? datetimePrecision.hashCode() : 0);
        result = 31 * result + (characterSetName != null ? characterSetName.hashCode() : 0);
        result = 31 * result + (collationName != null ? collationName.hashCode() : 0);
        result = 31 * result + (columnType != null ? columnType.hashCode() : 0);
        result = 31 * result + (columnKey != null ? columnKey.hashCode() : 0);
        result = 31 * result + (extra != null ? extra.hashCode() : 0);
        result = 31 * result + (privileges != null ? privileges.hashCode() : 0);
        result = 31 * result + (columnComment != null ? columnComment.hashCode() : 0);
        result = 31 * result + (generationExpression != null ? generationExpression.hashCode() : 0);
        result = 31 * result + (srsId != null ? srsId.hashCode() : 0);
        return result;
    }
}
