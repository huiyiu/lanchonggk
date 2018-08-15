package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_mailcron", catalog = "")
public class Mailcron {
    private Long cid;
    private Integer touid;
    private String email;
    private Integer sendtime;

    @Id
    @Column(name = "cid")
    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "touid")
    public Integer getTouid() {
        return touid;
    }

    public void setTouid(Integer touid) {
        this.touid = touid;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "sendtime")
    public Integer getSendtime() {
        return sendtime;
    }

    public void setSendtime(Integer sendtime) {
        this.sendtime = sendtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mailcron mailcron = (Mailcron) o;
        return Objects.equals(cid, mailcron.cid) &&
                Objects.equals(touid, mailcron.touid) &&
                Objects.equals(email, mailcron.email) &&
                Objects.equals(sendtime, mailcron.sendtime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cid, touid, email, sendtime);
    }
}
