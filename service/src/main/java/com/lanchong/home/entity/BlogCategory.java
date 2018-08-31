package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_blog_category", schema = "lanchonggk", catalog = "")
public class BlogCategory {
    private Integer catid;
    private Integer upid;
    private String catname;
    private Integer num;
    private Short displayorder;

    @Id
    @Column(name = "catid")
    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    @Basic
    @Column(name = "upid")
    public Integer getUpid() {
        return upid;
    }

    public void setUpid(Integer upid) {
        this.upid = upid;
    }

    @Basic
    @Column(name = "catname")
    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    @Basic
    @Column(name = "num")
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "displayorder")
    public Short getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Short displayorder) {
        this.displayorder = displayorder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogCategory that = (BlogCategory) o;
        return Objects.equals(catid, that.catid) &&
                Objects.equals(upid, that.upid) &&
                Objects.equals(catname, that.catname) &&
                Objects.equals(num, that.num) &&
                Objects.equals(displayorder, that.displayorder);
    }

    @Override
    public int hashCode() {

        return Objects.hash(catid, upid, catname, num, displayorder);
    }
}
