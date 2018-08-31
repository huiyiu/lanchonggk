package com.lanchong.home.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class FriendRequestPK implements Serializable {
    private Integer uid;
    private Integer fuid;

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "fuid")
    @Id
    public Integer getFuid() {
        return fuid;
    }

    public void setFuid(Integer fuid) {
        this.fuid = fuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendRequestPK that = (FriendRequestPK) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(fuid, that.fuid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, fuid);
    }
}
