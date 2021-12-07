package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_FOREIGN", schema = "information_schema", catalog = "")
public class InnodbForeignEntity {
    private String id;
    private String forName;
    private String refName;
    private long nCols;
    private Object type;

    @Basic
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FOR_NAME")
    public String getForName() {
        return forName;
    }

    public void setForName(String forName) {
        this.forName = forName;
    }

    @Basic
    @Column(name = "REF_NAME")
    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    @Basic
    @Column(name = "N_COLS")
    public long getnCols() {
        return nCols;
    }

    public void setnCols(long nCols) {
        this.nCols = nCols;
    }

    @Basic
    @Column(name = "TYPE")
    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbForeignEntity that = (InnodbForeignEntity) o;

        if (nCols != that.nCols) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (forName != null ? !forName.equals(that.forName) : that.forName != null) return false;
        if (refName != null ? !refName.equals(that.refName) : that.refName != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (forName != null ? forName.hashCode() : 0);
        result = 31 * result + (refName != null ? refName.hashCode() : 0);
        result = 31 * result + (int) (nCols ^ (nCols >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
