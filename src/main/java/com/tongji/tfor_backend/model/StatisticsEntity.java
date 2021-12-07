package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;

@Entity
@Table(name = "STATISTICS", schema = "information_schema", catalog = "")
public class StatisticsEntity {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private int nonUnique;
    private String indexSchema;
    private String indexName;
    private Object seqInIndex;
    private String columnName;
    private String collation;
    private Long cardinality;
    private Long subPart;
    private byte[] packed;
    private String nullable;
    private String indexType;
    private String comment;
    private String indexComment;
    private String isVisible;
    private String expression;

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
    @Column(name = "NON_UNIQUE")
    public int getNonUnique() {
        return nonUnique;
    }

    public void setNonUnique(int nonUnique) {
        this.nonUnique = nonUnique;
    }

    @Basic
    @Column(name = "INDEX_SCHEMA")
    public String getIndexSchema() {
        return indexSchema;
    }

    public void setIndexSchema(String indexSchema) {
        this.indexSchema = indexSchema;
    }

    @Basic
    @Column(name = "INDEX_NAME")
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Basic
    @Column(name = "SEQ_IN_INDEX")
    public Object getSeqInIndex() {
        return seqInIndex;
    }

    public void setSeqInIndex(Object seqInIndex) {
        this.seqInIndex = seqInIndex;
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
    @Column(name = "COLLATION")
    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    @Basic
    @Column(name = "CARDINALITY")
    public Long getCardinality() {
        return cardinality;
    }

    public void setCardinality(Long cardinality) {
        this.cardinality = cardinality;
    }

    @Basic
    @Column(name = "SUB_PART")
    public Long getSubPart() {
        return subPart;
    }

    public void setSubPart(Long subPart) {
        this.subPart = subPart;
    }

    @Basic
    @Column(name = "PACKED")
    public byte[] getPacked() {
        return packed;
    }

    public void setPacked(byte[] packed) {
        this.packed = packed;
    }

    @Basic
    @Column(name = "NULLABLE")
    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    @Basic
    @Column(name = "INDEX_TYPE")
    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    @Basic
    @Column(name = "COMMENT")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "INDEX_COMMENT")
    public String getIndexComment() {
        return indexComment;
    }

    public void setIndexComment(String indexComment) {
        this.indexComment = indexComment;
    }

    @Basic
    @Column(name = "IS_VISIBLE")
    public String getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }

    @Basic
    @Column(name = "EXPRESSION")
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatisticsEntity that = (StatisticsEntity) o;

        if (nonUnique != that.nonUnique) return false;
        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (indexSchema != null ? !indexSchema.equals(that.indexSchema) : that.indexSchema != null) return false;
        if (indexName != null ? !indexName.equals(that.indexName) : that.indexName != null) return false;
        if (seqInIndex != null ? !seqInIndex.equals(that.seqInIndex) : that.seqInIndex != null) return false;
        if (columnName != null ? !columnName.equals(that.columnName) : that.columnName != null) return false;
        if (collation != null ? !collation.equals(that.collation) : that.collation != null) return false;
        if (cardinality != null ? !cardinality.equals(that.cardinality) : that.cardinality != null) return false;
        if (subPart != null ? !subPart.equals(that.subPart) : that.subPart != null) return false;
        if (!Arrays.equals(packed, that.packed)) return false;
        if (nullable != null ? !nullable.equals(that.nullable) : that.nullable != null) return false;
        if (indexType != null ? !indexType.equals(that.indexType) : that.indexType != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (indexComment != null ? !indexComment.equals(that.indexComment) : that.indexComment != null) return false;
        if (isVisible != null ? !isVisible.equals(that.isVisible) : that.isVisible != null) return false;
        if (expression != null ? !expression.equals(that.expression) : that.expression != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableCatalog != null ? tableCatalog.hashCode() : 0;
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + nonUnique;
        result = 31 * result + (indexSchema != null ? indexSchema.hashCode() : 0);
        result = 31 * result + (indexName != null ? indexName.hashCode() : 0);
        result = 31 * result + (seqInIndex != null ? seqInIndex.hashCode() : 0);
        result = 31 * result + (columnName != null ? columnName.hashCode() : 0);
        result = 31 * result + (collation != null ? collation.hashCode() : 0);
        result = 31 * result + (cardinality != null ? cardinality.hashCode() : 0);
        result = 31 * result + (subPart != null ? subPart.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(packed);
        result = 31 * result + (nullable != null ? nullable.hashCode() : 0);
        result = 31 * result + (indexType != null ? indexType.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (indexComment != null ? indexComment.hashCode() : 0);
        result = 31 * result + (isVisible != null ? isVisible.hashCode() : 0);
        result = 31 * result + (expression != null ? expression.hashCode() : 0);
        return result;
    }
}
