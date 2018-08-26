package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_poststick", schema = "lanchonggk", catalog = "")
@IdClass(PoststickPK.class)
public class Poststick {
    private Integer tid;
    private Integer pid;
    private Integer position;
    private Integer dateline;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Id
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "position")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
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

        Poststick poststick = (Poststick) o;

        if (tid != null ? !tid.equals(poststick.tid) : poststick.tid != null) return false;
        if (pid != null ? !pid.equals(poststick.pid) : poststick.pid != null) return false;
        if (position != null ? !position.equals(poststick.position) : poststick.position != null) return false;
        if (dateline != null ? !dateline.equals(poststick.dateline) : poststick.dateline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        return result;
    }
}
