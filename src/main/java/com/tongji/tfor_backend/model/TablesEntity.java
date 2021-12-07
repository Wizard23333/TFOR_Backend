package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TABLES", schema = "information_schema", catalog = "")
public class TablesEntity {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private Object tableType;
    private String engine;
    private Integer version;
    private Object rowFormat;
    private Object tableRows;
    private Object avgRowLength;
    private Object dataLength;
    private Object maxDataLength;
    private Object indexLength;
    private Object dataFree;
    private Object autoIncrement;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp checkTime;
    private String tableCollation;
    private Long checksum;
    private String createOptions;
    private String tableComment;

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
    @Column(name = "TABLE_TYPE")
    public Object getTableType() {
        return tableType;
    }

    public void setTableType(Object tableType) {
        this.tableType = tableType;
    }

    @Basic
    @Column(name = "ENGINE")
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Basic
    @Column(name = "VERSION")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "ROW_FORMAT")
    public Object getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(Object rowFormat) {
        this.rowFormat = rowFormat;
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
    @Column(name = "AUTO_INCREMENT")
    public Object getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(Object autoIncrement) {
        this.autoIncrement = autoIncrement;
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
    @Column(name = "TABLE_COLLATION")
    public String getTableCollation() {
        return tableCollation;
    }

    public void setTableCollation(String tableCollation) {
        this.tableCollation = tableCollation;
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
    @Column(name = "CREATE_OPTIONS")
    public String getCreateOptions() {
        return createOptions;
    }

    public void setCreateOptions(String createOptions) {
        this.createOptions = createOptions;
    }

    @Basic
    @Column(name = "TABLE_COMMENT")
    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TablesEntity that = (TablesEntity) o;

        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (tableType != null ? !tableType.equals(that.tableType) : that.tableType != null) return false;
        if (engine != null ? !engine.equals(that.engine) : that.engine != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (rowFormat != null ? !rowFormat.equals(that.rowFormat) : that.rowFormat != null) return false;
        if (tableRows != null ? !tableRows.equals(that.tableRows) : that.tableRows != null) return false;
        if (avgRowLength != null ? !avgRowLength.equals(that.avgRowLength) : that.avgRowLength != null) return false;
        if (dataLength != null ? !dataLength.equals(that.dataLength) : that.dataLength != null) return false;
        if (maxDataLength != null ? !maxDataLength.equals(that.maxDataLength) : that.maxDataLength != null)
            return false;
        if (indexLength != null ? !indexLength.equals(that.indexLength) : that.indexLength != null) return false;
        if (dataFree != null ? !dataFree.equals(that.dataFree) : that.dataFree != null) return false;
        if (autoIncrement != null ? !autoIncrement.equals(that.autoIncrement) : that.autoIncrement != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (checkTime != null ? !checkTime.equals(that.checkTime) : that.checkTime != null) return false;
        if (tableCollation != null ? !tableCollation.equals(that.tableCollation) : that.tableCollation != null)
            return false;
        if (checksum != null ? !checksum.equals(that.checksum) : that.checksum != null) return false;
        if (createOptions != null ? !createOptions.equals(that.createOptions) : that.createOptions != null)
            return false;
        if (tableComment != null ? !tableComment.equals(that.tableComment) : that.tableComment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableCatalog != null ? tableCatalog.hashCode() : 0;
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (tableType != null ? tableType.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (rowFormat != null ? rowFormat.hashCode() : 0);
        result = 31 * result + (tableRows != null ? tableRows.hashCode() : 0);
        result = 31 * result + (avgRowLength != null ? avgRowLength.hashCode() : 0);
        result = 31 * result + (dataLength != null ? dataLength.hashCode() : 0);
        result = 31 * result + (maxDataLength != null ? maxDataLength.hashCode() : 0);
        result = 31 * result + (indexLength != null ? indexLength.hashCode() : 0);
        result = 31 * result + (dataFree != null ? dataFree.hashCode() : 0);
        result = 31 * result + (autoIncrement != null ? autoIncrement.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
        result = 31 * result + (tableCollation != null ? tableCollation.hashCode() : 0);
        result = 31 * result + (checksum != null ? checksum.hashCode() : 0);
        result = 31 * result + (createOptions != null ? createOptions.hashCode() : 0);
        result = 31 * result + (tableComment != null ? tableComment.hashCode() : 0);
        return result;
    }
}
