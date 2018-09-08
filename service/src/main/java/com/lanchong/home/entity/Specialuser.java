package com.lanchong.home.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

//@Entity
@Table(name = "ldp_home_specialuser",  catalog = "")
public class Specialuser {
    private Integer uid;
    private String username;
    private Byte status;
    private Integer dateline;
    private String reason;
    private Integer opuid;
    private String opusername;
    private Integer displayorder;

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
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "opuid")
    public Integer getOpuid() {
        return opuid;
    }

    public void setOpuid(Integer opuid) {
        this.opuid = opuid;
    }

    @Basic
    @Column(name = "opusername")
    public String getOpusername() {
        return opusername;
    }

    public void setOpusername(String opusername) {
        this.opusername = opusername;
    }

    @Basic
    @Column(name = "displayorder")
    public Integer getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialuser that = (Specialuser) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(username, that.username) &&
                Objects.equals(status, that.status) &&
                Objects.equals(dateline, that.dateline) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(opuid, that.opuid) &&
                Objects.equals(opusername, that.opusername) &&
                Objects.equals(displayorder, that.displayorder);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, username, status, dateline, reason, opuid, opusername, displayorder);
    }
}
