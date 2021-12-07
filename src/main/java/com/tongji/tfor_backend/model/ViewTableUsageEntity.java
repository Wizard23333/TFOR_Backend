package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_TABLE_USAGE", schema = "information_schema", catalog = "")
public class ViewTableUsageEntity {
    private String viewCatalog;
    private String viewSchema;
    private String viewName;
    private String tableCatalog;
    private String tableSchema;
    private String tableName;

    @Basic
    @Column(name = "VIEW_CATALOG")
    public String getViewCatalog() {
        return viewCatalog;
    }

    public void setViewCatalog(String viewCatalog) {
        this.viewCatalog = viewCatalog;
    }

    @Basic
    @Column(name = "VIEW_SCHEMA")
    public String getViewSchema() {
        return viewSchema;
    }

    public void setViewSchema(String viewSchema) {
        this.viewSchema = viewSchema;
    }

    @Basic
    @Column(name = "VIEW_NAME")
    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewTableUsageEntity that = (ViewTableUsageEntity) o;

        if (viewCatalog != null ? !viewCatalog.equals(that.viewCatalog) : that.viewCatalog != null) return false;
        if (viewSchema != null ? !viewSchema.equals(that.viewSchema) : that.viewSchema != null) return false;
        if (viewName != null ? !viewName.equals(that.viewName) : that.viewName != null) return false;
        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = viewCatalog != null ? viewCatalog.hashCode() : 0;
        result = 31 * result + (viewSchema != null ? viewSchema.hashCode() : 0);
        result = 31 * result + (viewName != null ? viewName.hashCode() : 0);
        result = 31 * result + (tableCatalog != null ? tableCatalog.hashCode() : 0);
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        return result;
    }
}
