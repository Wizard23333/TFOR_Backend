package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COLLATION_CHARACTER_SET_APPLICABILITY", schema = "information_schema", catalog = "")
public class CollationCharacterSetApplicabilityEntity {
    private String collationName;
    private String characterSetName;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CollationCharacterSetApplicabilityEntity that = (CollationCharacterSetApplicabilityEntity) o;

        if (collationName != null ? !collationName.equals(that.collationName) : that.collationName != null)
            return false;
        if (characterSetName != null ? !characterSetName.equals(that.characterSetName) : that.characterSetName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = collationName != null ? collationName.hashCode() : 0;
        result = 31 * result + (characterSetName != null ? characterSetName.hashCode() : 0);
        return result;
    }
}
