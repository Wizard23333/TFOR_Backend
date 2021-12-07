package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;

@Entity
@Table(name = "INNODB_TABLESPACES_BRIEF", schema = "information_schema", catalog = "")
public class InnodbTablespacesBriefEntity {
    private byte[] space;
    private String name;
    private String path;
    private byte[] flag;
    private String spaceType;

    @Basic
    @Column(name = "SPACE")
    public byte[] getSpace() {
        return space;
    }

    public void setSpace(byte[] space) {
        this.space = space;
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
    @Column(name = "PATH")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "FLAG")
    public byte[] getFlag() {
        return flag;
    }

    public void setFlag(byte[] flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "SPACE_TYPE")
    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbTablespacesBriefEntity that = (InnodbTablespacesBriefEntity) o;

        if (!Arrays.equals(space, that.space)) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (!Arrays.equals(flag, that.flag)) return false;
        if (spaceType != null ? !spaceType.equals(that.spaceType) : that.spaceType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(space);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(flag);
        result = 31 * result + (spaceType != null ? spaceType.hashCode() : 0);
        return result;
    }
}
