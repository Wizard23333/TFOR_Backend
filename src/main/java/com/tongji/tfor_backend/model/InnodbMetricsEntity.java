package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "INNODB_METRICS", schema = "information_schema", catalog = "")
public class InnodbMetricsEntity {
    private String name;
    private String subsystem;
    private long count;
    private Long maxCount;
    private Long minCount;
    private Double avgCount;
    private long countReset;
    private Long maxCountReset;
    private Long minCountReset;
    private Double avgCountReset;
    private Timestamp timeEnabled;
    private Timestamp timeDisabled;
    private Long timeElapsed;
    private Timestamp timeReset;
    private String status;
    private String type;
    private String comment;

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SUBSYSTEM")
    public String getSubsystem() {
        return subsystem;
    }

    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    @Basic
    @Column(name = "COUNT")
    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Basic
    @Column(name = "MAX_COUNT")
    public Long getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Long maxCount) {
        this.maxCount = maxCount;
    }

    @Basic
    @Column(name = "MIN_COUNT")
    public Long getMinCount() {
        return minCount;
    }

    public void setMinCount(Long minCount) {
        this.minCount = minCount;
    }

    @Basic
    @Column(name = "AVG_COUNT")
    public Double getAvgCount() {
        return avgCount;
    }

    public void setAvgCount(Double avgCount) {
        this.avgCount = avgCount;
    }

    @Basic
    @Column(name = "COUNT_RESET")
    public long getCountReset() {
        return countReset;
    }

    public void setCountReset(long countReset) {
        this.countReset = countReset;
    }

    @Basic
    @Column(name = "MAX_COUNT_RESET")
    public Long getMaxCountReset() {
        return maxCountReset;
    }

    public void setMaxCountReset(Long maxCountReset) {
        this.maxCountReset = maxCountReset;
    }

    @Basic
    @Column(name = "MIN_COUNT_RESET")
    public Long getMinCountReset() {
        return minCountReset;
    }

    public void setMinCountReset(Long minCountReset) {
        this.minCountReset = minCountReset;
    }

    @Basic
    @Column(name = "AVG_COUNT_RESET")
    public Double getAvgCountReset() {
        return avgCountReset;
    }

    public void setAvgCountReset(Double avgCountReset) {
        this.avgCountReset = avgCountReset;
    }

    @Basic
    @Column(name = "TIME_ENABLED")
    public Timestamp getTimeEnabled() {
        return timeEnabled;
    }

    public void setTimeEnabled(Timestamp timeEnabled) {
        this.timeEnabled = timeEnabled;
    }

    @Basic
    @Column(name = "TIME_DISABLED")
    public Timestamp getTimeDisabled() {
        return timeDisabled;
    }

    public void setTimeDisabled(Timestamp timeDisabled) {
        this.timeDisabled = timeDisabled;
    }

    @Basic
    @Column(name = "TIME_ELAPSED")
    public Long getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(Long timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    @Basic
    @Column(name = "TIME_RESET")
    public Timestamp getTimeReset() {
        return timeReset;
    }

    public void setTimeReset(Timestamp timeReset) {
        this.timeReset = timeReset;
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
    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "COMMENT")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbMetricsEntity that = (InnodbMetricsEntity) o;

        if (count != that.count) return false;
        if (countReset != that.countReset) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (subsystem != null ? !subsystem.equals(that.subsystem) : that.subsystem != null) return false;
        if (maxCount != null ? !maxCount.equals(that.maxCount) : that.maxCount != null) return false;
        if (minCount != null ? !minCount.equals(that.minCount) : that.minCount != null) return false;
        if (avgCount != null ? !avgCount.equals(that.avgCount) : that.avgCount != null) return false;
        if (maxCountReset != null ? !maxCountReset.equals(that.maxCountReset) : that.maxCountReset != null)
            return false;
        if (minCountReset != null ? !minCountReset.equals(that.minCountReset) : that.minCountReset != null)
            return false;
        if (avgCountReset != null ? !avgCountReset.equals(that.avgCountReset) : that.avgCountReset != null)
            return false;
        if (timeEnabled != null ? !timeEnabled.equals(that.timeEnabled) : that.timeEnabled != null) return false;
        if (timeDisabled != null ? !timeDisabled.equals(that.timeDisabled) : that.timeDisabled != null) return false;
        if (timeElapsed != null ? !timeElapsed.equals(that.timeElapsed) : that.timeElapsed != null) return false;
        if (timeReset != null ? !timeReset.equals(that.timeReset) : that.timeReset != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (subsystem != null ? subsystem.hashCode() : 0);
        result = 31 * result + (int) (count ^ (count >>> 32));
        result = 31 * result + (maxCount != null ? maxCount.hashCode() : 0);
        result = 31 * result + (minCount != null ? minCount.hashCode() : 0);
        result = 31 * result + (avgCount != null ? avgCount.hashCode() : 0);
        result = 31 * result + (int) (countReset ^ (countReset >>> 32));
        result = 31 * result + (maxCountReset != null ? maxCountReset.hashCode() : 0);
        result = 31 * result + (minCountReset != null ? minCountReset.hashCode() : 0);
        result = 31 * result + (avgCountReset != null ? avgCountReset.hashCode() : 0);
        result = 31 * result + (timeEnabled != null ? timeEnabled.hashCode() : 0);
        result = 31 * result + (timeDisabled != null ? timeDisabled.hashCode() : 0);
        result = 31 * result + (timeElapsed != null ? timeElapsed.hashCode() : 0);
        result = 31 * result + (timeReset != null ? timeReset.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
