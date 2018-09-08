package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_activity",  catalog = "")
public class Activity {
    private Integer tid;
    private Integer uid;
    private Integer aid;
    private Integer cost;
    private Integer starttimefrom;
    private Integer starttimeto;
    private String place;
    private String clazz;
    private Byte gender;
    private Short number;
    private Short applynumber;
    private Integer expiration;
    private String ufield;
    private Short credit;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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
    @Column(name = "aid")
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "cost")
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "starttimefrom")
    public Integer getStarttimefrom() {
        return starttimefrom;
    }

    public void setStarttimefrom(Integer starttimefrom) {
        this.starttimefrom = starttimefrom;
    }

    @Basic
    @Column(name = "starttimeto")
    public Integer getStarttimeto() {
        return starttimeto;
    }

    public void setStarttimeto(Integer starttimeto) {
        this.starttimeto = starttimeto;
    }

    @Basic
    @Column(name = "place")
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Basic
    @Column(name = "class")
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Basic
    @Column(name = "gender")
    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "number")
    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    @Basic
    @Column(name = "applynumber")
    public Short getApplynumber() {
        return applynumber;
    }

    public void setApplynumber(Short applynumber) {
        this.applynumber = applynumber;
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
    @Column(name = "ufield")
    public String getUfield() {
        return ufield;
    }

    public void setUfield(String ufield) {
        this.ufield = ufield;
    }

    @Basic
    @Column(name = "credit")
    public Short getCredit() {
        return credit;
    }

    public void setCredit(Short credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity that = (Activity) o;

        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (aid != null ? !aid.equals(that.aid) : that.aid != null) return false;
        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;
        if (starttimefrom != null ? !starttimefrom.equals(that.starttimefrom) : that.starttimefrom != null)
            return false;
        if (starttimeto != null ? !starttimeto.equals(that.starttimeto) : that.starttimeto != null) return false;
        if (place != null ? !place.equals(that.place) : that.place != null) return false;
        if (clazz != null ? !clazz.equals(that.clazz) : that.clazz != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (applynumber != null ? !applynumber.equals(that.applynumber) : that.applynumber != null) return false;
        if (expiration != null ? !expiration.equals(that.expiration) : that.expiration != null) return false;
        if (ufield != null ? !ufield.equals(that.ufield) : that.ufield != null) return false;
        if (credit != null ? !credit.equals(that.credit) : that.credit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (aid != null ? aid.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (starttimefrom != null ? starttimefrom.hashCode() : 0);
        result = 31 * result + (starttimeto != null ? starttimeto.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (clazz != null ? clazz.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (applynumber != null ? applynumber.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        result = 31 * result + (ufield != null ? ufield.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        return result;
    }
}
