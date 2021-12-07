package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COLLATIONS", schema = "information_schema", catalog = "")
public class CollationsEntity {
    private String collationName;
    private String characterSetName;
    private Object id;
    private String isDefault;
    private String isCompiled;
    private Object sortlen;
    private Object padAttribute;

    @Basic
    @Column(name = "COLLATION_NAME")
    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    @Basic
    @Column(name = "CHARACTER_SET_NAME")
    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Basic
    @Column(name = "ID")
    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IS_DEFAULT")
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Basic
    @Column(name = "IS_COMPILED")
    public String getIsCompiled() {
        return isCompiled;
    }

    public void setIsCompiled(String isCompiled) {
        this.isCompiled = isCompiled;
    }

    @Basic
    @Column(name = "SORTLEN")
    public Object getSortlen() {
        return sortlen;
    }

    public void setSortlen(Object sortlen) {
        this.sortlen = sortlen;
    }

    @Basic
    @Column(name = "PAD_ATTRIBUTE")
    public Object getPadAttribute() {
        return padAttribute;
    }

    public void setPadAttribute(Object padAttribute) {
        this.padAttribute = padAttribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CollationsEntity that = (CollationsEntity) o;

        if (collationName != null ? !collationName.equals(that.collationName) : that.collationName != null)
            return false;
        if (characterSetName != null ? !characterSetName.equals(that.characterSetName) : that.characterSetName != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (isDefault != null ? !isDefault.equals(that.isDefault) : that.isDefault != null) return false;
        if (isCompiled != null ? !isCompiled.equals(that.isCompiled) : that.isCompiled != null) return false;
        if (sortlen != null ? !sortlen.equals(that.sortlen) : that.sortlen != null) return false;
        if (padAttribute != null ? !padAttribute.equals(that.padAttribute) : that.padAttribute != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = collationName != null ? collationName.hashCode() : 0;
        result = 31 * result + (characterSetName != null ? characterSetName.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        result = 31 * result + (isCompiled != null ? isCompiled.hashCode() : 0);
        result = 31 * result + (sortlen != null ? sortlen.hashCode() : 0);
        result = 31 * result + (padAttribute != null ? padAttribute.hashCode() : 0);
        return result;
    }
}
