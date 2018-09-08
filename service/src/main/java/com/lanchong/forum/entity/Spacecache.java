package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_spacecache",  catalog = "")
@IdClass(SpacecachePK.class)
public class Spacecache {
    private Integer uid;
    private String variable;
    private String value;
    private Integer expiration;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "variable")
    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "expiration")
    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spacecache that = (Spacecache) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (variable != null ? !variable.equals(that.variable) : that.variable != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (expiration != null ? !expiration.equals(that.expiration) : that.expiration != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (variable != null ? variable.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        return result;
    }
}
