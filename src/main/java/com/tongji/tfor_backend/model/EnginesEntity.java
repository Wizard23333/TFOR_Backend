package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ENGINES", schema = "information_schema", catalog = "")
public class EnginesEntity {
    private String engine;
    private String support;
    private String comment;
    private String transactions;
    private String xa;
    private String savepoints;

    @Basic
    @Column(name = "ENGINE")
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Basic
    @Column(name = "SUPPORT")
    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    @Basic
    @Column(name = "COMMENT")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "TRANSACTIONS")
    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    @Basic
    @Column(name = "XA")
    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    @Basic
    @Column(name = "SAVEPOINTS")
    public String getSavepoints() {
        return savepoints;
    }

    public void setSavepoints(String savepoints) {
        this.savepoints = savepoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnginesEntity that = (EnginesEntity) o;

        if (engine != null ? !engine.equals(that.engine) : that.engine != null) return false;
        if (support != null ? !support.equals(that.support) : that.support != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (transactions != null ? !transactions.equals(that.transactions) : that.transactions != null) return false;
        if (xa != null ? !xa.equals(that.xa) : that.xa != null) return false;
        if (savepoints != null ? !savepoints.equals(that.savepoints) : that.savepoints != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = engine != null ? engine.hashCode() : 0;
        result = 31 * result + (support != null ? support.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (transactions != null ? transactions.hashCode() : 0);
        result = 31 * result + (xa != null ? xa.hashCode() : 0);
        result = 31 * result + (savepoints != null ? savepoints.hashCode() : 0);
        return result;
    }
}
