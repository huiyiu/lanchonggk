package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadrush",  catalog = "")
public class Threadrush {
    private Integer tid;
    private Integer stopfloor;
    private Integer starttimefrom;
    private Integer starttimeto;
    private String rewardfloor;
    private Integer creditlimit;
    private Short replylimit;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "stopfloor")
    public Integer getStopfloor() {
        return stopfloor;
    }

    public void setStopfloor(Integer stopfloor) {
        this.stopfloor = stopfloor;
    }

    @Basic
    @Column(name = "starttimefrom")
    public Integer getStarttimefrom() {
        return starttimefrom;
    }

    public void setStarttimefrom(Integer starttimefrom) {
        this.starttimefrom = starttimefrom;
    }

    @Basic
    @Column(name = "starttimeto")
    public Integer getStarttimeto() {
        return starttimeto;
    }

    public void setStarttimeto(Integer starttimeto) {
        this.starttimeto = starttimeto;
    }

    @Basic
    @Column(name = "rewardfloor")
    public String getRewardfloor() {
        return rewardfloor;
    }

    public void setRewardfloor(String rewardfloor) {
        this.rewardfloor = rewardfloor;
    }

    @Basic
    @Column(name = "creditlimit")
    public Integer getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(Integer creditlimit) {
        this.creditlimit = creditlimit;
    }

    @Basic
    @Column(name = "replylimit")
    public Short getReplylimit() {
        return replylimit;
    }

    public void setReplylimit(Short replylimit) {
        this.replylimit = replylimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadrush that = (Threadrush) o;
        return Objects.equals(tid, that.tid) &&
                Objects.equals(stopfloor, that.stopfloor) &&
                Objects.equals(starttimefrom, that.starttimefrom) &&
                Objects.equals(starttimeto, that.starttimeto) &&
                Objects.equals(rewardfloor, that.rewardfloor) &&
                Objects.equals(creditlimit, that.creditlimit) &&
                Objects.equals(replylimit, that.replylimit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, stopfloor, starttimefrom, starttimeto, rewardfloor, creditlimit, replylimit);
    }
}
