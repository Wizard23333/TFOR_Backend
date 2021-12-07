package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_FT_BEING_DELETED", schema = "information_schema", catalog = "")
public class InnodbFtBeingDeletedEntity {
    private Object docId;

    @Basic
    @Column(name = "DOC_ID")
    public Object getDocId() {
        return docId;
    }

    public void setDocId(Object docId) {
        this.docId = docId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbFtBeingDeletedEntity that = (InnodbFtBeingDeletedEntity) o;

        if (docId != null ? !docId.equals(that.docId) : that.docId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return docId != null ? docId.hashCode() : 0;
    }
}
