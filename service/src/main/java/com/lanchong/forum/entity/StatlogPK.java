package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

public class StatlogPK implements Serializable {
    private Date logdate;
    private Integer fid;

    @Column(name = "logdate")
    @Id
    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    @Column(name = "fid")
    @Id
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatlogPK statlogPK = (StatlogPK) o;

        if (logdate != null ? !logdate.equals(statlogPK.logdate) : statlogPK.logdate != null) return false;
        if (fid != null ? !fid.equals(statlogPK.fid) : statlogPK.fid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logdate != null ? logdate.hashCode() : 0;
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        return result;
    }
}
