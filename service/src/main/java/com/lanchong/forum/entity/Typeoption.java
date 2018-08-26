package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_typeoption", schema = "lanchonggk", catalog = "")
public class Typeoption {
    private Short optionid;
    private Short classid;
    private Byte displayorder;
    private Byte expiration;
    private String protect;
    private String title;
    private String description;
    private String identifier;
    private String type;
    private String unit;
    private String rules;
    private String permprompt;

    @Id
    @Column(name = "optionid")
    public Short getOptionid() {
        return optionid;
    }

    public void setOptionid(Short optionid) {
        this.optionid = optionid;
    }

    @Basic
    @Column(name = "classid")
    public Short getClassid() {
        return classid;
    }

    public void setClassid(Short classid) {
        this.classid = classid;
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
    @Column(name = "expiration")
    public Byte getExpiration() {
        return expiration;
    }

    public void setExpiration(Byte expiration) {
        this.expiration = expiration;
    }

    @Basic
    @Column(name = "protect")
    public String getProtect() {
        return protect;
    }

    public void setProtect(String protect) {
        this.protect = protect;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "identifier")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "rules")
    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Basic
    @Column(name = "permprompt")
    public String getPermprompt() {
        return permprompt;
    }

    public void setPermprompt(String permprompt) {
        this.permprompt = permprompt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Typeoption that = (Typeoption) o;

        if (optionid != null ? !optionid.equals(that.optionid) : that.optionid != null) return false;
        if (classid != null ? !classid.equals(that.classid) : that.classid != null) return false;
        if (displayorder != null ? !displayorder.equals(that.displayorder) : that.displayorder != null) return false;
        if (expiration != null ? !expiration.equals(that.expiration) : that.expiration != null) return false;
        if (protect != null ? !protect.equals(that.protect) : that.protect != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (identifier != null ? !identifier.equals(that.identifier) : that.identifier != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (rules != null ? !rules.equals(that.rules) : that.rules != null) return false;
        if (permprompt != null ? !permprompt.equals(that.permprompt) : that.permprompt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = optionid != null ? optionid.hashCode() : 0;
        result = 31 * result + (classid != null ? classid.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        result = 31 * result + (protect != null ? protect.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (rules != null ? rules.hashCode() : 0);
        result = 31 * result + (permprompt != null ? permprompt.hashCode() : 0);
        return result;
    }
}
