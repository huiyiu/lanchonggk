package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_comment", schema = "lanchonggk", catalog = "")
public class Comment {
    private Integer cid;
    private Integer uid;
    private Integer id;
    private String idtype;
    private Integer authorid;
    private String author;
    private String ip;
    private Short port;
    private Integer dateline;
    private String message;
    private Byte magicflicker;
    private Byte status;

    @Id
    @Column(name = "cid")
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idtype")
    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    @Basic
    @Column(name = "authorid")
    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
    @Column(name = "magicflicker")
    public Byte getMagicflicker() {
        return magicflicker;
    }

    public void setMagicflicker(Byte magicflicker) {
        this.magicflicker = magicflicker;
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
        Comment comment = (Comment) o;
        return Objects.equals(cid, comment.cid) &&
                Objects.equals(uid, comment.uid) &&
                Objects.equals(id, comment.id) &&
                Objects.equals(idtype, comment.idtype) &&
                Objects.equals(authorid, comment.authorid) &&
                Objects.equals(author, comment.author) &&
                Objects.equals(ip, comment.ip) &&
                Objects.equals(port, comment.port) &&
                Objects.equals(dateline, comment.dateline) &&
                Objects.equals(message, comment.message) &&
                Objects.equals(magicflicker, comment.magicflicker) &&
                Objects.equals(status, comment.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cid, uid, id, idtype, authorid, author, ip, port, dateline, message, magicflicker, status);
    }
}
