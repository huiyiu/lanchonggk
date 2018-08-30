package com.lanchong.forum.entity;

import javax.persistence.*;

//@Entity
@Table(name = "ldp_forum_memberrecommend", schema = "lanchonggk")
public class Memberrecommend {
    private Integer tid;
    private Integer recommenduid;
    private Integer dateline;

    @Basic
    @Column(name = "tid")
    @Id
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "recommenduid")
    public Integer getRecommenduid() {
        return recommenduid;
    }

    public void setRecommenduid(Integer recommenduid) {
        this.recommenduid = recommenduid;
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

        Memberrecommend that = (Memberrecommend) o;

        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (recommenduid != null ? !recommenduid.equals(that.recommenduid) : that.recommenduid != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (recommenduid != null ? recommenduid.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        return result;
    }
}
