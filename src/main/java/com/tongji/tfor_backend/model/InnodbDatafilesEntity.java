package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;

@Entity
@Table(name = "INNODB_DATAFILES", schema = "information_schema", catalog = "")
public class InnodbDatafilesEntity {
    private byte[] space;
    private String path;

    @Basic
    @Column(name = "SPACE")
    public byte[] getSpace() {
        return space;
    }

    public void setSpace(byte[] space) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbDatafilesEntity that = (InnodbDatafilesEntity) o;

        if (!Arrays.equals(space, that.space)) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(space);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }
}
