package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

//@Entity
@Table(name = "ldp_forum_threadpartake",  catalog = "")
public class Threadpartake {
    private Integer tid;
    private Integer uid;
    private Integer dateline;

    @Basic
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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
        Threadpartake that = (Threadpartake) o;
        return Objects.equals(tid, that.tid) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(dateline, that.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, uid, dateline);
    }
}
