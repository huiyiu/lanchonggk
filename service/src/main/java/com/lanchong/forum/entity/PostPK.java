package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PostPK implements Serializable {
    private Integer tid;
    private Integer position;

    @Column(name = "tid")
    @Id
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Column(name = "position")
    @Id
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostPK postPK = (PostPK) o;

        if (tid != null ? !tid.equals(postPK.tid) : postPK.tid != null) return false;
        if (position != null ? !position.equals(postPK.position) : postPK.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
