package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "ldp_forum_typevar",  catalog = "")
public class Typevar {
    private Short sortid;
    private Short optionid;
    private Byte available;
    private Byte required;
    private Byte unchangeable;
    private Byte search;
    private Byte displayorder;
    private Byte subjectshow;

    @Basic
    @Column(name = "sortid")
    public Short getSortid() {
        return sortid;
    }

    public void setSortid(Short sortid) {
        this.sortid = sortid;
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
    @Column(name = "available")
    public Byte getAvailable() {
        return available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
    }

    @Basic
    @Column(name = "required")
    public Byte getRequired() {
        return required;
    }

    public void setRequired(Byte required) {
        this.required = required;
    }

    @Basic
    @Column(name = "unchangeable")
    public Byte getUnchangeable() {
        return unchangeable;
    }

    public void setUnchangeable(Byte unchangeable) {
        this.unchangeable = unchangeable;
    }

    @Basic
    @Column(name = "search")
    public Byte getSearch() {
        return search;
    }

    public void setSearch(Byte search) {
        this.search = search;
    }

    @Basic
    @Column(name = "displayorder")
    public Byte getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Byte displayorder) {
        this.displayorder = displayorder;
    }

    @Basic
    @Column(name = "subjectshow")
    public Byte getSubjectshow() {
        return subjectshow;
    }

    public void setSubjectshow(Byte subjectshow) {
        this.subjectshow = subjectshow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Typevar typevar = (Typevar) o;

        if (sortid != null ? !sortid.equals(typevar.sortid) : typevar.sortid != null) return false;
        if (optionid != null ? !optionid.equals(typevar.optionid) : typevar.optionid != null) return false;
        if (available != null ? !available.equals(typevar.available) : typevar.available != null) return false;
        if (required != null ? !required.equals(typevar.required) : typevar.required != null) return false;
        if (unchangeable != null ? !unchangeable.equals(typevar.unchangeable) : typevar.unchangeable != null)
            return false;
        if (search != null ? !search.equals(typevar.search) : typevar.search != null) return false;
        if (displayorder != null ? !displayorder.equals(typevar.displayorder) : typevar.displayorder != null)
            return false;
        if (subjectshow != null ? !subjectshow.equals(typevar.subjectshow) : typevar.subjectshow != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sortid != null ? sortid.hashCode() : 0;
        result = 31 * result + (optionid != null ? optionid.hashCode() : 0);
        result = 31 * result + (available != null ? available.hashCode() : 0);
        result = 31 * result + (required != null ? required.hashCode() : 0);
        result = 31 * result + (unchangeable != null ? unchangeable.hashCode() : 0);
        result = 31 * result + (search != null ? search.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (subjectshow != null ? subjectshow.hashCode() : 0);
        return result;
    }
}
