package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "REFERENTIAL_CONSTRAINTS", schema = "information_schema", catalog = "")
public class ReferentialConstraintsEntity {
    private String constraintCatalog;
    private String constraintSchema;
    private String constraintName;
    private String uniqueConstraintCatalog;
    private String uniqueConstraintSchema;
    private String uniqueConstraintName;
    private Object matchOption;
    private Object updateRule;
    private Object deleteRule;
    private String tableName;
    private String referencedTableName;

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
    @Column(name = "UNIQUE_CONSTRAINT_CATALOG")
    public String getUniqueConstraintCatalog() {
        return uniqueConstraintCatalog;
    }

    public void setUniqueConstraintCatalog(String uniqueConstraintCatalog) {
        this.uniqueConstraintCatalog = uniqueConstraintCatalog;
    }

    @Basic
    @Column(name = "UNIQUE_CONSTRAINT_SCHEMA")
    public String getUniqueConstraintSchema() {
        return uniqueConstraintSchema;
    }

    public void setUniqueConstraintSchema(String uniqueConstraintSchema) {
        this.uniqueConstraintSchema = uniqueConstraintSchema;
    }

    @Basic
    @Column(name = "UNIQUE_CONSTRAINT_NAME")
    public String getUniqueConstraintName() {
        return uniqueConstraintName;
    }

    public void setUniqueConstraintName(String uniqueConstraintName) {
        this.uniqueConstraintName = uniqueConstraintName;
    }

    @Basic
    @Column(name = "MATCH_OPTION")
    public Object getMatchOption() {
        return matchOption;
    }

    public void setMatchOption(Object matchOption) {
        this.matchOption = matchOption;
    }

    @Basic
    @Column(name = "UPDATE_RULE")
    public Object getUpdateRule() {
        return updateRule;
    }

    public void setUpdateRule(Object updateRule) {
        this.updateRule = updateRule;
    }

    @Basic
    @Column(name = "DELETE_RULE")
    public Object getDeleteRule() {
        return deleteRule;
    }

    public void setDeleteRule(Object deleteRule) {
        this.deleteRule = deleteRule;
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
    @Column(name = "REFERENCED_TABLE_NAME")
    public String getReferencedTableName() {
        return referencedTableName;
    }

    public void setReferencedTableName(String referencedTableName) {
        this.referencedTableName = referencedTableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReferentialConstraintsEntity that = (ReferentialConstraintsEntity) o;

        if (constraintCatalog != null ? !constraintCatalog.equals(that.constraintCatalog) : that.constraintCatalog != null)
            return false;
        if (constraintSchema != null ? !constraintSchema.equals(that.constraintSchema) : that.constraintSchema != null)
            return false;
        if (constraintName != null ? !constraintName.equals(that.constraintName) : that.constraintName != null)
            return false;
        if (uniqueConstraintCatalog != null ? !uniqueConstraintCatalog.equals(that.uniqueConstraintCatalog) : that.uniqueConstraintCatalog != null)
            return false;
        if (uniqueConstraintSchema != null ? !uniqueConstraintSchema.equals(that.uniqueConstraintSchema) : that.uniqueConstraintSchema != null)
            return false;
        if (uniqueConstraintName != null ? !uniqueConstraintName.equals(that.uniqueConstraintName) : that.uniqueConstraintName != null)
            return false;
        if (matchOption != null ? !matchOption.equals(that.matchOption) : that.matchOption != null) return false;
        if (updateRule != null ? !updateRule.equals(that.updateRule) : that.updateRule != null) return false;
        if (deleteRule != null ? !deleteRule.equals(that.deleteRule) : that.deleteRule != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (referencedTableName != null ? !referencedTableName.equals(that.referencedTableName) : that.referencedTableName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = constraintCatalog != null ? constraintCatalog.hashCode() : 0;
        result = 31 * result + (constraintSchema != null ? constraintSchema.hashCode() : 0);
        result = 31 * result + (constraintName != null ? constraintName.hashCode() : 0);
        result = 31 * result + (uniqueConstraintCatalog != null ? uniqueConstraintCatalog.hashCode() : 0);
        result = 31 * result + (uniqueConstraintSchema != null ? uniqueConstraintSchema.hashCode() : 0);
        result = 31 * result + (uniqueConstraintName != null ? uniqueConstraintName.hashCode() : 0);
        result = 31 * result + (matchOption != null ? matchOption.hashCode() : 0);
        result = 31 * result + (updateRule != null ? updateRule.hashCode() : 0);
        result = 31 * result + (deleteRule != null ? deleteRule.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (referencedTableName != null ? referencedTableName.hashCode() : 0);
        return result;
    }
}
