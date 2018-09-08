package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_class",  catalog = "")
public class HomeClass {
    private Integer classid;
    private String classname;
    private Integer uid;
    private Integer dateline;

    @Id
    @Column(name = "classid")
    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    @Basic
    @Column(name = "classname")
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
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
        HomeClass homeClass = (HomeClass) o;
        return Objects.equals(classid, homeClass.classid) &&
                Objects.equals(classname, homeClass.classname) &&
                Objects.equals(uid, homeClass.uid) &&
                Objects.equals(dateline, homeClass.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(classid, classname, uid, dateline);
    }
}
