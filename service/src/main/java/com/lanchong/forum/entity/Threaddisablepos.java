package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threaddisablepos",  catalog = "")
public class Threaddisablepos {
    private Integer tid;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threaddisablepos that = (Threaddisablepos) o;
        return Objects.equals(tid, that.tid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid);
    }
}
