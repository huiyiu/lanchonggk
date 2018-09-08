package com.lanchong.home.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

//@Entity
@Table(name = "ldp_home_userappfield",  catalog = "")
public class Userappfield {
    private Integer uid;
    private Integer appid;
    private String profilelink;
    private String myml;

    @Basic
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "appid")
    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    @Basic
    @Column(name = "profilelink")
    public String getProfilelink() {
        return profilelink;
    }

    public void setProfilelink(String profilelink) {
        this.profilelink = profilelink;
    }

    @Basic
    @Column(name = "myml")
    public String getMyml() {
        return myml;
    }

    public void setMyml(String myml) {
        this.myml = myml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userappfield that = (Userappfield) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(appid, that.appid) &&
                Objects.equals(profilelink, that.profilelink) &&
                Objects.equals(myml, that.myml);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, appid, profilelink, myml);
    }
}
