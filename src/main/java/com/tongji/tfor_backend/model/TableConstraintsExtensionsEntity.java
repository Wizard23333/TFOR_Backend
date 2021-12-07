package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE_CONSTRAINTS_EXTENSIONS", schema = "information_schema", catalog = "")
public class TableConstraintsExtensionsEntity {
    private String constraintCatalog;
    private String constraintSchema;
    private String constraintName;
    private String tableName;
    private Object engineAttribute;
    private Object secondaryEngineAttribute;

    @Basic
    @Column(name = "CONSTRAINT_CATALOG")
    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    @Basic
    @Column(name = "CONSTRAINT_SCHEMA")
    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    @Basic
    @Column(name = "CONSTRAINT_NAME")
    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
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
    @Column(name = "ENGINE_ATTRIBUTE")
    public Object getEngineAttribute() {
        return engineAttribute;
    }

    public void setEngineAttribute(Object engineAttribute) {
        this.engineAttribute = engineAttribute;
    }

    @Basic
    @Column(name = "SECONDARY_ENGINE_ATTRIBUTE")
    public Object getSecondaryEngineAttribute() {
        return secondaryEngineAttribute;
    }

    public void setSecondaryEngineAttribute(Object secondaryEngineAttribute) {
        this.secondaryEngineAttribute = secondaryEngineAttribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TableConstraintsExtensionsEntity that = (TableConstraintsExtensionsEntity) o;

        if (constraintCatalog != null ? !constraintCatalog.equals(that.constraintCatalog) : that.constraintCatalog != null)
            return false;
        if (constraintSchema != null ? !constraintSchema.equals(that.constraintSchema) : that.constraintSchema != null)
            return false;
        if (constraintName != null ? !constraintName.equals(that.constraintName) : that.constraintName != null)
            return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (engineAttribute != null ? !engineAttribute.equals(that.engineAttribute) : that.engineAttribute != null)
            return false;
        if (secondaryEngineAttribute != null ? !secondaryEngineAttribute.equals(that.secondaryEngineAttribute) : that.secondaryEngineAttribute != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = constraintCatalog != null ? constraintCatalog.hashCode() : 0;
        result = 31 * result + (constraintSchema != null ? constraintSchema.hashCode() : 0);
        result = 31 * result + (constraintName != null ? constraintName.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (engineAttribute != null ? engineAttribute.hashCode() : 0);
        result = 31 * result + (secondaryEngineAttribute != null ? secondaryEngineAttribute.hashCode() : 0);
        return result;
    }
}
