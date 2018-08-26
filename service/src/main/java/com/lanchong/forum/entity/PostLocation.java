package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_post_location", schema = "lanchonggk", catalog = "")
public class PostLocation {
    private Integer pid;
    private Integer tid;
    private Integer uid;
    private String mapx;
    private String mapy;
    private String location;

    @Id
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "mapx")
    public String getMapx() {
        return mapx;
    }

    public void setMapx(String mapx) {
        this.mapx = mapx;
    }

    @Basic
    @Column(name = "mapy")
    public String getMapy() {
        return mapy;
    }

    public void setMapy(String mapy) {
        this.mapy = mapy;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostLocation that = (PostLocation) o;

        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (mapx != null ? !mapx.equals(that.mapx) : that.mapx != null) return false;
        if (mapy != null ? !mapy.equals(that.mapy) : that.mapy != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (mapx != null ? mapx.hashCode() : 0);
        result = 31 * result + (mapy != null ? mapy.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
