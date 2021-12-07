package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COLUMN_STATISTICS", schema = "information_schema", catalog = "")
public class ColumnStatisticsEntity {
    private String schemaName;
    private String tableName;
    private String columnName;
    private Object histogram;

    @Basic
    @Column(name = "SCHEMA_NAME")
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
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
    @Column(name = "HISTOGRAM")
    public Object getHistogram() {
        return histogram;
    }

    public void setHistogram(Object histogram) {
        this.histogram = histogram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ColumnStatisticsEntity that = (ColumnStatisticsEntity) o;

        if (schemaName != null ? !schemaName.equals(that.schemaName) : that.schemaName != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (columnName != null ? !columnName.equals(that.columnName) : that.columnName != null) return false;
        if (histogram != null ? !histogram.equals(that.histogram) : that.histogram != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schemaName != null ? schemaName.hashCode() : 0;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (columnName != null ? columnName.hashCode() : 0);
        result = 31 * result + (histogram != null ? histogram.hashCode() : 0);
        return result;
    }
}
