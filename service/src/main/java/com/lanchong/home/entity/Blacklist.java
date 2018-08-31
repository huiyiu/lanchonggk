package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_blacklist", schema = "lanchonggk", catalog = "")
@IdClass(BlacklistPK.class)
public class Blacklist {
    private Integer uid;
    private Integer buid;
    private Integer dateline;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "buid")
    public Integer getBuid() {
        return buid;
    }

    public void setBuid(Integer buid) {
        this.buid = buid;
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
        Blacklist blacklist = (Blacklist) o;
        return Objects.equals(uid, blacklist.uid) &&
                Objects.equals(buid, blacklist.buid) &&
                Objects.equals(dateline, blacklist.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, buid, dateline);
    }
}
