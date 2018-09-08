package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_collectionrelated",  catalog = "")
public class Collectionrelated {
    private Integer tid;
    private String collection;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "collection")
    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Collectionrelated that = (Collectionrelated) o;

        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (collection != null ? !collection.equals(that.collection) : that.collection != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (collection != null ? collection.hashCode() : 0);
        return result;
    }
}
