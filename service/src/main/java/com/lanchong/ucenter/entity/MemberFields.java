package com.lanchong.ucenter.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_ucenter_memberfields")
public class MemberFields {
    private Long uid;
    private String blacklist;

    @Id
    @Column(name = "uid")
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "blacklist")
    public String getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(String blacklist) {
        this.blacklist = blacklist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberFields that = (MemberFields) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(blacklist, that.blacklist);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, blacklist);
    }
}
