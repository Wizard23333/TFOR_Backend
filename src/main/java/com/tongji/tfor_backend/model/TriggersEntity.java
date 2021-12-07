package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "TRIGGERS", schema = "information_schema", catalog = "")
public class TriggersEntity {
    private String triggerCatalog;
    private String triggerSchema;
    private String triggerName;
    private Object eventManipulation;
    private String eventObjectCatalog;
    private String eventObjectSchema;
    private String eventObjectTable;
    private Object actionOrder;
    private byte[] actionCondition;
    private String actionStatement;
    private String actionOrientation;
    private Object actionTiming;
    private byte[] actionReferenceOldTable;
    private byte[] actionReferenceNewTable;
    private String actionReferenceOldRow;
    private String actionReferenceNewRow;
    private Timestamp created;
    private Object sqlMode;
    private String definer;
    private String characterSetClient;
    private String collationConnection;
    private String databaseCollation;

    @Basic
    @Column(name = "TRIGGER_CATALOG")
    public String getTriggerCatalog() {
        return triggerCatalog;
    }

    public void setTriggerCatalog(String triggerCatalog) {
        this.triggerCatalog = triggerCatalog;
    }

    @Basic
    @Column(name = "TRIGGER_SCHEMA")
    public String getTriggerSchema() {
        return triggerSchema;
    }

    public void setTriggerSchema(String triggerSchema) {
        this.triggerSchema = triggerSchema;
    }

    @Basic
    @Column(name = "TRIGGER_NAME")
    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    @Basic
    @Column(name = "EVENT_MANIPULATION")
    public Object getEventManipulation() {
        return eventManipulation;
    }

    public void setEventManipulation(Object eventManipulation) {
        this.eventManipulation = eventManipulation;
    }

    @Basic
    @Column(name = "EVENT_OBJECT_CATALOG")
    public String getEventObjectCatalog() {
        return eventObjectCatalog;
    }

    public void setEventObjectCatalog(String eventObjectCatalog) {
        this.eventObjectCatalog = eventObjectCatalog;
    }

    @Basic
    @Column(name = "EVENT_OBJECT_SCHEMA")
    public String getEventObjectSchema() {
        return eventObjectSchema;
    }

    public void setEventObjectSchema(String eventObjectSchema) {
        this.eventObjectSchema = eventObjectSchema;
    }

    @Basic
    @Column(name = "EVENT_OBJECT_TABLE")
    public String getEventObjectTable() {
        return eventObjectTable;
    }

    public void setEventObjectTable(String eventObjectTable) {
        this.eventObjectTable = eventObjectTable;
    }

    @Basic
    @Column(name = "ACTION_ORDER")
    public Object getActionOrder() {
        return actionOrder;
    }

    public void setActionOrder(Object actionOrder) {
        this.actionOrder = actionOrder;
    }

    @Basic
    @Column(name = "ACTION_CONDITION")
    public byte[] getActionCondition() {
        return actionCondition;
    }

    public void setActionCondition(byte[] actionCondition) {
        this.actionCondition = actionCondition;
    }

    @Basic
    @Column(name = "ACTION_STATEMENT")
    public String getActionStatement() {
        return actionStatement;
    }

    public void setActionStatement(String actionStatement) {
        this.actionStatement = actionStatement;
    }

    @Basic
    @Column(name = "ACTION_ORIENTATION")
    public String getActionOrientation() {
        return actionOrientation;
    }

    public void setActionOrientation(String actionOrientation) {
        this.actionOrientation = actionOrientation;
    }

    @Basic
    @Column(name = "ACTION_TIMING")
    public Object getActionTiming() {
        return actionTiming;
    }

    public void setActionTiming(Object actionTiming) {
        this.actionTiming = actionTiming;
    }

    @Basic
    @Column(name = "ACTION_REFERENCE_OLD_TABLE")
    public byte[] getActionReferenceOldTable() {
        return actionReferenceOldTable;
    }

    public void setActionReferenceOldTable(byte[] actionReferenceOldTable) {
        this.actionReferenceOldTable = actionReferenceOldTable;
    }

    @Basic
    @Column(name = "ACTION_REFERENCE_NEW_TABLE")
    public byte[] getActionReferenceNewTable() {
        return actionReferenceNewTable;
    }

    public void setActionReferenceNewTable(byte[] actionReferenceNewTable) {
        this.actionReferenceNewTable = actionReferenceNewTable;
    }

    @Basic
    @Column(name = "ACTION_REFERENCE_OLD_ROW")
    public String getActionReferenceOldRow() {
        return actionReferenceOldRow;
    }

    public void setActionReferenceOldRow(String actionReferenceOldRow) {
        this.actionReferenceOldRow = actionReferenceOldRow;
    }

    @Basic
    @Column(name = "ACTION_REFERENCE_NEW_ROW")
    public String getActionReferenceNewRow() {
        return actionReferenceNewRow;
    }

    public void setActionReferenceNewRow(String actionReferenceNewRow) {
        this.actionReferenceNewRow = actionReferenceNewRow;
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
    @Column(name = "SQL_MODE")
    public Object getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(Object sqlMode) {
        this.sqlMode = sqlMode;
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

        TriggersEntity that = (TriggersEntity) o;

        if (triggerCatalog != null ? !triggerCatalog.equals(that.triggerCatalog) : that.triggerCatalog != null)
            return false;
        if (triggerSchema != null ? !triggerSchema.equals(that.triggerSchema) : that.triggerSchema != null)
            return false;
        if (triggerName != null ? !triggerName.equals(that.triggerName) : that.triggerName != null) return false;
        if (eventManipulation != null ? !eventManipulation.equals(that.eventManipulation) : that.eventManipulation != null)
            return false;
        if (eventObjectCatalog != null ? !eventObjectCatalog.equals(that.eventObjectCatalog) : that.eventObjectCatalog != null)
            return false;
        if (eventObjectSchema != null ? !eventObjectSchema.equals(that.eventObjectSchema) : that.eventObjectSchema != null)
            return false;
        if (eventObjectTable != null ? !eventObjectTable.equals(that.eventObjectTable) : that.eventObjectTable != null)
            return false;
        if (actionOrder != null ? !actionOrder.equals(that.actionOrder) : that.actionOrder != null) return false;
        if (!Arrays.equals(actionCondition, that.actionCondition)) return false;
        if (actionStatement != null ? !actionStatement.equals(that.actionStatement) : that.actionStatement != null)
            return false;
        if (actionOrientation != null ? !actionOrientation.equals(that.actionOrientation) : that.actionOrientation != null)
            return false;
        if (actionTiming != null ? !actionTiming.equals(that.actionTiming) : that.actionTiming != null) return false;
        if (!Arrays.equals(actionReferenceOldTable, that.actionReferenceOldTable)) return false;
        if (!Arrays.equals(actionReferenceNewTable, that.actionReferenceNewTable)) return false;
        if (actionReferenceOldRow != null ? !actionReferenceOldRow.equals(that.actionReferenceOldRow) : that.actionReferenceOldRow != null)
            return false;
        if (actionReferenceNewRow != null ? !actionReferenceNewRow.equals(that.actionReferenceNewRow) : that.actionReferenceNewRow != null)
            return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (sqlMode != null ? !sqlMode.equals(that.sqlMode) : that.sqlMode != null) return false;
        if (definer != null ? !definer.equals(that.definer) : that.definer != null) return false;
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
        int result = triggerCatalog != null ? triggerCatalog.hashCode() : 0;
        result = 31 * result + (triggerSchema != null ? triggerSchema.hashCode() : 0);
        result = 31 * result + (triggerName != null ? triggerName.hashCode() : 0);
        result = 31 * result + (eventManipulation != null ? eventManipulation.hashCode() : 0);
        result = 31 * result + (eventObjectCatalog != null ? eventObjectCatalog.hashCode() : 0);
        result = 31 * result + (eventObjectSchema != null ? eventObjectSchema.hashCode() : 0);
        result = 31 * result + (eventObjectTable != null ? eventObjectTable.hashCode() : 0);
        result = 31 * result + (actionOrder != null ? actionOrder.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(actionCondition);
        result = 31 * result + (actionStatement != null ? actionStatement.hashCode() : 0);
        result = 31 * result + (actionOrientation != null ? actionOrientation.hashCode() : 0);
        result = 31 * result + (actionTiming != null ? actionTiming.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(actionReferenceOldTable);
        result = 31 * result + Arrays.hashCode(actionReferenceNewTable);
        result = 31 * result + (actionReferenceOldRow != null ? actionReferenceOldRow.hashCode() : 0);
        result = 31 * result + (actionReferenceNewRow != null ? actionReferenceNewRow.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (sqlMode != null ? sqlMode.hashCode() : 0);
        result = 31 * result + (definer != null ? definer.hashCode() : 0);
        result = 31 * result + (characterSetClient != null ? characterSetClient.hashCode() : 0);
        result = 31 * result + (collationConnection != null ? collationConnection.hashCode() : 0);
        result = 31 * result + (databaseCollation != null ? databaseCollation.hashCode() : 0);
        return result;
    }
}
