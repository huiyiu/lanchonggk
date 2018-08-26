package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_moderator", schema = "lanchonggk", catalog = "")
@IdClass(ModeratorPK.class)
public class Moderator {
    private Integer uid;
    private Integer fid;
    private Byte displayorder;
    private Byte inherited;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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
    @Column(name = "inherited")
    public Byte getInherited() {
        return inherited;
    }

    public void setInherited(Byte inherited) {
        this.inherited = inherited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Moderator moderator = (Moderator) o;

        if (uid != null ? !uid.equals(moderator.uid) : moderator.uid != null) return false;
        if (fid != null ? !fid.equals(moderator.fid) : moderator.fid != null) return false;
        if (displayorder != null ? !displayorder.equals(moderator.displayorder) : moderator.displayorder != null)
            return false;
        if (inherited != null ? !inherited.equals(moderator.inherited) : moderator.inherited != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (inherited != null ? inherited.hashCode() : 0);
        return result;
    }
}
