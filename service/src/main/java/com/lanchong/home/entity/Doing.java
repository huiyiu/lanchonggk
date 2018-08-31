package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_doing", schema = "lanchonggk", catalog = "")
public class Doing {
    private Integer doid;
    private Integer uid;
    private String username;
    private String from;
    private Integer dateline;
    private String message;
    private String ip;
    private Short port;
    private Integer replynum;
    private Byte status;

    @Id
    @Column(name = "doid")
    public Integer getDoid() {
        return doid;
    }

    public void setDoid(Integer doid) {
        this.doid = doid;
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
    @Column(name = "from")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
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
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "port")
    public Short getPort() {
        return port;
    }

    public void setPort(Short port) {
        this.port = port;
    }

    @Basic
    @Column(name = "replynum")
    public Integer getReplynum() {
        return replynum;
    }

    public void setReplynum(Integer replynum) {
        this.replynum = replynum;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doing doing = (Doing) o;
        return Objects.equals(doid, doing.doid) &&
                Objects.equals(uid, doing.uid) &&
                Objects.equals(username, doing.username) &&
                Objects.equals(from, doing.from) &&
                Objects.equals(dateline, doing.dateline) &&
                Objects.equals(message, doing.message) &&
                Objects.equals(ip, doing.ip) &&
                Objects.equals(port, doing.port) &&
                Objects.equals(replynum, doing.replynum) &&
                Objects.equals(status, doing.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(doid, uid, username, from, dateline, message, ip, port, replynum, status);
    }
}
