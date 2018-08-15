package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_onlinetime", catalog = "")
public class Onlinetime {
    private Integer uid;
    private Short thismonth;
    private Integer total;
    private Integer lastupdate;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "thismonth")
    public Short getThismonth() {
        return thismonth;
    }

    public void setThismonth(Short thismonth) {
        this.thismonth = thismonth;
    }

    @Basic
    @Column(name = "total")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Basic
    @Column(name = "lastupdate")
    public Integer getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Integer lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Onlinetime that = (Onlinetime) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(thismonth, that.thismonth) &&
                Objects.equals(total, that.total) &&
                Objects.equals(lastupdate, that.lastupdate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, thismonth, total, lastupdate);
    }
}
