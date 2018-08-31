package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_visitor", schema = "lanchonggk", catalog = "")
@IdClass(VisitorPK.class)
public class Visitor {
    private Integer uid;
    private Integer vuid;
    private String vusername;
    private Integer dateline;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "vuid")
    public Integer getVuid() {
        return vuid;
    }

    public void setVuid(Integer vuid) {
        this.vuid = vuid;
    }

    @Basic
    @Column(name = "vusername")
    public String getVusername() {
        return vusername;
    }

    public void setVusername(String vusername) {
        this.vusername = vusername;
    }

    @Basic
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visitor visitor = (Visitor) o;
        return Objects.equals(uid, visitor.uid) &&
                Objects.equals(vuid, visitor.vuid) &&
                Objects.equals(vusername, visitor.vusername) &&
                Objects.equals(dateline, visitor.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, vuid, vusername, dateline);
    }
}
