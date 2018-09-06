package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadaddviews",  catalog = "")
public class Threadaddviews {
    private Integer tid;
    private Integer addviews;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "addviews")
    public Integer getAddviews() {
        return addviews;
    }

    public void setAddviews(Integer addviews) {
        this.addviews = addviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadaddviews that = (Threadaddviews) o;
        return Objects.equals(tid, that.tid) &&
                Objects.equals(addviews, that.addviews);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, addviews);
    }
}
