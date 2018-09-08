package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "ldp_forum_typeoptionvar",  catalog = "")
public class Typeoptionvar {
    private Short sortid;
    private Integer tid;
    private Integer fid;
    private Short optionid;
    private Integer expiration;
    private String value;

    @Basic
    @Column(name = "sortid")
    public Short getSortid() {
        return sortid;
    }

    public void setSortid(Short sortid) {
        this.sortid = sortid;
    }

    @Basic
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "optionid")
    public Short getOptionid() {
        return optionid;
    }

    public void setOptionid(Short optionid) {
        this.optionid = optionid;
    }

    @Basic
    @Column(name = "expiration")
    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Typeoptionvar that = (Typeoptionvar) o;

        if (sortid != null ? !sortid.equals(that.sortid) : that.sortid != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (optionid != null ? !optionid.equals(that.optionid) : that.optionid != null) return false;
        if (expiration != null ? !expiration.equals(that.expiration) : that.expiration != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sortid != null ? sortid.hashCode() : 0;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        result = 31 * result + (optionid != null ? optionid.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
