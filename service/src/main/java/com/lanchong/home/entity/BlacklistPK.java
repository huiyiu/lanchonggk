package com.lanchong.home.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class BlacklistPK implements Serializable {
    private Integer uid;
    private Integer buid;

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "buid")
    @Id
    public Integer getBuid() {
        return buid;
    }

    public void setBuid(Integer buid) {
        this.buid = buid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlacklistPK that = (BlacklistPK) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(buid, that.buid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, buid);
    }
}
