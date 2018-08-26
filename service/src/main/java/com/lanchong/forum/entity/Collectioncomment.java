package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_collectioncomment", schema = "lanchonggk", catalog = "")
public class Collectioncomment {
    private Integer cid;
    private Integer ctid;
    private Integer uid;
    private String username;
    private String message;
    private Integer dateline;
    private String useip;
    private Short port;
    private Double rate;

    @Id
    @Column(name = "cid")
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "ctid")
    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
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
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
    @Column(name = "useip")
    public String getUseip() {
        return useip;
    }

    public void setUseip(String useip) {
        this.useip = useip;
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
    @Column(name = "rate")
    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Collectioncomment that = (Collectioncomment) o;

        if (cid != null ? !cid.equals(that.cid) : that.cid != null) return false;
        if (ctid != null ? !ctid.equals(that.ctid) : that.ctid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;
        if (useip != null ? !useip.equals(that.useip) : that.useip != null) return false;
        if (port != null ? !port.equals(that.port) : that.port != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid != null ? cid.hashCode() : 0;
        result = 31 * result + (ctid != null ? ctid.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (useip != null ? useip.hashCode() : 0);
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        return result;
    }
}
