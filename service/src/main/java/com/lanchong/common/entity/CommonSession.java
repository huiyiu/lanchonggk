package com.lanchong.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "ldp_common_session", schema = "bdm186320220", catalog = "")
public class CommonSession {
    private String sid;
    private Byte ip1;
    private Byte ip2;
    private Byte ip3;
    private Byte ip4;
    private Integer uid;
    private String username;
    private Short groupid;
    private Byte invisible;
    private Byte action;
    private Integer lastactivity;
    private Integer lastolupdate;
    private Integer fid;
    private Integer tid;

    @Basic
    @Column(name = "sid")
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "ip1")
    public Byte getIp1() {
        return ip1;
    }

    public void setIp1(Byte ip1) {
        this.ip1 = ip1;
    }

    @Basic
    @Column(name = "ip2")
    public Byte getIp2() {
        return ip2;
    }

    public void setIp2(Byte ip2) {
        this.ip2 = ip2;
    }

    @Basic
    @Column(name = "ip3")
    public Byte getIp3() {
        return ip3;
    }

    public void setIp3(Byte ip3) {
        this.ip3 = ip3;
    }

    @Basic
    @Column(name = "ip4")
    public Byte getIp4() {
        return ip4;
    }

    public void setIp4(Byte ip4) {
        this.ip4 = ip4;
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
    @Column(name = "groupid")
    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    @Basic
    @Column(name = "invisible")
    public Byte getInvisible() {
        return invisible;
    }

    public void setInvisible(Byte invisible) {
        this.invisible = invisible;
    }

    @Basic
    @Column(name = "action")
    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }

    @Basic
    @Column(name = "lastactivity")
    public Integer getLastactivity() {
        return lastactivity;
    }

    public void setLastactivity(Integer lastactivity) {
        this.lastactivity = lastactivity;
    }

    @Basic
    @Column(name = "lastolupdate")
    public Integer getLastolupdate() {
        return lastolupdate;
    }

    public void setLastolupdate(Integer lastolupdate) {
        this.lastolupdate = lastolupdate;
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
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonSession session = (CommonSession) o;
        return Objects.equals(sid, session.sid) &&
                Objects.equals(ip1, session.ip1) &&
                Objects.equals(ip2, session.ip2) &&
                Objects.equals(ip3, session.ip3) &&
                Objects.equals(ip4, session.ip4) &&
                Objects.equals(uid, session.uid) &&
                Objects.equals(username, session.username) &&
                Objects.equals(groupid, session.groupid) &&
                Objects.equals(invisible, session.invisible) &&
                Objects.equals(action, session.action) &&
                Objects.equals(lastactivity, session.lastactivity) &&
                Objects.equals(lastolupdate, session.lastolupdate) &&
                Objects.equals(fid, session.fid) &&
                Objects.equals(tid, session.tid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sid, ip1, ip2, ip3, ip4, uid, username, groupid, invisible, action, lastactivity, lastolupdate, fid, tid);
    }
}
