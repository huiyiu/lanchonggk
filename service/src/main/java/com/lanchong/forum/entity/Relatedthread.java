package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_relatedthread",  catalog = "")
@IdClass(RelatedthreadPK.class)
public class Relatedthread {
    private Integer tid;
    private Integer type;
    private Integer expiration;
    private String keywords;
    private String relatedthreads;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Id
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "expiration")
    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    @Basic
    @Column(name = "keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "relatedthreads")
    public String getRelatedthreads() {
        return relatedthreads;
    }

    public void setRelatedthreads(String relatedthreads) {
        this.relatedthreads = relatedthreads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Relatedthread that = (Relatedthread) o;

        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (expiration != null ? !expiration.equals(that.expiration) : that.expiration != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (relatedthreads != null ? !relatedthreads.equals(that.relatedthreads) : that.relatedthreads != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (relatedthreads != null ? relatedthreads.hashCode() : 0);
        return result;
    }
}
