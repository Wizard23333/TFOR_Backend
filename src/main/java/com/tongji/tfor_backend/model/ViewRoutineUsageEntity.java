package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_ROUTINE_USAGE", schema = "information_schema", catalog = "")
public class ViewRoutineUsageEntity {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String specificCatalog;
    private String specificSchema;
    private String specificName;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewRoutineUsageEntity that = (ViewRoutineUsageEntity) o;

        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (specificCatalog != null ? !specificCatalog.equals(that.specificCatalog) : that.specificCatalog != null)
            return false;
        if (specificSchema != null ? !specificSchema.equals(that.specificSchema) : that.specificSchema != null)
            return false;
        if (specificName != null ? !specificName.equals(that.specificName) : that.specificName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableCatalog != null ? tableCatalog.hashCode() : 0;
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (specificCatalog != null ? specificCatalog.hashCode() : 0);
        result = 31 * result + (specificSchema != null ? specificSchema.hashCode() : 0);
        result = 31 * result + (specificName != null ? specificName.hashCode() : 0);
        return result;
    }
}
