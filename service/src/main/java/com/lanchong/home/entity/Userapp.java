package com.lanchong.home.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

//@Entity
@Table(name = "ldp_home_userapp",  catalog = "")
public class Userapp {
    private Integer uid;
    private Integer appid;
    private String appname;
    private Byte privacy;
    private Byte allowsidenav;
    private Byte allowfeed;
    private Byte allowprofilelink;
    private Byte narrow;
    private Short menuorder;
    private Short displayorder;

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
    @Column(name = "appname")
    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    @Basic
    @Column(name = "privacy")
    public Byte getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Byte privacy) {
        this.privacy = privacy;
    }

    @Basic
    @Column(name = "allowsidenav")
    public Byte getAllowsidenav() {
        return allowsidenav;
    }

    public void setAllowsidenav(Byte allowsidenav) {
        this.allowsidenav = allowsidenav;
    }

    @Basic
    @Column(name = "allowfeed")
    public Byte getAllowfeed() {
        return allowfeed;
    }

    public void setAllowfeed(Byte allowfeed) {
        this.allowfeed = allowfeed;
    }

    @Basic
    @Column(name = "allowprofilelink")
    public Byte getAllowprofilelink() {
        return allowprofilelink;
    }

    public void setAllowprofilelink(Byte allowprofilelink) {
        this.allowprofilelink = allowprofilelink;
    }

    @Basic
    @Column(name = "narrow")
    public Byte getNarrow() {
        return narrow;
    }

    public void setNarrow(Byte narrow) {
        this.narrow = narrow;
    }

    @Basic
    @Column(name = "menuorder")
    public Short getMenuorder() {
        return menuorder;
    }

    public void setMenuorder(Short menuorder) {
        this.menuorder = menuorder;
    }

    @Basic
    @Column(name = "displayorder")
    public Short getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Short displayorder) {
        this.displayorder = displayorder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userapp userapp = (Userapp) o;
        return Objects.equals(uid, userapp.uid) &&
                Objects.equals(appid, userapp.appid) &&
                Objects.equals(appname, userapp.appname) &&
                Objects.equals(privacy, userapp.privacy) &&
                Objects.equals(allowsidenav, userapp.allowsidenav) &&
                Objects.equals(allowfeed, userapp.allowfeed) &&
                Objects.equals(allowprofilelink, userapp.allowprofilelink) &&
                Objects.equals(narrow, userapp.narrow) &&
                Objects.equals(menuorder, userapp.menuorder) &&
                Objects.equals(displayorder, userapp.displayorder);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, appid, appname, privacy, allowsidenav, allowfeed, allowprofilelink, narrow, menuorder, displayorder);
    }
}
