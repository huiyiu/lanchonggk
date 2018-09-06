package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_thread_moderate",  catalog = "")
public class ThreadModerate {
    private Integer id;
    private Byte status;
    private Integer dateline;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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
        ThreadModerate that = (ThreadModerate) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(status, that.status) &&
                Objects.equals(dateline, that.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, status, dateline);
    }
}
