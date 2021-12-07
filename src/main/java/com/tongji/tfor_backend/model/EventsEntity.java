package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "EVENTS", schema = "information_schema", catalog = "")
public class EventsEntity {
    private String eventCatalog;
    private String eventSchema;
    private String eventName;
    private String definer;
    private String timeZone;
    private String eventBody;
    private String eventDefinition;
    private String eventType;
    private Timestamp executeAt;
    private String intervalValue;
    private Object intervalField;
    private Object sqlMode;
    private Timestamp starts;
    private Timestamp ends;
    private Object status;
    private String onCompletion;
    private Timestamp created;
    private Timestamp lastAltered;
    private Timestamp lastExecuted;
    private String eventComment;
    private Object originator;
    private String characterSetClient;
    private String collationConnection;
    private String databaseCollation;

    @Basic
    @Column(name = "EVENT_CATALOG")
    public String getEventCatalog() {
        return eventCatalog;
    }

    public void setEventCatalog(String eventCatalog) {
        this.eventCatalog = eventCatalog;
    }

    @Basic
    @Column(name = "EVENT_SCHEMA")
    public String getEventSchema() {
        return eventSchema;
    }

    public void setEventSchema(String eventSchema) {
        this.eventSchema = eventSchema;
    }

    @Basic
    @Column(name = "EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Basic
    @Column(name = "DEFINER")
    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    @Basic
    @Column(name = "TIME_ZONE")
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Basic
    @Column(name = "EVENT_BODY")
    public String getEventBody() {
        return eventBody;
    }

    public void setEventBody(String eventBody) {
        this.eventBody = eventBody;
    }

    @Basic
    @Column(name = "EVENT_DEFINITION")
    public String getEventDefinition() {
        return eventDefinition;
    }

    public void setEventDefinition(String eventDefinition) {
        this.eventDefinition = eventDefinition;
    }

    @Basic
    @Column(name = "EVENT_TYPE")
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Basic
    @Column(name = "EXECUTE_AT")
    public Timestamp getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Timestamp executeAt) {
        this.executeAt = executeAt;
    }

    @Basic
    @Column(name = "INTERVAL_VALUE")
    public String getIntervalValue() {
        return intervalValue;
    }

    public void setIntervalValue(String intervalValue) {
        this.intervalValue = intervalValue;
    }

    @Basic
    @Column(name = "INTERVAL_FIELD")
    public Object getIntervalField() {
        return intervalField;
    }

    public void setIntervalField(Object intervalField) {
        this.intervalField = intervalField;
    }

    @Basic
    @Column(name = "SQL_MODE")
    public Object getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(Object sqlMode) {
        this.sqlMode = sqlMode;
    }

    @Basic
    @Column(name = "STARTS")
    public Timestamp getStarts() {
        return starts;
    }

    public void setStarts(Timestamp starts) {
        this.starts = starts;
    }

    @Basic
    @Column(name = "ENDS")
    public Timestamp getEnds() {
        return ends;
    }

    public void setEnds(Timestamp ends) {
        this.ends = ends;
    }

    @Basic
    @Column(name = "STATUS")
    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ON_COMPLETION")
    public String getOnCompletion() {
        return onCompletion;
    }

    public void setOnCompletion(String onCompletion) {
        this.onCompletion = onCompletion;
    }

    @Basic
    @Column(name = "CREATED")
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "LAST_ALTERED")
    public Timestamp getLastAltered() {
        return lastAltered;
    }

    public void setLastAltered(Timestamp lastAltered) {
        this.lastAltered = lastAltered;
    }

    @Basic
    @Column(name = "LAST_EXECUTED")
    public Timestamp getLastExecuted() {
        return lastExecuted;
    }

    public void setLastExecuted(Timestamp lastExecuted) {
        this.lastExecuted = lastExecuted;
    }

    @Basic
    @Column(name = "EVENT_COMMENT")
    public String getEventComment() {
        return eventComment;
    }

    public void setEventComment(String eventComment) {
        this.eventComment = eventComment;
    }

    @Basic
    @Column(name = "ORIGINATOR")
    public Object getOriginator() {
        return originator;
    }

    public void setOriginator(Object originator) {
        this.originator = originator;
    }

    @Basic
    @Column(name = "CHARACTER_SET_CLIENT")
    public String getCharacterSetClient() {
        return characterSetClient;
    }

    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    @Basic
    @Column(name = "COLLATION_CONNECTION")
    public String getCollationConnection() {
        return collationConnection;
    }

    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    @Basic
    @Column(name = "DATABASE_COLLATION")
    public String getDatabaseCollation() {
        return databaseCollation;
    }

    public void setDatabaseCollation(String databaseCollation) {
        this.databaseCollation = databaseCollation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventsEntity that = (EventsEntity) o;

        if (eventCatalog != null ? !eventCatalog.equals(that.eventCatalog) : that.eventCatalog != null) return false;
        if (eventSchema != null ? !eventSchema.equals(that.eventSchema) : that.eventSchema != null) return false;
        if (eventName != null ? !eventName.equals(that.eventName) : that.eventName != null) return false;
        if (definer != null ? !definer.equals(that.definer) : that.definer != null) return false;
        if (timeZone != null ? !timeZone.equals(that.timeZone) : that.timeZone != null) return false;
        if (eventBody != null ? !eventBody.equals(that.eventBody) : that.eventBody != null) return false;
        if (eventDefinition != null ? !eventDefinition.equals(that.eventDefinition) : that.eventDefinition != null)
            return false;
        if (eventType != null ? !eventType.equals(that.eventType) : that.eventType != null) return false;
        if (executeAt != null ? !executeAt.equals(that.executeAt) : that.executeAt != null) return false;
        if (intervalValue != null ? !intervalValue.equals(that.intervalValue) : that.intervalValue != null)
            return false;
        if (intervalField != null ? !intervalField.equals(that.intervalField) : that.intervalField != null)
            return false;
        if (sqlMode != null ? !sqlMode.equals(that.sqlMode) : that.sqlMode != null) return false;
        if (starts != null ? !starts.equals(that.starts) : that.starts != null) return false;
        if (ends != null ? !ends.equals(that.ends) : that.ends != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (onCompletion != null ? !onCompletion.equals(that.onCompletion) : that.onCompletion != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (lastAltered != null ? !lastAltered.equals(that.lastAltered) : that.lastAltered != null) return false;
        if (lastExecuted != null ? !lastExecuted.equals(that.lastExecuted) : that.lastExecuted != null) return false;
        if (eventComment != null ? !eventComment.equals(that.eventComment) : that.eventComment != null) return false;
        if (originator != null ? !originator.equals(that.originator) : that.originator != null) return false;
        if (characterSetClient != null ? !characterSetClient.equals(that.characterSetClient) : that.characterSetClient != null)
            return false;
        if (collationConnection != null ? !collationConnection.equals(that.collationConnection) : that.collationConnection != null)
            return false;
        if (databaseCollation != null ? !databaseCollation.equals(that.databaseCollation) : that.databaseCollation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventCatalog != null ? eventCatalog.hashCode() : 0;
        result = 31 * result + (eventSchema != null ? eventSchema.hashCode() : 0);
        result = 31 * result + (eventName != null ? eventName.hashCode() : 0);
        result = 31 * result + (definer != null ? definer.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        result = 31 * result + (eventBody != null ? eventBody.hashCode() : 0);
        result = 31 * result + (eventDefinition != null ? eventDefinition.hashCode() : 0);
        result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
        result = 31 * result + (executeAt != null ? executeAt.hashCode() : 0);
        result = 31 * result + (intervalValue != null ? intervalValue.hashCode() : 0);
        result = 31 * result + (intervalField != null ? intervalField.hashCode() : 0);
        result = 31 * result + (sqlMode != null ? sqlMode.hashCode() : 0);
        result = 31 * result + (starts != null ? starts.hashCode() : 0);
        result = 31 * result + (ends != null ? ends.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (onCompletion != null ? onCompletion.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (lastAltered != null ? lastAltered.hashCode() : 0);
        result = 31 * result + (lastExecuted != null ? lastExecuted.hashCode() : 0);
        result = 31 * result + (eventComment != null ? eventComment.hashCode() : 0);
        result = 31 * result + (originator != null ? originator.hashCode() : 0);
        result = 31 * result + (characterSetClient != null ? characterSetClient.hashCode() : 0);
        result = 31 * result + (collationConnection != null ? collationConnection.hashCode() : 0);
        result = 31 * result + (databaseCollation != null ? databaseCollation.hashCode() : 0);
        return result;
    }
}
