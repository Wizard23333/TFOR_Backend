package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "INNODB_TRX", schema = "information_schema", catalog = "")
public class InnodbTrxEntity {
    private Object trxId;
    private String trxState;
    private Timestamp trxStarted;
    private String trxRequestedLockId;
    private Timestamp trxWaitStarted;
    private Object trxWeight;
    private Object trxMysqlThreadId;
    private String trxQuery;
    private String trxOperationState;
    private Object trxTablesInUse;
    private Object trxTablesLocked;
    private Object trxLockStructs;
    private Object trxLockMemoryBytes;
    private Object trxRowsLocked;
    private Object trxRowsModified;
    private Object trxConcurrencyTickets;
    private String trxIsolationLevel;
    private int trxUniqueChecks;
    private int trxForeignKeyChecks;
    private String trxLastForeignKeyError;
    private int trxAdaptiveHashLatched;
    private Object trxAdaptiveHashTimeout;
    private int trxIsReadOnly;
    private int trxAutocommitNonLocking;
    private Object trxScheduleWeight;

    @Basic
    @Column(name = "trx_id")
    public Object getTrxId() {
        return trxId;
    }

    public void setTrxId(Object trxId) {
        this.trxId = trxId;
    }

    @Basic
    @Column(name = "trx_state")
    public String getTrxState() {
        return trxState;
    }

    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    @Basic
    @Column(name = "trx_started")
    public Timestamp getTrxStarted() {
        return trxStarted;
    }

    public void setTrxStarted(Timestamp trxStarted) {
        this.trxStarted = trxStarted;
    }

    @Basic
    @Column(name = "trx_requested_lock_id")
    public String getTrxRequestedLockId() {
        return trxRequestedLockId;
    }

    public void setTrxRequestedLockId(String trxRequestedLockId) {
        this.trxRequestedLockId = trxRequestedLockId;
    }

    @Basic
    @Column(name = "trx_wait_started")
    public Timestamp getTrxWaitStarted() {
        return trxWaitStarted;
    }

    public void setTrxWaitStarted(Timestamp trxWaitStarted) {
        this.trxWaitStarted = trxWaitStarted;
    }

    @Basic
    @Column(name = "trx_weight")
    public Object getTrxWeight() {
        return trxWeight;
    }

    public void setTrxWeight(Object trxWeight) {
        this.trxWeight = trxWeight;
    }

    @Basic
    @Column(name = "trx_mysql_thread_id")
    public Object getTrxMysqlThreadId() {
        return trxMysqlThreadId;
    }

    public void setTrxMysqlThreadId(Object trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
    }

    @Basic
    @Column(name = "trx_query")
    public String getTrxQuery() {
        return trxQuery;
    }

    public void setTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
    }

    @Basic
    @Column(name = "trx_operation_state")
    public String getTrxOperationState() {
        return trxOperationState;
    }

    public void setTrxOperationState(String trxOperationState) {
        this.trxOperationState = trxOperationState;
    }

    @Basic
    @Column(name = "trx_tables_in_use")
    public Object getTrxTablesInUse() {
        return trxTablesInUse;
    }

    public void setTrxTablesInUse(Object trxTablesInUse) {
        this.trxTablesInUse = trxTablesInUse;
    }

    @Basic
    @Column(name = "trx_tables_locked")
    public Object getTrxTablesLocked() {
        return trxTablesLocked;
    }

    public void setTrxTablesLocked(Object trxTablesLocked) {
        this.trxTablesLocked = trxTablesLocked;
    }

    @Basic
    @Column(name = "trx_lock_structs")
    public Object getTrxLockStructs() {
        return trxLockStructs;
    }

    public void setTrxLockStructs(Object trxLockStructs) {
        this.trxLockStructs = trxLockStructs;
    }

    @Basic
    @Column(name = "trx_lock_memory_bytes")
    public Object getTrxLockMemoryBytes() {
        return trxLockMemoryBytes;
    }

    public void setTrxLockMemoryBytes(Object trxLockMemoryBytes) {
        this.trxLockMemoryBytes = trxLockMemoryBytes;
    }

    @Basic
    @Column(name = "trx_rows_locked")
    public Object getTrxRowsLocked() {
        return trxRowsLocked;
    }

    public void setTrxRowsLocked(Object trxRowsLocked) {
        this.trxRowsLocked = trxRowsLocked;
    }

    @Basic
    @Column(name = "trx_rows_modified")
    public Object getTrxRowsModified() {
        return trxRowsModified;
    }

    public void setTrxRowsModified(Object trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
    }

    @Basic
    @Column(name = "trx_concurrency_tickets")
    public Object getTrxConcurrencyTickets() {
        return trxConcurrencyTickets;
    }

    public void setTrxConcurrencyTickets(Object trxConcurrencyTickets) {
        this.trxConcurrencyTickets = trxConcurrencyTickets;
    }

    @Basic
    @Column(name = "trx_isolation_level")
    public String getTrxIsolationLevel() {
        return trxIsolationLevel;
    }

    public void setTrxIsolationLevel(String trxIsolationLevel) {
        this.trxIsolationLevel = trxIsolationLevel;
    }

    @Basic
    @Column(name = "trx_unique_checks")
    public int getTrxUniqueChecks() {
        return trxUniqueChecks;
    }

    public void setTrxUniqueChecks(int trxUniqueChecks) {
        this.trxUniqueChecks = trxUniqueChecks;
    }

    @Basic
    @Column(name = "trx_foreign_key_checks")
    public int getTrxForeignKeyChecks() {
        return trxForeignKeyChecks;
    }

    public void setTrxForeignKeyChecks(int trxForeignKeyChecks) {
        this.trxForeignKeyChecks = trxForeignKeyChecks;
    }

    @Basic
    @Column(name = "trx_last_foreign_key_error")
    public String getTrxLastForeignKeyError() {
        return trxLastForeignKeyError;
    }

    public void setTrxLastForeignKeyError(String trxLastForeignKeyError) {
        this.trxLastForeignKeyError = trxLastForeignKeyError;
    }

    @Basic
    @Column(name = "trx_adaptive_hash_latched")
    public int getTrxAdaptiveHashLatched() {
        return trxAdaptiveHashLatched;
    }

    public void setTrxAdaptiveHashLatched(int trxAdaptiveHashLatched) {
        this.trxAdaptiveHashLatched = trxAdaptiveHashLatched;
    }

    @Basic
    @Column(name = "trx_adaptive_hash_timeout")
    public Object getTrxAdaptiveHashTimeout() {
        return trxAdaptiveHashTimeout;
    }

    public void setTrxAdaptiveHashTimeout(Object trxAdaptiveHashTimeout) {
        this.trxAdaptiveHashTimeout = trxAdaptiveHashTimeout;
    }

    @Basic
    @Column(name = "trx_is_read_only")
    public int getTrxIsReadOnly() {
        return trxIsReadOnly;
    }

    public void setTrxIsReadOnly(int trxIsReadOnly) {
        this.trxIsReadOnly = trxIsReadOnly;
    }

    @Basic
    @Column(name = "trx_autocommit_non_locking")
    public int getTrxAutocommitNonLocking() {
        return trxAutocommitNonLocking;
    }

    public void setTrxAutocommitNonLocking(int trxAutocommitNonLocking) {
        this.trxAutocommitNonLocking = trxAutocommitNonLocking;
    }

    @Basic
    @Column(name = "trx_schedule_weight")
    public Object getTrxScheduleWeight() {
        return trxScheduleWeight;
    }

    public void setTrxScheduleWeight(Object trxScheduleWeight) {
        this.trxScheduleWeight = trxScheduleWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbTrxEntity that = (InnodbTrxEntity) o;

        if (trxUniqueChecks != that.trxUniqueChecks) return false;
        if (trxForeignKeyChecks != that.trxForeignKeyChecks) return false;
        if (trxAdaptiveHashLatched != that.trxAdaptiveHashLatched) return false;
        if (trxIsReadOnly != that.trxIsReadOnly) return false;
        if (trxAutocommitNonLocking != that.trxAutocommitNonLocking) return false;
        if (trxId != null ? !trxId.equals(that.trxId) : that.trxId != null) return false;
        if (trxState != null ? !trxState.equals(that.trxState) : that.trxState != null) return false;
        if (trxStarted != null ? !trxStarted.equals(that.trxStarted) : that.trxStarted != null) return false;
        if (trxRequestedLockId != null ? !trxRequestedLockId.equals(that.trxRequestedLockId) : that.trxRequestedLockId != null)
            return false;
        if (trxWaitStarted != null ? !trxWaitStarted.equals(that.trxWaitStarted) : that.trxWaitStarted != null)
            return false;
        if (trxWeight != null ? !trxWeight.equals(that.trxWeight) : that.trxWeight != null) return false;
        if (trxMysqlThreadId != null ? !trxMysqlThreadId.equals(that.trxMysqlThreadId) : that.trxMysqlThreadId != null)
            return false;
        if (trxQuery != null ? !trxQuery.equals(that.trxQuery) : that.trxQuery != null) return false;
        if (trxOperationState != null ? !trxOperationState.equals(that.trxOperationState) : that.trxOperationState != null)
            return false;
        if (trxTablesInUse != null ? !trxTablesInUse.equals(that.trxTablesInUse) : that.trxTablesInUse != null)
            return false;
        if (trxTablesLocked != null ? !trxTablesLocked.equals(that.trxTablesLocked) : that.trxTablesLocked != null)
            return false;
        if (trxLockStructs != null ? !trxLockStructs.equals(that.trxLockStructs) : that.trxLockStructs != null)
            return false;
        if (trxLockMemoryBytes != null ? !trxLockMemoryBytes.equals(that.trxLockMemoryBytes) : that.trxLockMemoryBytes != null)
            return false;
        if (trxRowsLocked != null ? !trxRowsLocked.equals(that.trxRowsLocked) : that.trxRowsLocked != null)
            return false;
        if (trxRowsModified != null ? !trxRowsModified.equals(that.trxRowsModified) : that.trxRowsModified != null)
            return false;
        if (trxConcurrencyTickets != null ? !trxConcurrencyTickets.equals(that.trxConcurrencyTickets) : that.trxConcurrencyTickets != null)
            return false;
        if (trxIsolationLevel != null ? !trxIsolationLevel.equals(that.trxIsolationLevel) : that.trxIsolationLevel != null)
            return false;
        if (trxLastForeignKeyError != null ? !trxLastForeignKeyError.equals(that.trxLastForeignKeyError) : that.trxLastForeignKeyError != null)
            return false;
        if (trxAdaptiveHashTimeout != null ? !trxAdaptiveHashTimeout.equals(that.trxAdaptiveHashTimeout) : that.trxAdaptiveHashTimeout != null)
            return false;
        if (trxScheduleWeight != null ? !trxScheduleWeight.equals(that.trxScheduleWeight) : that.trxScheduleWeight != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trxId != null ? trxId.hashCode() : 0;
        result = 31 * result + (trxState != null ? trxState.hashCode() : 0);
        result = 31 * result + (trxStarted != null ? trxStarted.hashCode() : 0);
        result = 31 * result + (trxRequestedLockId != null ? trxRequestedLockId.hashCode() : 0);
        result = 31 * result + (trxWaitStarted != null ? trxWaitStarted.hashCode() : 0);
        result = 31 * result + (trxWeight != null ? trxWeight.hashCode() : 0);
        result = 31 * result + (trxMysqlThreadId != null ? trxMysqlThreadId.hashCode() : 0);
        result = 31 * result + (trxQuery != null ? trxQuery.hashCode() : 0);
        result = 31 * result + (trxOperationState != null ? trxOperationState.hashCode() : 0);
        result = 31 * result + (trxTablesInUse != null ? trxTablesInUse.hashCode() : 0);
        result = 31 * result + (trxTablesLocked != null ? trxTablesLocked.hashCode() : 0);
        result = 31 * result + (trxLockStructs != null ? trxLockStructs.hashCode() : 0);
        result = 31 * result + (trxLockMemoryBytes != null ? trxLockMemoryBytes.hashCode() : 0);
        result = 31 * result + (trxRowsLocked != null ? trxRowsLocked.hashCode() : 0);
        result = 31 * result + (trxRowsModified != null ? trxRowsModified.hashCode() : 0);
        result = 31 * result + (trxConcurrencyTickets != null ? trxConcurrencyTickets.hashCode() : 0);
        result = 31 * result + (trxIsolationLevel != null ? trxIsolationLevel.hashCode() : 0);
        result = 31 * result + trxUniqueChecks;
        result = 31 * result + trxForeignKeyChecks;
        result = 31 * result + (trxLastForeignKeyError != null ? trxLastForeignKeyError.hashCode() : 0);
        result = 31 * result + trxAdaptiveHashLatched;
        result = 31 * result + (trxAdaptiveHashTimeout != null ? trxAdaptiveHashTimeout.hashCode() : 0);
        result = 31 * result + trxIsReadOnly;
        result = 31 * result + trxAutocommitNonLocking;
        result = 31 * result + (trxScheduleWeight != null ? trxScheduleWeight.hashCode() : 0);
        return result;
    }
}
