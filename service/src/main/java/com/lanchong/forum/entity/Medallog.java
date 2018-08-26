package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_medallog", schema = "lanchonggk", catalog = "")
public class Medallog {
    private Integer id;
    private Integer uid;
    private Short medalid;
    private Byte type;
    private Integer dateline;
    private Integer expiration;
    private Byte status;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "medalid")
    public Short getMedalid() {
        return medalid;
    }

    public void setMedalid(Short medalid) {
        this.medalid = medalid;
    }

    @Basic
    @Column(name = "type")
    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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
    @Column(name = "expiration")
    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
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

        Medallog medallog = (Medallog) o;

        if (id != null ? !id.equals(medallog.id) : medallog.id != null) return false;
        if (uid != null ? !uid.equals(medallog.uid) : medallog.uid != null) return false;
        if (medalid != null ? !medalid.equals(medallog.medalid) : medallog.medalid != null) return false;
        if (type != null ? !type.equals(medallog.type) : medallog.type != null) return false;
        if (dateline != null ? !dateline.equals(medallog.dateline) : medallog.dateline != null) return false;
        if (expiration != null ? !expiration.equals(medallog.expiration) : medallog.expiration != null) return false;
        if (status != null ? !status.equals(medallog.status) : medallog.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (medalid != null ? medalid.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
