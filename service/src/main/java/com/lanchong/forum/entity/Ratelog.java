package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "ldp_forum_ratelog",  catalog = "")
public class Ratelog {
    private Integer pid;
    private Integer uid;
    private String username;
    private Byte extcredits;
    private Integer dateline;
    private Short score;
    private String reason;

    @Basic
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "extcredits")
    public Byte getExtcredits() {
        return extcredits;
    }

    public void setExtcredits(Byte extcredits) {
        this.extcredits = extcredits;
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
    @Column(name = "score")
    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ratelog ratelog = (Ratelog) o;

        if (pid != null ? !pid.equals(ratelog.pid) : ratelog.pid != null) return false;
        if (uid != null ? !uid.equals(ratelog.uid) : ratelog.uid != null) return false;
        if (username != null ? !username.equals(ratelog.username) : ratelog.username != null) return false;
        if (extcredits != null ? !extcredits.equals(ratelog.extcredits) : ratelog.extcredits != null) return false;
        if (dateline != null ? !dateline.equals(ratelog.dateline) : ratelog.dateline != null) return false;
        if (score != null ? !score.equals(ratelog.score) : ratelog.score != null) return false;
        if (reason != null ? !reason.equals(ratelog.reason) : ratelog.reason != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (extcredits != null ? extcredits.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        return result;
    }
}
