package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_replycredit",  catalog = "")
public class Replycredit {
    private Integer tid;
    private Integer extcredits;
    private Byte extcreditstype;
    private Short times;
    private Short membertimes;
    private Byte random;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "extcredits")
    public Integer getExtcredits() {
        return extcredits;
    }

    public void setExtcredits(Integer extcredits) {
        this.extcredits = extcredits;
    }

    @Basic
    @Column(name = "extcreditstype")
    public Byte getExtcreditstype() {
        return extcreditstype;
    }

    public void setExtcreditstype(Byte extcreditstype) {
        this.extcreditstype = extcreditstype;
    }

    @Basic
    @Column(name = "times")
    public Short getTimes() {
        return times;
    }

    public void setTimes(Short times) {
        this.times = times;
    }

    @Basic
    @Column(name = "membertimes")
    public Short getMembertimes() {
        return membertimes;
    }

    public void setMembertimes(Short membertimes) {
        this.membertimes = membertimes;
    }

    @Basic
    @Column(name = "random")
    public Byte getRandom() {
        return random;
    }

    public void setRandom(Byte random) {
        this.random = random;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Replycredit that = (Replycredit) o;

        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (extcredits != null ? !extcredits.equals(that.extcredits) : that.extcredits != null) return false;
        if (extcreditstype != null ? !extcreditstype.equals(that.extcreditstype) : that.extcreditstype != null)
            return false;
        if (times != null ? !times.equals(that.times) : that.times != null) return false;
        if (membertimes != null ? !membertimes.equals(that.membertimes) : that.membertimes != null) return false;
        if (random != null ? !random.equals(that.random) : that.random != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (extcredits != null ? extcredits.hashCode() : 0);
        result = 31 * result + (extcreditstype != null ? extcreditstype.hashCode() : 0);
        result = 31 * result + (times != null ? times.hashCode() : 0);
        result = 31 * result + (membertimes != null ? membertimes.hashCode() : 0);
        result = 31 * result + (random != null ? random.hashCode() : 0);
        return result;
    }
}
