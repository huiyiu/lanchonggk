package com.lanchong.ucenter.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_ucenter_members", catalog = "")
public class Members {
    private Integer uid;
    private String username;
    private String password;
    private String email;
    private String myid;
    private String myidkey;
    private String regip;
    private Integer regdate;
    private Integer lastloginip;
    private Integer lastlogintime;
    private String salt;
    private String secques;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "myid")
    public String getMyid() {
        return myid;
    }

    public void setMyid(String myid) {
        this.myid = myid;
    }

    @Basic
    @Column(name = "myidkey")
    public String getMyidkey() {
        return myidkey;
    }

    public void setMyidkey(String myidkey) {
        this.myidkey = myidkey;
    }

    @Basic
    @Column(name = "regip")
    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip;
    }

    @Basic
    @Column(name = "regdate")
    public Integer getRegdate() {
        return regdate;
    }

    public void setRegdate(Integer regdate) {
        this.regdate = regdate;
    }

    @Basic
    @Column(name = "lastloginip")
    public Integer getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(Integer lastloginip) {
        this.lastloginip = lastloginip;
    }

    @Basic
    @Column(name = "lastlogintime")
    public Integer getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Integer lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    @Basic
    @Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "secques")
    public String getSecques() {
        return secques;
    }

    public void setSecques(String secques) {
        this.secques = secques;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Members members = (Members) o;
        return Objects.equals(uid, members.uid) &&
                Objects.equals(username, members.username) &&
                Objects.equals(password, members.password) &&
                Objects.equals(email, members.email) &&
                Objects.equals(myid, members.myid) &&
                Objects.equals(myidkey, members.myidkey) &&
                Objects.equals(regip, members.regip) &&
                Objects.equals(regdate, members.regdate) &&
                Objects.equals(lastloginip, members.lastloginip) &&
                Objects.equals(lastlogintime, members.lastlogintime) &&
                Objects.equals(salt, members.salt) &&
                Objects.equals(secques, members.secques);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, username, password, email, myid, myidkey, regip, regdate, lastloginip, lastlogintime, salt, secques);
    }
}
