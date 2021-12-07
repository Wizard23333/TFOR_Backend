package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_BUFFER_PAGE", schema = "information_schema", catalog = "")
public class InnodbBufferPageEntity {
    private Object poolId;
    private Object blockId;
    private Object space;
    private Object pageNumber;
    private String pageType;
    private Object flushType;
    private Object fixCount;
    private String isHashed;
    private Object newestModification;
    private Object oldestModification;
    private Object accessTime;
    private String tableName;
    private String indexName;
    private Object numberRecords;
    private Object dataSize;
    private Object compressedSize;
    private String pageState;
    private String ioFix;
    private String isOld;
    private Object freePageClock;

    @Basic
    @Column(name = "POOL_ID")
    public Object getPoolId() {
        return poolId;
    }

    public void setPoolId(Object poolId) {
        this.poolId = poolId;
    }

    @Basic
    @Column(name = "BLOCK_ID")
    public Object getBlockId() {
        return blockId;
    }

    public void setBlockId(Object blockId) {
        this.blockId = blockId;
    }

    @Basic
    @Column(name = "SPACE")
    public Object getSpace() {
        return space;
    }

    public void setSpace(Object space) {
        this.space = space;
    }

    @Basic
    @Column(name = "PAGE_NUMBER")
    public Object getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Object pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Basic
    @Column(name = "PAGE_TYPE")
    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    @Basic
    @Column(name = "FLUSH_TYPE")
    public Object getFlushType() {
        return flushType;
    }

    public void setFlushType(Object flushType) {
        this.flushType = flushType;
    }

    @Basic
    @Column(name = "FIX_COUNT")
    public Object getFixCount() {
        return fixCount;
    }

    public void setFixCount(Object fixCount) {
        this.fixCount = fixCount;
    }

    @Basic
    @Column(name = "IS_HASHED")
    public String getIsHashed() {
        return isHashed;
    }

    public void setIsHashed(String isHashed) {
        this.isHashed = isHashed;
    }

    @Basic
    @Column(name = "NEWEST_MODIFICATION")
    public Object getNewestModification() {
        return newestModification;
    }

    public void setNewestModification(Object newestModification) {
        this.newestModification = newestModification;
    }

    @Basic
    @Column(name = "OLDEST_MODIFICATION")
    public Object getOldestModification() {
        return oldestModification;
    }

    public void setOldestModification(Object oldestModification) {
        this.oldestModification = oldestModification;
    }

    @Basic
    @Column(name = "ACCESS_TIME")
    public Object getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Object accessTime) {
        this.accessTime = accessTime;
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
    @Column(name = "INDEX_NAME")
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Basic
    @Column(name = "NUMBER_RECORDS")
    public Object getNumberRecords() {
        return numberRecords;
    }

    public void setNumberRecords(Object numberRecords) {
        this.numberRecords = numberRecords;
    }

    @Basic
    @Column(name = "DATA_SIZE")
    public Object getDataSize() {
        return dataSize;
    }

    public void setDataSize(Object dataSize) {
        this.dataSize = dataSize;
    }

    @Basic
    @Column(name = "COMPRESSED_SIZE")
    public Object getCompressedSize() {
        return compressedSize;
    }

    public void setCompressedSize(Object compressedSize) {
        this.compressedSize = compressedSize;
    }

    @Basic
    @Column(name = "PAGE_STATE")
    public String getPageState() {
        return pageState;
    }

    public void setPageState(String pageState) {
        this.pageState = pageState;
    }

    @Basic
    @Column(name = "IO_FIX")
    public String getIoFix() {
        return ioFix;
    }

    public void setIoFix(String ioFix) {
        this.ioFix = ioFix;
    }

    @Basic
    @Column(name = "IS_OLD")
    public String getIsOld() {
        return isOld;
    }

    public void setIsOld(String isOld) {
        this.isOld = isOld;
    }

    @Basic
    @Column(name = "FREE_PAGE_CLOCK")
    public Object getFreePageClock() {
        return freePageClock;
    }

    public void setFreePageClock(Object freePageClock) {
        this.freePageClock = freePageClock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbBufferPageEntity that = (InnodbBufferPageEntity) o;

        if (poolId != null ? !poolId.equals(that.poolId) : that.poolId != null) return false;
        if (blockId != null ? !blockId.equals(that.blockId) : that.blockId != null) return false;
        if (space != null ? !space.equals(that.space) : that.space != null) return false;
        if (pageNumber != null ? !pageNumber.equals(that.pageNumber) : that.pageNumber != null) return false;
        if (pageType != null ? !pageType.equals(that.pageType) : that.pageType != null) return false;
        if (flushType != null ? !flushType.equals(that.flushType) : that.flushType != null) return false;
        if (fixCount != null ? !fixCount.equals(that.fixCount) : that.fixCount != null) return false;
        if (isHashed != null ? !isHashed.equals(that.isHashed) : that.isHashed != null) return false;
        if (newestModification != null ? !newestModification.equals(that.newestModification) : that.newestModification != null)
            return false;
        if (oldestModification != null ? !oldestModification.equals(that.oldestModification) : that.oldestModification != null)
            return false;
        if (accessTime != null ? !accessTime.equals(that.accessTime) : that.accessTime != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (indexName != null ? !indexName.equals(that.indexName) : that.indexName != null) return false;
        if (numberRecords != null ? !numberRecords.equals(that.numberRecords) : that.numberRecords != null)
            return false;
        if (dataSize != null ? !dataSize.equals(that.dataSize) : that.dataSize != null) return false;
        if (compressedSize != null ? !compressedSize.equals(that.compressedSize) : that.compressedSize != null)
            return false;
        if (pageState != null ? !pageState.equals(that.pageState) : that.pageState != null) return false;
        if (ioFix != null ? !ioFix.equals(that.ioFix) : that.ioFix != null) return false;
        if (isOld != null ? !isOld.equals(that.isOld) : that.isOld != null) return false;
        if (freePageClock != null ? !freePageClock.equals(that.freePageClock) : that.freePageClock != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = poolId != null ? poolId.hashCode() : 0;
        result = 31 * result + (blockId != null ? blockId.hashCode() : 0);
        result = 31 * result + (space != null ? space.hashCode() : 0);
        result = 31 * result + (pageNumber != null ? pageNumber.hashCode() : 0);
        result = 31 * result + (pageType != null ? pageType.hashCode() : 0);
        result = 31 * result + (flushType != null ? flushType.hashCode() : 0);
        result = 31 * result + (fixCount != null ? fixCount.hashCode() : 0);
        result = 31 * result + (isHashed != null ? isHashed.hashCode() : 0);
        result = 31 * result + (newestModification != null ? newestModification.hashCode() : 0);
        result = 31 * result + (oldestModification != null ? oldestModification.hashCode() : 0);
        result = 31 * result + (accessTime != null ? accessTime.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (indexName != null ? indexName.hashCode() : 0);
        result = 31 * result + (numberRecords != null ? numberRecords.hashCode() : 0);
        result = 31 * result + (dataSize != null ? dataSize.hashCode() : 0);
        result = 31 * result + (compressedSize != null ? compressedSize.hashCode() : 0);
        result = 31 * result + (pageState != null ? pageState.hashCode() : 0);
        result = 31 * result + (ioFix != null ? ioFix.hashCode() : 0);
        result = 31 * result + (isOld != null ? isOld.hashCode() : 0);
        result = 31 * result + (freePageClock != null ? freePageClock.hashCode() : 0);
        return result;
    }
}
