package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_picfield", schema = "lanchonggk", catalog = "")
public class Picfield {
    private Integer picid;
    private String hotuser;

    @Id
    @Column(name = "picid")
    public Integer getPicid() {
        return picid;
    }

    public void setPicid(Integer picid) {
        this.picid = picid;
    }

    @Basic
    @Column(name = "hotuser")
    public String getHotuser() {
        return hotuser;
    }

    public void setHotuser(String hotuser) {
        this.hotuser = hotuser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picfield picfield = (Picfield) o;
        return Objects.equals(picid, picfield.picid) &&
                Objects.equals(hotuser, picfield.hotuser);
    }

    @Override
    public int hashCode() {

        return Objects.hash(picid, hotuser);
    }
}
