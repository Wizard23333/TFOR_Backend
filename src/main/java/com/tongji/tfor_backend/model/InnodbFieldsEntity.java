package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;

@Entity
@Table(name = "INNODB_FIELDS", schema = "information_schema", catalog = "")
public class InnodbFieldsEntity {
    private byte[] indexId;
    private String name;
    private Object pos;

    @Basic
    @Column(name = "INDEX_ID")
    public byte[] getIndexId() {
        return indexId;
    }

    public void setIndexId(byte[] indexId) {
        this.indexId = indexId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "POS")
    public Object getPos() {
        return pos;
    }

    public void setPos(Object pos) {
        this.pos = pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbFieldsEntity that = (InnodbFieldsEntity) o;

        if (!Arrays.equals(indexId, that.indexId)) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pos != null ? !pos.equals(that.pos) : that.pos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(indexId);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pos != null ? pos.hashCode() : 0);
        return result;
    }
}
