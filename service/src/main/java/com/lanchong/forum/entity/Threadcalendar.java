package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadcalendar",  catalog = "")
public class Threadcalendar {
    private Integer cid;
    private Integer fid;
    private Integer dateline;
    private Integer hotnum;

    @Id
    @Column(name = "cid")
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Basic
    @Column(name = "hotnum")
    public Integer getHotnum() {
        return hotnum;
    }

    public void setHotnum(Integer hotnum) {
        this.hotnum = hotnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadcalendar that = (Threadcalendar) o;
        return Objects.equals(cid, that.cid) &&
                Objects.equals(fid, that.fid) &&
                Objects.equals(dateline, that.dateline) &&
                Objects.equals(hotnum, that.hotnum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cid, fid, dateline, hotnum);
    }
}
