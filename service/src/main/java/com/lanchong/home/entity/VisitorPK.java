package com.lanchong.home.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class VisitorPK implements Serializable {
    private Integer uid;
    private Integer vuid;

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "vuid")
    @Id
    public Integer getVuid() {
        return vuid;
    }

    public void setVuid(Integer vuid) {
        this.vuid = vuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisitorPK visitorPK = (VisitorPK) o;
        return Objects.equals(uid, visitorPK.uid) &&
                Objects.equals(vuid, visitorPK.vuid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, vuid);
    }
}
