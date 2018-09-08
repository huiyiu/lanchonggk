package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_friend_request",  catalog = "")
@IdClass(FriendRequestPK.class)
public class FriendRequest {
    private Integer uid;
    private Integer fuid;
    private String fusername;
    private Short gid;
    private String note;
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
    @Column(name = "fusername")
    public String getFusername() {
        return fusername;
    }

    public void setFusername(String fusername) {
        this.fusername = fusername;
    }

    @Basic
    @Column(name = "gid")
    public Short getGid() {
        return gid;
    }

    public void setGid(Short gid) {
        this.gid = gid;
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
        FriendRequest that = (FriendRequest) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(fuid, that.fuid) &&
                Objects.equals(fusername, that.fusername) &&
                Objects.equals(gid, that.gid) &&
                Objects.equals(note, that.note) &&
                Objects.equals(dateline, that.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, fuid, fusername, gid, note, dateline);
    }
}
