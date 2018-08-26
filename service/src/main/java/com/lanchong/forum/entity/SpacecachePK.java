package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SpacecachePK implements Serializable {
    private Integer uid;
    private String variable;

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "variable")
    @Id
    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpacecachePK that = (SpacecachePK) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (variable != null ? !variable.equals(that.variable) : that.variable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (variable != null ? variable.hashCode() : 0);
        return result;
    }
}
