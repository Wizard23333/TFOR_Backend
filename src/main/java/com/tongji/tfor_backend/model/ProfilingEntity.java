package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "PROFILING", schema = "information_schema", catalog = "")
public class ProfilingEntity {
    private int queryId;
    private int seq;
    private String state;
    private BigInteger duration;
    private BigInteger cpuUser;
    private BigInteger cpuSystem;
    private Integer contextVoluntary;
    private Integer contextInvoluntary;
    private Integer blockOpsIn;
    private Integer blockOpsOut;
    private Integer messagesSent;
    private Integer messagesReceived;
    private Integer pageFaultsMajor;
    private Integer pageFaultsMinor;
    private Integer swaps;
    private String sourceFunction;
    private String sourceFile;
    private Integer sourceLine;

    @Basic
    @Column(name = "QUERY_ID")
    public int getQueryId() {
        return queryId;
    }

    public void setQueryId(int queryId) {
        this.queryId = queryId;
    }

    @Basic
    @Column(name = "SEQ")
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    @Basic
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "DURATION")
    public BigInteger getDuration() {
        return duration;
    }

    public void setDuration(BigInteger duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "CPU_USER")
    public BigInteger getCpuUser() {
        return cpuUser;
    }

    public void setCpuUser(BigInteger cpuUser) {
        this.cpuUser = cpuUser;
    }

    @Basic
    @Column(name = "CPU_SYSTEM")
    public BigInteger getCpuSystem() {
        return cpuSystem;
    }

    public void setCpuSystem(BigInteger cpuSystem) {
        this.cpuSystem = cpuSystem;
    }

    @Basic
    @Column(name = "CONTEXT_VOLUNTARY")
    public Integer getContextVoluntary() {
        return contextVoluntary;
    }

    public void setContextVoluntary(Integer contextVoluntary) {
        this.contextVoluntary = contextVoluntary;
    }

    @Basic
    @Column(name = "CONTEXT_INVOLUNTARY")
    public Integer getContextInvoluntary() {
        return contextInvoluntary;
    }

    public void setContextInvoluntary(Integer contextInvoluntary) {
        this.contextInvoluntary = contextInvoluntary;
    }

    @Basic
    @Column(name = "BLOCK_OPS_IN")
    public Integer getBlockOpsIn() {
        return blockOpsIn;
    }

    public void setBlockOpsIn(Integer blockOpsIn) {
        this.blockOpsIn = blockOpsIn;
    }

    @Basic
    @Column(name = "BLOCK_OPS_OUT")
    public Integer getBlockOpsOut() {
        return blockOpsOut;
    }

    public void setBlockOpsOut(Integer blockOpsOut) {
        this.blockOpsOut = blockOpsOut;
    }

    @Basic
    @Column(name = "MESSAGES_SENT")
    public Integer getMessagesSent() {
        return messagesSent;
    }

    public void setMessagesSent(Integer messagesSent) {
        this.messagesSent = messagesSent;
    }

    @Basic
    @Column(name = "MESSAGES_RECEIVED")
    public Integer getMessagesReceived() {
        return messagesReceived;
    }

    public void setMessagesReceived(Integer messagesReceived) {
        this.messagesReceived = messagesReceived;
    }

    @Basic
    @Column(name = "PAGE_FAULTS_MAJOR")
    public Integer getPageFaultsMajor() {
        return pageFaultsMajor;
    }

    public void setPageFaultsMajor(Integer pageFaultsMajor) {
        this.pageFaultsMajor = pageFaultsMajor;
    }

    @Basic
    @Column(name = "PAGE_FAULTS_MINOR")
    public Integer getPageFaultsMinor() {
        return pageFaultsMinor;
    }

    public void setPageFaultsMinor(Integer pageFaultsMinor) {
        this.pageFaultsMinor = pageFaultsMinor;
    }

    @Basic
    @Column(name = "SWAPS")
    public Integer getSwaps() {
        return swaps;
    }

    public void setSwaps(Integer swaps) {
        this.swaps = swaps;
    }

    @Basic
    @Column(name = "SOURCE_FUNCTION")
    public String getSourceFunction() {
        return sourceFunction;
    }

    public void setSourceFunction(String sourceFunction) {
        this.sourceFunction = sourceFunction;
    }

    @Basic
    @Column(name = "SOURCE_FILE")
    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    @Basic
    @Column(name = "SOURCE_LINE")
    public Integer getSourceLine() {
        return sourceLine;
    }

    public void setSourceLine(Integer sourceLine) {
        this.sourceLine = sourceLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfilingEntity that = (ProfilingEntity) o;

        if (queryId != that.queryId) return false;
        if (seq != that.seq) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (cpuUser != null ? !cpuUser.equals(that.cpuUser) : that.cpuUser != null) return false;
        if (cpuSystem != null ? !cpuSystem.equals(that.cpuSystem) : that.cpuSystem != null) return false;
        if (contextVoluntary != null ? !contextVoluntary.equals(that.contextVoluntary) : that.contextVoluntary != null)
            return false;
        if (contextInvoluntary != null ? !contextInvoluntary.equals(that.contextInvoluntary) : that.contextInvoluntary != null)
            return false;
        if (blockOpsIn != null ? !blockOpsIn.equals(that.blockOpsIn) : that.blockOpsIn != null) return false;
        if (blockOpsOut != null ? !blockOpsOut.equals(that.blockOpsOut) : that.blockOpsOut != null) return false;
        if (messagesSent != null ? !messagesSent.equals(that.messagesSent) : that.messagesSent != null) return false;
        if (messagesReceived != null ? !messagesReceived.equals(that.messagesReceived) : that.messagesReceived != null)
            return false;
        if (pageFaultsMajor != null ? !pageFaultsMajor.equals(that.pageFaultsMajor) : that.pageFaultsMajor != null)
            return false;
        if (pageFaultsMinor != null ? !pageFaultsMinor.equals(that.pageFaultsMinor) : that.pageFaultsMinor != null)
            return false;
        if (swaps != null ? !swaps.equals(that.swaps) : that.swaps != null) return false;
        if (sourceFunction != null ? !sourceFunction.equals(that.sourceFunction) : that.sourceFunction != null)
            return false;
        if (sourceFile != null ? !sourceFile.equals(that.sourceFile) : that.sourceFile != null) return false;
        if (sourceLine != null ? !sourceLine.equals(that.sourceLine) : that.sourceLine != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = queryId;
        result = 31 * result + seq;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (cpuUser != null ? cpuUser.hashCode() : 0);
        result = 31 * result + (cpuSystem != null ? cpuSystem.hashCode() : 0);
        result = 31 * result + (contextVoluntary != null ? contextVoluntary.hashCode() : 0);
        result = 31 * result + (contextInvoluntary != null ? contextInvoluntary.hashCode() : 0);
        result = 31 * result + (blockOpsIn != null ? blockOpsIn.hashCode() : 0);
        result = 31 * result + (blockOpsOut != null ? blockOpsOut.hashCode() : 0);
        result = 31 * result + (messagesSent != null ? messagesSent.hashCode() : 0);
        result = 31 * result + (messagesReceived != null ? messagesReceived.hashCode() : 0);
        result = 31 * result + (pageFaultsMajor != null ? pageFaultsMajor.hashCode() : 0);
        result = 31 * result + (pageFaultsMinor != null ? pageFaultsMinor.hashCode() : 0);
        result = 31 * result + (swaps != null ? swaps.hashCode() : 0);
        result = 31 * result + (sourceFunction != null ? sourceFunction.hashCode() : 0);
        result = 31 * result + (sourceFile != null ? sourceFile.hashCode() : 0);
        result = 31 * result + (sourceLine != null ? sourceLine.hashCode() : 0);
        return result;
    }
}
