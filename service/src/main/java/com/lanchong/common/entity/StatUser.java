package com.lanchong.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;


@Table(name = "ldp_common_statuser")
public class StatUser {
    private Integer uid;
    private Integer daytime;
    private String type;

    @Basic
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "daytime")
    public Integer getDaytime() {
        return daytime;
    }

    public void setDaytime(Integer daytime) {
        this.daytime = daytime;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatUser statUser = (StatUser) o;
        return Objects.equals(uid, statUser.uid) &&
                Objects.equals(daytime, statUser.daytime) &&
                Objects.equals(type, statUser.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, daytime, type);
    }
}
