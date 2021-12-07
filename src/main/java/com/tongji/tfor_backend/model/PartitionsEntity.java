package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "PARTITIONS", schema = "information_schema", catalog = "")
public class PartitionsEntity {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String partitionName;
    private String subpartitionName;
    private Object partitionOrdinalPosition;
    private Object subpartitionOrdinalPosition;
    private String partitionMethod;
    private String subpartitionMethod;
    private String partitionExpression;
    private String subpartitionExpression;
    private String partitionDescription;
    private Object tableRows;
    private Object avgRowLength;
    private Object dataLength;
    private Object maxDataLength;
    private Object indexLength;
    private Object dataFree;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp checkTime;
    private Long checksum;
    private String partitionComment;
    private String nodegroup;
    private String tablespaceName;

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
    @Column(name = "PARTITION_NAME")
    public String getPartitionName() {
        return partitionName;
    }

    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    @Basic
    @Column(name = "SUBPARTITION_NAME")
    public String getSubpartitionName() {
        return subpartitionName;
    }

    public void setSubpartitionName(String subpartitionName) {
        this.subpartitionName = subpartitionName;
    }

    @Basic
    @Column(name = "PARTITION_ORDINAL_POSITION")
    public Object getPartitionOrdinalPosition() {
        return partitionOrdinalPosition;
    }

    public void setPartitionOrdinalPosition(Object partitionOrdinalPosition) {
        this.partitionOrdinalPosition = partitionOrdinalPosition;
    }

    @Basic
    @Column(name = "SUBPARTITION_ORDINAL_POSITION")
    public Object getSubpartitionOrdinalPosition() {
        return subpartitionOrdinalPosition;
    }

    public void setSubpartitionOrdinalPosition(Object subpartitionOrdinalPosition) {
        this.subpartitionOrdinalPosition = subpartitionOrdinalPosition;
    }

    @Basic
    @Column(name = "PARTITION_METHOD")
    public String getPartitionMethod() {
        return partitionMethod;
    }

    public void setPartitionMethod(String partitionMethod) {
        this.partitionMethod = partitionMethod;
    }

    @Basic
    @Column(name = "SUBPARTITION_METHOD")
    public String getSubpartitionMethod() {
        return subpartitionMethod;
    }

    public void setSubpartitionMethod(String subpartitionMethod) {
        this.subpartitionMethod = subpartitionMethod;
    }

    @Basic
    @Column(name = "PARTITION_EXPRESSION")
    public String getPartitionExpression() {
        return partitionExpression;
    }

    public void setPartitionExpression(String partitionExpression) {
        this.partitionExpression = partitionExpression;
    }

    @Basic
    @Column(name = "SUBPARTITION_EXPRESSION")
    public String getSubpartitionExpression() {
        return subpartitionExpression;
    }

    public void setSubpartitionExpression(String subpartitionExpression) {
        this.subpartitionExpression = subpartitionExpression;
    }

    @Basic
    @Column(name = "PARTITION_DESCRIPTION")
    public String getPartitionDescription() {
        return partitionDescription;
    }

    public void setPartitionDescription(String partitionDescription) {
        this.partitionDescription = partitionDescription;
    }

    @Basic
    @Column(name = "TABLE_ROWS")
    public Object getTableRows() {
        return tableRows;
    }

    public void setTableRows(Object tableRows) {
        this.tableRows = tableRows;
    }

    @Basic
    @Column(name = "AVG_ROW_LENGTH")
    public Object getAvgRowLength() {
        return avgRowLength;
    }

    public void setAvgRowLength(Object avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    @Basic
    @Column(name = "DATA_LENGTH")
    public Object getDataLength() {
        return dataLength;
    }

    public void setDataLength(Object dataLength) {
        this.dataLength = dataLength;
    }

    @Basic
    @Column(name = "MAX_DATA_LENGTH")
    public Object getMaxDataLength() {
        return maxDataLength;
    }

    public void setMaxDataLength(Object maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    @Basic
    @Column(name = "INDEX_LENGTH")
    public Object getIndexLength() {
        return indexLength;
    }

    public void setIndexLength(Object indexLength) {
        this.indexLength = indexLength;
    }

    @Basic
    @Column(name = "DATA_FREE")
    public Object getDataFree() {
        return dataFree;
    }

    public void setDataFree(Object dataFree) {
        this.dataFree = dataFree;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "UPDATE_TIME")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "CHECK_TIME")
    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    @Basic
    @Column(name = "CHECKSUM")
    public Long getChecksum() {
        return checksum;
    }

    public void setChecksum(Long checksum) {
        this.checksum = checksum;
    }

    @Basic
    @Column(name = "PARTITION_COMMENT")
    public String getPartitionComment() {
        return partitionComment;
    }

    public void setPartitionComment(String partitionComment) {
        this.partitionComment = partitionComment;
    }

    @Basic
    @Column(name = "NODEGROUP")
    public String getNodegroup() {
        return nodegroup;
    }

    public void setNodegroup(String nodegroup) {
        this.nodegroup = nodegroup;
    }

    @Basic
    @Column(name = "TABLESPACE_NAME")
    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartitionsEntity that = (PartitionsEntity) o;

        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (partitionName != null ? !partitionName.equals(that.partitionName) : that.partitionName != null)
            return false;
        if (subpartitionName != null ? !subpartitionName.equals(that.subpartitionName) : that.subpartitionName != null)
            return false;
        if (partitionOrdinalPosition != null ? !partitionOrdinalPosition.equals(that.partitionOrdinalPosition) : that.partitionOrdinalPosition != null)
            return false;
        if (subpartitionOrdinalPosition != null ? !subpartitionOrdinalPosition.equals(that.subpartitionOrdinalPosition) : that.subpartitionOrdinalPosition != null)
            return false;
        if (partitionMethod != null ? !partitionMethod.equals(that.partitionMethod) : that.partitionMethod != null)
            return false;
        if (subpartitionMethod != null ? !subpartitionMethod.equals(that.subpartitionMethod) : that.subpartitionMethod != null)
            return false;
        if (partitionExpression != null ? !partitionExpression.equals(that.partitionExpression) : that.partitionExpression != null)
            return false;
        if (subpartitionExpression != null ? !subpartitionExpression.equals(that.subpartitionExpression) : that.subpartitionExpression != null)
            return false;
        if (partitionDescription != null ? !partitionDescription.equals(that.partitionDescription) : that.partitionDescription != null)
            return false;
        if (tableRows != null ? !tableRows.equals(that.tableRows) : that.tableRows != null) return false;
        if (avgRowLength != null ? !avgRowLength.equals(that.avgRowLength) : that.avgRowLength != null) return false;
        if (dataLength != null ? !dataLength.equals(that.dataLength) : that.dataLength != null) return false;
        if (maxDataLength != null ? !maxDataLength.equals(that.maxDataLength) : that.maxDataLength != null)
            return false;
        if (indexLength != null ? !indexLength.equals(that.indexLength) : that.indexLength != null) return false;
        if (dataFree != null ? !dataFree.equals(that.dataFree) : that.dataFree != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (checkTime != null ? !checkTime.equals(that.checkTime) : that.checkTime != null) return false;
        if (checksum != null ? !checksum.equals(that.checksum) : that.checksum != null) return false;
        if (partitionComment != null ? !partitionComment.equals(that.partitionComment) : that.partitionComment != null)
            return false;
        if (nodegroup != null ? !nodegroup.equals(that.nodegroup) : that.nodegroup != null) return false;
        if (tablespaceName != null ? !tablespaceName.equals(that.tablespaceName) : that.tablespaceName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableCatalog != null ? tableCatalog.hashCode() : 0;
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (partitionName != null ? partitionName.hashCode() : 0);
        result = 31 * result + (subpartitionName != null ? subpartitionName.hashCode() : 0);
        result = 31 * result + (partitionOrdinalPosition != null ? partitionOrdinalPosition.hashCode() : 0);
        result = 31 * result + (subpartitionOrdinalPosition != null ? subpartitionOrdinalPosition.hashCode() : 0);
        result = 31 * result + (partitionMethod != null ? partitionMethod.hashCode() : 0);
        result = 31 * result + (subpartitionMethod != null ? subpartitionMethod.hashCode() : 0);
        result = 31 * result + (partitionExpression != null ? partitionExpression.hashCode() : 0);
        result = 31 * result + (subpartitionExpression != null ? subpartitionExpression.hashCode() : 0);
        result = 31 * result + (partitionDescription != null ? partitionDescription.hashCode() : 0);
        result = 31 * result + (tableRows != null ? tableRows.hashCode() : 0);
        result = 31 * result + (avgRowLength != null ? avgRowLength.hashCode() : 0);
        result = 31 * result + (dataLength != null ? dataLength.hashCode() : 0);
        result = 31 * result + (maxDataLength != null ? maxDataLength.hashCode() : 0);
        result = 31 * result + (indexLength != null ? indexLength.hashCode() : 0);
        result = 31 * result + (dataFree != null ? dataFree.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
        result = 31 * result + (checksum != null ? checksum.hashCode() : 0);
        result = 31 * result + (partitionComment != null ? partitionComment.hashCode() : 0);
        result = 31 * result + (nodegroup != null ? nodegroup.hashCode() : 0);
        result = 31 * result + (tablespaceName != null ? tablespaceName.hashCode() : 0);
        return result;
    }
}
