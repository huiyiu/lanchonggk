package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadclosed",  catalog = "")
public class Threadclosed {
    private Integer tid;
    private Integer redirect;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "redirect")
    public Integer getRedirect() {
        return redirect;
    }

    public void setRedirect(Integer redirect) {
        this.redirect = redirect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadclosed that = (Threadclosed) o;
        return Objects.equals(tid, that.tid) &&
                Objects.equals(redirect, that.redirect);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, redirect);
    }
}
