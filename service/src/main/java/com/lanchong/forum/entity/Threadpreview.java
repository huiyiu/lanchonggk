package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadpreview",  catalog = "")
public class Threadpreview {
    private Integer tid;
    private Integer relay;
    private String content;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "relay")
    public Integer getRelay() {
        return relay;
    }

    public void setRelay(Integer relay) {
        this.relay = relay;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadpreview that = (Threadpreview) o;
        return Objects.equals(tid, that.tid) &&
                Objects.equals(relay, that.relay) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, relay, content);
    }
}
