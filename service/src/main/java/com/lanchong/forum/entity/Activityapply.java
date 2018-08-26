package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_activityapply", schema = "lanchonggk", catalog = "")
public class Activityapply {
    private Integer applyid;
    private Integer tid;
    private String username;
    private Integer uid;
    private String message;
    private Byte verified;
    private Integer dateline;
    private Integer payment;
    private String ufielddata;

    @Id
    @Column(name = "applyid")
    public Integer getApplyid() {
        return applyid;
    }

    public void setApplyid(Integer applyid) {
        this.applyid = applyid;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "verified")
    public Byte getVerified() {
        return verified;
    }

    public void setVerified(Byte verified) {
        this.verified = verified;
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
    @Column(name = "payment")
    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "ufielddata")
    public String getUfielddata() {
        return ufielddata;
    }

    public void setUfielddata(String ufielddata) {
        this.ufielddata = ufielddata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activityapply that = (Activityapply) o;

        if (applyid != null ? !applyid.equals(that.applyid) : that.applyid != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (verified != null ? !verified.equals(that.verified) : that.verified != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;
        if (payment != null ? !payment.equals(that.payment) : that.payment != null) return false;
        if (ufielddata != null ? !ufielddata.equals(that.ufielddata) : that.ufielddata != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = applyid != null ? applyid.hashCode() : 0;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (verified != null ? verified.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (ufielddata != null ? ufielddata.hashCode() : 0);
        return result;
    }
}
