package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_access", catalog = "")
@IdClass(AccessPK.class)
public class Access {
    private Integer uid;
    private Integer fid;
    private Byte allowview;
    private Byte allowpost;
    private Byte allowreply;
    private Byte allowgetattach;
    private Byte allowgetimage;
    private Byte allowpostattach;
    private Byte allowpostimage;
    private Integer adminuser;
    private Integer dateline;

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
    @Column(name = "allowview")
    public Byte getAllowview() {
        return allowview;
    }

    public void setAllowview(Byte allowview) {
        this.allowview = allowview;
    }

    @Basic
    @Column(name = "allowpost")
    public Byte getAllowpost() {
        return allowpost;
    }

    public void setAllowpost(Byte allowpost) {
        this.allowpost = allowpost;
    }

    @Basic
    @Column(name = "allowreply")
    public Byte getAllowreply() {
        return allowreply;
    }

    public void setAllowreply(Byte allowreply) {
        this.allowreply = allowreply;
    }

    @Basic
    @Column(name = "allowgetattach")
    public Byte getAllowgetattach() {
        return allowgetattach;
    }

    public void setAllowgetattach(Byte allowgetattach) {
        this.allowgetattach = allowgetattach;
    }

    @Basic
    @Column(name = "allowgetimage")
    public Byte getAllowgetimage() {
        return allowgetimage;
    }

    public void setAllowgetimage(Byte allowgetimage) {
        this.allowgetimage = allowgetimage;
    }

    @Basic
    @Column(name = "allowpostattach")
    public Byte getAllowpostattach() {
        return allowpostattach;
    }

    public void setAllowpostattach(Byte allowpostattach) {
        this.allowpostattach = allowpostattach;
    }

    @Basic
    @Column(name = "allowpostimage")
    public Byte getAllowpostimage() {
        return allowpostimage;
    }

    public void setAllowpostimage(Byte allowpostimage) {
        this.allowpostimage = allowpostimage;
    }

    @Basic
    @Column(name = "adminuser")
    public Integer getAdminuser() {
        return adminuser;
    }

    public void setAdminuser(Integer adminuser) {
        this.adminuser = adminuser;
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

        Access that = (Access) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (allowview != null ? !allowview.equals(that.allowview) : that.allowview != null) return false;
        if (allowpost != null ? !allowpost.equals(that.allowpost) : that.allowpost != null) return false;
        if (allowreply != null ? !allowreply.equals(that.allowreply) : that.allowreply != null) return false;
        if (allowgetattach != null ? !allowgetattach.equals(that.allowgetattach) : that.allowgetattach != null)
            return false;
        if (allowgetimage != null ? !allowgetimage.equals(that.allowgetimage) : that.allowgetimage != null)
            return false;
        if (allowpostattach != null ? !allowpostattach.equals(that.allowpostattach) : that.allowpostattach != null)
            return false;
        if (allowpostimage != null ? !allowpostimage.equals(that.allowpostimage) : that.allowpostimage != null)
            return false;
        if (adminuser != null ? !adminuser.equals(that.adminuser) : that.adminuser != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        result = 31 * result + (allowview != null ? allowview.hashCode() : 0);
        result = 31 * result + (allowpost != null ? allowpost.hashCode() : 0);
        result = 31 * result + (allowreply != null ? allowreply.hashCode() : 0);
        result = 31 * result + (allowgetattach != null ? allowgetattach.hashCode() : 0);
        result = 31 * result + (allowgetimage != null ? allowgetimage.hashCode() : 0);
        result = 31 * result + (allowpostattach != null ? allowpostattach.hashCode() : 0);
        result = 31 * result + (allowpostimage != null ? allowpostimage.hashCode() : 0);
        result = 31 * result + (adminuser != null ? adminuser.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        return result;
    }
}
