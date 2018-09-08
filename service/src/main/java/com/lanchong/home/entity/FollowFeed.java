package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_follow_feed",  catalog = "")
public class FollowFeed {
    private Integer feedid;
    private Integer uid;
    private String username;
    private Integer tid;
    private String note;
    private Integer dateline;

    @Id
    @Column(name = "feedid")
    public Integer getFeedid() {
        return feedid;
    }

    public void setFeedid(Integer feedid) {
        this.feedid = feedid;
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
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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
        FollowFeed that = (FollowFeed) o;
        return Objects.equals(feedid, that.feedid) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(username, that.username) &&
                Objects.equals(tid, that.tid) &&
                Objects.equals(note, that.note) &&
                Objects.equals(dateline, that.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(feedid, uid, username, tid, note, dateline);
    }
}
