package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

//@Entity
@Table(name = "ldp_forum_threadimage",  catalog = "")
public class Threadimage {
    private Integer tid;
    private String attachment;
    private Byte remote;

    @Basic
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "attachment")
    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Basic
    @Column(name = "remote")
    public Byte getRemote() {
        return remote;
    }

    public void setRemote(Byte remote) {
        this.remote = remote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadimage that = (Threadimage) o;
        return Objects.equals(tid, that.tid) &&
                Objects.equals(attachment, that.attachment) &&
                Objects.equals(remote, that.remote);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, attachment, remote);
    }
}
