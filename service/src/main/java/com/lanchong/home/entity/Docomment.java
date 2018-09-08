package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_docomment",  catalog = "")
public class Docomment {
    private Integer id;
    private Integer upid;
    private Integer doid;
    private Integer uid;
    private String username;
    private Integer dateline;
    private String message;
    private String ip;
    private Short grade;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "upid")
    public Integer getUpid() {
        return upid;
    }

    public void setUpid(Integer upid) {
        this.upid = upid;
    }

    @Basic
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
    @Column(name = "grade")
    public Short getGrade() {
        return grade;
    }

    public void setGrade(Short grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Docomment docomment = (Docomment) o;
        return Objects.equals(id, docomment.id) &&
                Objects.equals(upid, docomment.upid) &&
                Objects.equals(doid, docomment.doid) &&
                Objects.equals(uid, docomment.uid) &&
                Objects.equals(username, docomment.username) &&
                Objects.equals(dateline, docomment.dateline) &&
                Objects.equals(message, docomment.message) &&
                Objects.equals(ip, docomment.ip) &&
                Objects.equals(grade, docomment.grade);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, upid, doid, uid, username, dateline, message, ip, grade);
    }
}
