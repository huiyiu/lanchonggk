package com.lanchong.home.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

//@Entity
@Table(name = "ldp_home_clickuser", schema = "lanchonggk", catalog = "")
public class Clickuser {
    private Integer uid;
    private String username;
    private Integer id;
    private String idtype;
    private Short clickid;
    private Integer dateline;

    @Basic
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idtype")
    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    @Basic
    @Column(name = "clickid")
    public Short getClickid() {
        return clickid;
    }

    public void setClickid(Short clickid) {
        this.clickid = clickid;
    }

    @Basic
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clickuser clickuser = (Clickuser) o;
        return Objects.equals(uid, clickuser.uid) &&
                Objects.equals(username, clickuser.username) &&
                Objects.equals(id, clickuser.id) &&
                Objects.equals(idtype, clickuser.idtype) &&
                Objects.equals(clickid, clickuser.clickid) &&
                Objects.equals(dateline, clickuser.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, username, id, idtype, clickid, dateline);
    }
}
