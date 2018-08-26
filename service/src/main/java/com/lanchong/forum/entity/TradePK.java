package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TradePK implements Serializable {
    private Integer tid;
    private Integer pid;

    @Column(name = "tid")
    @Id
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Column(name = "pid")
    @Id
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TradePK tradePK = (TradePK) o;

        if (tid != null ? !tid.equals(tradePK.tid) : tradePK.tid != null) return false;
        if (pid != null ? !pid.equals(tradePK.pid) : tradePK.pid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        return result;
    }
}
