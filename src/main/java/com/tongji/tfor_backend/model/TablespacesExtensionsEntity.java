package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLESPACES_EXTENSIONS", schema = "information_schema", catalog = "")
public class TablespacesExtensionsEntity {
    private String tablespaceName;
    private Object engineAttribute;

    @Basic
    @Column(name = "TABLESPACE_NAME")
    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    @Basic
    @Column(name = "ENGINE_ATTRIBUTE")
    public Object getEngineAttribute() {
        return engineAttribute;
    }

    public void setEngineAttribute(Object engineAttribute) {
        this.engineAttribute = engineAttribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TablespacesExtensionsEntity that = (TablespacesExtensionsEntity) o;

        if (tablespaceName != null ? !tablespaceName.equals(that.tablespaceName) : that.tablespaceName != null)
            return false;
        if (engineAttribute != null ? !engineAttribute.equals(that.engineAttribute) : that.engineAttribute != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tablespaceName != null ? tablespaceName.hashCode() : 0;
        result = 31 * result + (engineAttribute != null ? engineAttribute.hashCode() : 0);
        return result;
    }
}
