package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CHARACTER_SETS", schema = "information_schema", catalog = "")
public class CharacterSetsEntity {
    private String characterSetName;
    private String defaultCollateName;
    private String description;
    private Object maxlen;

    @Basic
    @Column(name = "CHARACTER_SET_NAME")
    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Basic
    @Column(name = "DEFAULT_COLLATE_NAME")
    public String getDefaultCollateName() {
        return defaultCollateName;
    }

    public void setDefaultCollateName(String defaultCollateName) {
        this.defaultCollateName = defaultCollateName;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "MAXLEN")
    public Object getMaxlen() {
        return maxlen;
    }

    public void setMaxlen(Object maxlen) {
        this.maxlen = maxlen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterSetsEntity that = (CharacterSetsEntity) o;

        if (characterSetName != null ? !characterSetName.equals(that.characterSetName) : that.characterSetName != null)
            return false;
        if (defaultCollateName != null ? !defaultCollateName.equals(that.defaultCollateName) : that.defaultCollateName != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (maxlen != null ? !maxlen.equals(that.maxlen) : that.maxlen != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = characterSetName != null ? characterSetName.hashCode() : 0;
        result = 31 * result + (defaultCollateName != null ? defaultCollateName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (maxlen != null ? maxlen.hashCode() : 0);
        return result;
    }
}
