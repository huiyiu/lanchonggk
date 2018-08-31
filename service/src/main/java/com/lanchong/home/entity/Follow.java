package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_follow", schema = "lanchonggk", catalog = "")
@IdClass(FollowPK.class)
public class Follow {
    private Integer uid;
    private String username;
    private Integer followuid;
    private String fusername;
    private String bkname;
    private Byte status;
    private Byte mutual;
    private Integer dateline;

    @Id
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

    @Id
    @Column(name = "followuid")
    public Integer getFollowuid() {
        return followuid;
    }

    public void setFollowuid(Integer followuid) {
        this.followuid = followuid;
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
    @Column(name = "bkname")
    public String getBkname() {
        return bkname;
    }

    public void setBkname(String bkname) {
        this.bkname = bkname;
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
    @Column(name = "mutual")
    public Byte getMutual() {
        return mutual;
    }

    public void setMutual(Byte mutual) {
        this.mutual = mutual;
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
        Follow follow = (Follow) o;
        return Objects.equals(uid, follow.uid) &&
                Objects.equals(username, follow.username) &&
                Objects.equals(followuid, follow.followuid) &&
                Objects.equals(fusername, follow.fusername) &&
                Objects.equals(bkname, follow.bkname) &&
                Objects.equals(status, follow.status) &&
                Objects.equals(mutual, follow.mutual) &&
                Objects.equals(dateline, follow.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, username, followuid, fusername, bkname, status, mutual, dateline);
    }
}
