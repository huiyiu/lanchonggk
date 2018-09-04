package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_friend", schema = "lanchonggk", catalog = "")
@IdClass(FriendPK.class)
public class Friend {
    private Integer uid;
    private Integer fuid;
    private String fusername;

    private Short gid;
    private Integer num;
    private Integer dateline;
    private String note;


    @Transient
    private String gName;
    @Transient
    private String avatar;


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
    @Column(name = "num")
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return Objects.equals(uid, friend.uid) &&
                Objects.equals(fuid, friend.fuid) &&
                Objects.equals(fusername, friend.fusername) &&
                Objects.equals(gid, friend.gid) &&
                Objects.equals(num, friend.num) &&
                Objects.equals(dateline, friend.dateline) &&
                Objects.equals(note, friend.note);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, fuid, fusername, gid, num, dateline, note);
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
