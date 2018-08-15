package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_mailqueue", schema = "bdm186320220", catalog = "")
public class Mailqueue {
    private Integer qid;
    private Integer cid;
    private String subject;
    private String message;
    private Integer dateline;

    @Id
    @Column(name = "qid")
    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    @Basic
    @Column(name = "cid")
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        Mailqueue mailqueue = (Mailqueue) o;
        return Objects.equals(qid, mailqueue.qid) &&
                Objects.equals(cid, mailqueue.cid) &&
                Objects.equals(subject, mailqueue.subject) &&
                Objects.equals(message, mailqueue.message) &&
                Objects.equals(dateline, mailqueue.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(qid, cid, subject, message, dateline);
    }
}
