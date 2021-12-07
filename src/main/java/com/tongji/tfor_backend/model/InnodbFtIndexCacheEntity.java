package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_FT_INDEX_CACHE", schema = "information_schema", catalog = "")
public class InnodbFtIndexCacheEntity {
    private String word;
    private Object firstDocId;
    private Object lastDocId;
    private Object docCount;
    private Object docId;
    private Object position;

    @Basic
    @Column(name = "WORD")
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Basic
    @Column(name = "FIRST_DOC_ID")
    public Object getFirstDocId() {
        return firstDocId;
    }

    public void setFirstDocId(Object firstDocId) {
        this.firstDocId = firstDocId;
    }

    @Basic
    @Column(name = "LAST_DOC_ID")
    public Object getLastDocId() {
        return lastDocId;
    }

    public void setLastDocId(Object lastDocId) {
        this.lastDocId = lastDocId;
    }

    @Basic
    @Column(name = "DOC_COUNT")
    public Object getDocCount() {
        return docCount;
    }

    public void setDocCount(Object docCount) {
        this.docCount = docCount;
    }

    @Basic
    @Column(name = "DOC_ID")
    public Object getDocId() {
        return docId;
    }

    public void setDocId(Object docId) {
        this.docId = docId;
    }

    @Basic
    @Column(name = "POSITION")
    public Object getPosition() {
        return position;
    }

    public void setPosition(Object position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbFtIndexCacheEntity that = (InnodbFtIndexCacheEntity) o;

        if (word != null ? !word.equals(that.word) : that.word != null) return false;
        if (firstDocId != null ? !firstDocId.equals(that.firstDocId) : that.firstDocId != null) return false;
        if (lastDocId != null ? !lastDocId.equals(that.lastDocId) : that.lastDocId != null) return false;
        if (docCount != null ? !docCount.equals(that.docCount) : that.docCount != null) return false;
        if (docId != null ? !docId.equals(that.docId) : that.docId != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = word != null ? word.hashCode() : 0;
        result = 31 * result + (firstDocId != null ? firstDocId.hashCode() : 0);
        result = 31 * result + (lastDocId != null ? lastDocId.hashCode() : 0);
        result = 31 * result + (docCount != null ? docCount.hashCode() : 0);
        result = 31 * result + (docId != null ? docId.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
