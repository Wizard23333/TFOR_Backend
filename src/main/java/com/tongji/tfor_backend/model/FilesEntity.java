package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;

@Entity
@Table(name = "FILES", schema = "information_schema", catalog = "")
public class FilesEntity {
    private Long fileId;
    private String fileName;
    private String fileType;
    private String tablespaceName;
    private String tableCatalog;
    private byte[] tableSchema;
    private byte[] tableName;
    private String logfileGroupName;
    private Long logfileGroupNumber;
    private String engine;
    private byte[] fulltextKeys;
    private byte[] deletedRows;
    private byte[] updateCount;
    private Long freeExtents;
    private Long totalExtents;
    private Long extentSize;
    private Long initialSize;
    private Long maximumSize;
    private Long autoextendSize;
    private byte[] creationTime;
    private byte[] lastUpdateTime;
    private byte[] lastAccessTime;
    private byte[] recoverTime;
    private byte[] transactionCounter;
    private Long version;
    private String rowFormat;
    private byte[] tableRows;
    private byte[] avgRowLength;
    private byte[] dataLength;
    private byte[] maxDataLength;
    private byte[] indexLength;
    private Long dataFree;
    private byte[] createTime;
    private byte[] updateTime;
    private byte[] checkTime;
    private byte[] checksum;
    private String status;
    private String extra;

    @Basic
    @Column(name = "FILE_ID")
    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "FILE_NAME")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "FILE_TYPE")
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Basic
    @Column(name = "TABLESPACE_NAME")
    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
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
    public byte[] getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(byte[] tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Basic
    @Column(name = "TABLE_NAME")
    public byte[] getTableName() {
        return tableName;
    }

    public void setTableName(byte[] tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "LOGFILE_GROUP_NAME")
    public String getLogfileGroupName() {
        return logfileGroupName;
    }

    public void setLogfileGroupName(String logfileGroupName) {
        this.logfileGroupName = logfileGroupName;
    }

    @Basic
    @Column(name = "LOGFILE_GROUP_NUMBER")
    public Long getLogfileGroupNumber() {
        return logfileGroupNumber;
    }

    public void setLogfileGroupNumber(Long logfileGroupNumber) {
        this.logfileGroupNumber = logfileGroupNumber;
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
    @Column(name = "FULLTEXT_KEYS")
    public byte[] getFulltextKeys() {
        return fulltextKeys;
    }

    public void setFulltextKeys(byte[] fulltextKeys) {
        this.fulltextKeys = fulltextKeys;
    }

    @Basic
    @Column(name = "DELETED_ROWS")
    public byte[] getDeletedRows() {
        return deletedRows;
    }

    public void setDeletedRows(byte[] deletedRows) {
        this.deletedRows = deletedRows;
    }

    @Basic
    @Column(name = "UPDATE_COUNT")
    public byte[] getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(byte[] updateCount) {
        this.updateCount = updateCount;
    }

    @Basic
    @Column(name = "FREE_EXTENTS")
    public Long getFreeExtents() {
        return freeExtents;
    }

    public void setFreeExtents(Long freeExtents) {
        this.freeExtents = freeExtents;
    }

    @Basic
    @Column(name = "TOTAL_EXTENTS")
    public Long getTotalExtents() {
        return totalExtents;
    }

    public void setTotalExtents(Long totalExtents) {
        this.totalExtents = totalExtents;
    }

    @Basic
    @Column(name = "EXTENT_SIZE")
    public Long getExtentSize() {
        return extentSize;
    }

    public void setExtentSize(Long extentSize) {
        this.extentSize = extentSize;
    }

    @Basic
    @Column(name = "INITIAL_SIZE")
    public Long getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(Long initialSize) {
        this.initialSize = initialSize;
    }

    @Basic
    @Column(name = "MAXIMUM_SIZE")
    public Long getMaximumSize() {
        return maximumSize;
    }

    public void setMaximumSize(Long maximumSize) {
        this.maximumSize = maximumSize;
    }

    @Basic
    @Column(name = "AUTOEXTEND_SIZE")
    public Long getAutoextendSize() {
        return autoextendSize;
    }

    public void setAutoextendSize(Long autoextendSize) {
        this.autoextendSize = autoextendSize;
    }

    @Basic
    @Column(name = "CREATION_TIME")
    public byte[] getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(byte[] creationTime) {
        this.creationTime = creationTime;
    }

    @Basic
    @Column(name = "LAST_UPDATE_TIME")
    public byte[] getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(byte[] lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Basic
    @Column(name = "LAST_ACCESS_TIME")
    public byte[] getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(byte[] lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    @Basic
    @Column(name = "RECOVER_TIME")
    public byte[] getRecoverTime() {
        return recoverTime;
    }

    public void setRecoverTime(byte[] recoverTime) {
        this.recoverTime = recoverTime;
    }

    @Basic
    @Column(name = "TRANSACTION_COUNTER")
    public byte[] getTransactionCounter() {
        return transactionCounter;
    }

    public void setTransactionCounter(byte[] transactionCounter) {
        this.transactionCounter = transactionCounter;
    }

    @Basic
    @Column(name = "VERSION")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Basic
    @Column(name = "ROW_FORMAT")
    public String getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    @Basic
    @Column(name = "TABLE_ROWS")
    public byte[] getTableRows() {
        return tableRows;
    }

    public void setTableRows(byte[] tableRows) {
        this.tableRows = tableRows;
    }

    @Basic
    @Column(name = "AVG_ROW_LENGTH")
    public byte[] getAvgRowLength() {
        return avgRowLength;
    }

    public void setAvgRowLength(byte[] avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    @Basic
    @Column(name = "DATA_LENGTH")
    public byte[] getDataLength() {
        return dataLength;
    }

    public void setDataLength(byte[] dataLength) {
        this.dataLength = dataLength;
    }

    @Basic
    @Column(name = "MAX_DATA_LENGTH")
    public byte[] getMaxDataLength() {
        return maxDataLength;
    }

    public void setMaxDataLength(byte[] maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    @Basic
    @Column(name = "INDEX_LENGTH")
    public byte[] getIndexLength() {
        return indexLength;
    }

    public void setIndexLength(byte[] indexLength) {
        this.indexLength = indexLength;
    }

    @Basic
    @Column(name = "DATA_FREE")
    public Long getDataFree() {
        return dataFree;
    }

    public void setDataFree(Long dataFree) {
        this.dataFree = dataFree;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public byte[] getCreateTime() {
        return createTime;
    }

    public void setCreateTime(byte[] createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "UPDATE_TIME")
    public byte[] getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(byte[] updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "CHECK_TIME")
    public byte[] getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(byte[] checkTime) {
        this.checkTime = checkTime;
    }

    @Basic
    @Column(name = "CHECKSUM")
    public byte[] getChecksum() {
        return checksum;
    }

    public void setChecksum(byte[] checksum) {
        this.checksum = checksum;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "EXTRA")
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilesEntity that = (FilesEntity) o;

        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (fileType != null ? !fileType.equals(that.fileType) : that.fileType != null) return false;
        if (tablespaceName != null ? !tablespaceName.equals(that.tablespaceName) : that.tablespaceName != null)
            return false;
        if (tableCatalog != null ? !tableCatalog.equals(that.tableCatalog) : that.tableCatalog != null) return false;
        if (!Arrays.equals(tableSchema, that.tableSchema)) return false;
        if (!Arrays.equals(tableName, that.tableName)) return false;
        if (logfileGroupName != null ? !logfileGroupName.equals(that.logfileGroupName) : that.logfileGroupName != null)
            return false;
        if (logfileGroupNumber != null ? !logfileGroupNumber.equals(that.logfileGroupNumber) : that.logfileGroupNumber != null)
            return false;
        if (engine != null ? !engine.equals(that.engine) : that.engine != null) return false;
        if (!Arrays.equals(fulltextKeys, that.fulltextKeys)) return false;
        if (!Arrays.equals(deletedRows, that.deletedRows)) return false;
        if (!Arrays.equals(updateCount, that.updateCount)) return false;
        if (freeExtents != null ? !freeExtents.equals(that.freeExtents) : that.freeExtents != null) return false;
        if (totalExtents != null ? !totalExtents.equals(that.totalExtents) : that.totalExtents != null) return false;
        if (extentSize != null ? !extentSize.equals(that.extentSize) : that.extentSize != null) return false;
        if (initialSize != null ? !initialSize.equals(that.initialSize) : that.initialSize != null) return false;
        if (maximumSize != null ? !maximumSize.equals(that.maximumSize) : that.maximumSize != null) return false;
        if (autoextendSize != null ? !autoextendSize.equals(that.autoextendSize) : that.autoextendSize != null)
            return false;
        if (!Arrays.equals(creationTime, that.creationTime)) return false;
        if (!Arrays.equals(lastUpdateTime, that.lastUpdateTime)) return false;
        if (!Arrays.equals(lastAccessTime, that.lastAccessTime)) return false;
        if (!Arrays.equals(recoverTime, that.recoverTime)) return false;
        if (!Arrays.equals(transactionCounter, that.transactionCounter)) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (rowFormat != null ? !rowFormat.equals(that.rowFormat) : that.rowFormat != null) return false;
        if (!Arrays.equals(tableRows, that.tableRows)) return false;
        if (!Arrays.equals(avgRowLength, that.avgRowLength)) return false;
        if (!Arrays.equals(dataLength, that.dataLength)) return false;
        if (!Arrays.equals(maxDataLength, that.maxDataLength)) return false;
        if (!Arrays.equals(indexLength, that.indexLength)) return false;
        if (dataFree != null ? !dataFree.equals(that.dataFree) : that.dataFree != null) return false;
        if (!Arrays.equals(createTime, that.createTime)) return false;
        if (!Arrays.equals(updateTime, that.updateTime)) return false;
        if (!Arrays.equals(checkTime, that.checkTime)) return false;
        if (!Arrays.equals(checksum, that.checksum)) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (extra != null ? !extra.equals(that.extra) : that.extra != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (fileType != null ? fileType.hashCode() : 0);
        result = 31 * result + (tablespaceName != null ? tablespaceName.hashCode() : 0);
        result = 31 * result + (tableCatalog != null ? tableCatalog.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(tableSchema);
        result = 31 * result + Arrays.hashCode(tableName);
        result = 31 * result + (logfileGroupName != null ? logfileGroupName.hashCode() : 0);
        result = 31 * result + (logfileGroupNumber != null ? logfileGroupNumber.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(fulltextKeys);
        result = 31 * result + Arrays.hashCode(deletedRows);
        result = 31 * result + Arrays.hashCode(updateCount);
        result = 31 * result + (freeExtents != null ? freeExtents.hashCode() : 0);
        result = 31 * result + (totalExtents != null ? totalExtents.hashCode() : 0);
        result = 31 * result + (extentSize != null ? extentSize.hashCode() : 0);
        result = 31 * result + (initialSize != null ? initialSize.hashCode() : 0);
        result = 31 * result + (maximumSize != null ? maximumSize.hashCode() : 0);
        result = 31 * result + (autoextendSize != null ? autoextendSize.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(creationTime);
        result = 31 * result + Arrays.hashCode(lastUpdateTime);
        result = 31 * result + Arrays.hashCode(lastAccessTime);
        result = 31 * result + Arrays.hashCode(recoverTime);
        result = 31 * result + Arrays.hashCode(transactionCounter);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (rowFormat != null ? rowFormat.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(tableRows);
        result = 31 * result + Arrays.hashCode(avgRowLength);
        result = 31 * result + Arrays.hashCode(dataLength);
        result = 31 * result + Arrays.hashCode(maxDataLength);
        result = 31 * result + Arrays.hashCode(indexLength);
        result = 31 * result + (dataFree != null ? dataFree.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(createTime);
        result = 31 * result + Arrays.hashCode(updateTime);
        result = 31 * result + Arrays.hashCode(checkTime);
        result = 31 * result + Arrays.hashCode(checksum);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (extra != null ? extra.hashCode() : 0);
        return result;
    }
}
