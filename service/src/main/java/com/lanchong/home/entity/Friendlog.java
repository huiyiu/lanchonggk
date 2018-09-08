package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_friendlog",  catalog = "")
@IdClass(FriendlogPK.class)
public class Friendlog {
    private Integer uid;
    private Integer fuid;
    private String action;
    private Integer dateline;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "fuid")
    public Integer getFuid() {
        return fuid;
    }

    public void setFuid(Integer fuid) {
        this.fuid = fuid;
    }

    @Basic
    @Column(name = "action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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
        Friendlog friendlog = (Friendlog) o;
        return Objects.equals(uid, friendlog.uid) &&
                Objects.equals(fuid, friendlog.fuid) &&
                Objects.equals(action, friendlog.action) &&
                Objects.equals(dateline, friendlog.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, fuid, action, dateline);
    }
}
