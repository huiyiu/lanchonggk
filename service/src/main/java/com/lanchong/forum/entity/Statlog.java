package com.lanchong.forum.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ldp_forum_statlog", schema = "lanchonggk", catalog = "")
@IdClass(StatlogPK.class)
public class Statlog {
    private Date logdate;
    private Integer fid;
    private Short type;
    private Integer value;

    @Id
    @Column(name = "logdate")
    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    @Id
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "type")
    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    @Basic
    @Column(name = "value")
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Statlog statlog = (Statlog) o;

        if (logdate != null ? !logdate.equals(statlog.logdate) : statlog.logdate != null) return false;
        if (fid != null ? !fid.equals(statlog.fid) : statlog.fid != null) return false;
        if (type != null ? !type.equals(statlog.type) : statlog.type != null) return false;
        if (value != null ? !value.equals(statlog.value) : statlog.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logdate != null ? logdate.hashCode() : 0;
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
