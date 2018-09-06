package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadtype",  catalog = "")
public class Threadtype {
    private Short typeid;
    private Integer fid;
    private Short displayorder;
    private String name;
    private String description;
    private String icon;
    private Short special;
    private Short modelid;
    private Byte expiration;
    private String template;
    private String stemplate;
    private String ptemplate;
    private String btemplate;

    @Id
    @Column(name = "typeid")
    public Short getTypeid() {
        return typeid;
    }

    public void setTypeid(Short typeid) {
        this.typeid = typeid;
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
    @Column(name = "displayorder")
    public Short getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Short displayorder) {
        this.displayorder = displayorder;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "special")
    public Short getSpecial() {
        return special;
    }

    public void setSpecial(Short special) {
        this.special = special;
    }

    @Basic
    @Column(name = "modelid")
    public Short getModelid() {
        return modelid;
    }

    public void setModelid(Short modelid) {
        this.modelid = modelid;
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
    @Column(name = "template")
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Basic
    @Column(name = "stemplate")
    public String getStemplate() {
        return stemplate;
    }

    public void setStemplate(String stemplate) {
        this.stemplate = stemplate;
    }

    @Basic
    @Column(name = "ptemplate")
    public String getPtemplate() {
        return ptemplate;
    }

    public void setPtemplate(String ptemplate) {
        this.ptemplate = ptemplate;
    }

    @Basic
    @Column(name = "btemplate")
    public String getBtemplate() {
        return btemplate;
    }

    public void setBtemplate(String btemplate) {
        this.btemplate = btemplate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadtype that = (Threadtype) o;
        return Objects.equals(typeid, that.typeid) &&
                Objects.equals(fid, that.fid) &&
                Objects.equals(displayorder, that.displayorder) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(icon, that.icon) &&
                Objects.equals(special, that.special) &&
                Objects.equals(modelid, that.modelid) &&
                Objects.equals(expiration, that.expiration) &&
                Objects.equals(template, that.template) &&
                Objects.equals(stemplate, that.stemplate) &&
                Objects.equals(ptemplate, that.ptemplate) &&
                Objects.equals(btemplate, that.btemplate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeid, fid, displayorder, name, description, icon, special, modelid, expiration, template, stemplate, ptemplate, btemplate);
    }
}
