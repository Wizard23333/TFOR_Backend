package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_SESSION_TEMP_TABLESPACES", schema = "information_schema", catalog = "")
public class InnodbSessionTempTablespacesEntity {
    private Object id;
    private Object space;
    private String path;
    private Object size;
    private String state;
    private String purpose;

    @Basic
    @Column(name = "ID")
    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SPACE")
    public Object getSpace() {
        return space;
    }

    public void setSpace(Object space) {
        this.space = space;
    }

    @Basic
    @Column(name = "PATH")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "SIZE")
    public Object getSize() {
        return size;
    }

    public void setSize(Object size) {
        this.size = size;
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
    @Column(name = "PURPOSE")
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbSessionTempTablespacesEntity that = (InnodbSessionTempTablespacesEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (space != null ? !space.equals(that.space) : that.space != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (purpose != null ? !purpose.equals(that.purpose) : that.purpose != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (space != null ? space.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        return result;
    }
}
