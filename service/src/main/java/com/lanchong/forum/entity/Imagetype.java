package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_imagetype",  catalog = "")
public class Imagetype {
    private Short typeid;
    private Byte available;
    private String name;
    private Integer type;
    private Byte displayorder;
    private String directory;

    @Id
    @Column(name = "typeid")
    public Short getTypeid() {
        return typeid;
    }

    public void setTypeid(Short typeid) {
        this.typeid = typeid;
    }

    @Basic
    @Column(name = "available")
    public Byte getAvailable() {
        return available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
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
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "displayorder")
    public Byte getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Byte displayorder) {
        this.displayorder = displayorder;
    }

    @Basic
    @Column(name = "directory")
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Imagetype imagetype = (Imagetype) o;

        if (typeid != null ? !typeid.equals(imagetype.typeid) : imagetype.typeid != null) return false;
        if (available != null ? !available.equals(imagetype.available) : imagetype.available != null) return false;
        if (name != null ? !name.equals(imagetype.name) : imagetype.name != null) return false;
        if (type != null ? !type.equals(imagetype.type) : imagetype.type != null) return false;
        if (displayorder != null ? !displayorder.equals(imagetype.displayorder) : imagetype.displayorder != null)
            return false;
        if (directory != null ? !directory.equals(imagetype.directory) : imagetype.directory != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeid != null ? typeid.hashCode() : 0;
        result = 31 * result + (available != null ? available.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (directory != null ? directory.hashCode() : 0);
        return result;
    }
}
