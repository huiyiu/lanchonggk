package com.lanchong.home.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class FollowPK implements Serializable {
    private Integer uid;
    private Integer followuid;

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "followuid")
    @Id
    public Integer getFollowuid() {
        return followuid;
    }

    public void setFollowuid(Integer followuid) {
        this.followuid = followuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FollowPK followPK = (FollowPK) o;
        return Objects.equals(uid, followPK.uid) &&
                Objects.equals(followuid, followPK.followuid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, followuid);
    }
}
