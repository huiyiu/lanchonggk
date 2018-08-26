package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_groupinvite", schema = "lanchonggk", catalog = "")
public class Groupinvite {
    private Integer fid;
    private Integer uid;
    private Integer inviteuid;
    private Integer dateline;

    @Basic
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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
    @Column(name = "inviteuid")
    public Integer getInviteuid() {
        return inviteuid;
    }

    public void setInviteuid(Integer inviteuid) {
        this.inviteuid = inviteuid;
    }

    @Basic
    @Column(name = "dateline")
    @Id
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

        Groupinvite that = (Groupinvite) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (inviteuid != null ? !inviteuid.equals(that.inviteuid) : that.inviteuid != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (inviteuid != null ? inviteuid.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        return result;
    }
}
