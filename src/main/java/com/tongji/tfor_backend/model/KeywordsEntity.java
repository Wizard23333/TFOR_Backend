package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "KEYWORDS", schema = "information_schema", catalog = "")
public class KeywordsEntity {
    private String word;
    private Integer reserved;

    @Basic
    @Column(name = "WORD")
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Basic
    @Column(name = "RESERVED")
    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeywordsEntity that = (KeywordsEntity) o;

        if (word != null ? !word.equals(that.word) : that.word != null) return false;
        if (reserved != null ? !reserved.equals(that.reserved) : that.reserved != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = word != null ? word.hashCode() : 0;
        result = 31 * result + (reserved != null ? reserved.hashCode() : 0);
        return result;
    }
}
