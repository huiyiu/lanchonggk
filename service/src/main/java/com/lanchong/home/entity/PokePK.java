package com.lanchong.home.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PokePK implements Serializable {
    private Integer uid;
    private Integer fromuid;

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "fromuid")
    @Id
    public Integer getFromuid() {
        return fromuid;
    }

    public void setFromuid(Integer fromuid) {
        this.fromuid = fromuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokePK pokePK = (PokePK) o;
        return Objects.equals(uid, pokePK.uid) &&
                Objects.equals(fromuid, pokePK.fromuid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, fromuid);
    }
}
