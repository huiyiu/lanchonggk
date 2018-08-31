package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_appcreditlog", schema = "lanchonggk", catalog = "")
public class Appcreditlog {
    private Integer logid;
    private Integer uid;
    private Integer appid;
    private String appname;
    private Byte type;
    private Integer credit;
    private String note;
    private Integer dateline;

    @Id
    @Column(name = "logid")
    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

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
    @Column(name = "type")
    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "credit")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        Appcreditlog that = (Appcreditlog) o;
        return Objects.equals(logid, that.logid) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(appid, that.appid) &&
                Objects.equals(appname, that.appname) &&
                Objects.equals(type, that.type) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(note, that.note) &&
                Objects.equals(dateline, that.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(logid, uid, appid, appname, type, credit, note, dateline);
    }
}
