package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadprofile",  catalog = "")
public class Threadprofile {
    private Integer id;
    private String name;
    private String template;
    private Byte global;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "template")
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Basic
    @Column(name = "global")
    public Byte getGlobal() {
        return global;
    }

    public void setGlobal(Byte global) {
        this.global = global;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadprofile that = (Threadprofile) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(template, that.template) &&
                Objects.equals(global, that.global);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, template, global);
    }
}
