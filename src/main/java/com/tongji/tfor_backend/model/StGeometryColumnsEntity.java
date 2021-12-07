package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ST_GEOMETRY_COLUMNS", schema = "information_schema", catalog = "")
public class StGeometryColumnsEntity {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String columnName;
    private String srsName;
    private Object srsId;
    private String geometryTypeName;

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
    @Column(name = "GEOMETRY_TYPE_NAME")
    public String getGeometryTypeName() {
        return geometryTypeName;
    }

    public void setGeometryTypeName(String geometryTypeName) {
        this.geometryTypeName = geometryTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StGeometryColumnsEntity that = (StGeometryColumnsEntity) o;

        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (columnName != null ? !columnName.equals(that.columnName) : that.columnName != null) return false;
        if (srsName != null ? !srsName.equals(that.srsName) : that.srsName != null) return false;
        if (srsId != null ? !srsId.equals(that.srsId) : that.srsId != null) return false;
        if (geometryTypeName != null ? !geometryTypeName.equals(that.geometryTypeName) : that.geometryTypeName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableCatalog != null ? tableCatalog.hashCode() : 0;
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (columnName != null ? columnName.hashCode() : 0);
        result = 31 * result + (srsName != null ? srsName.hashCode() : 0);
        result = 31 * result + (srsId != null ? srsId.hashCode() : 0);
        result = 31 * result + (geometryTypeName != null ? geometryTypeName.hashCode() : 0);
        return result;
    }
}
