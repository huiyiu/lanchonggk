package com.lanchong.ucenter.entity;

import javax.persistence.*;

@Table(name = "ldp_ucenter_members")
public class Members {
    @Id
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

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return myid
     */
    public String getMyid() {
        return myid;
    }

    /**
     * @param myid
     */
    public void setMyid(String myid) {
        this.myid = myid;
    }

    /**
     * @return myidkey
     */
    public String getMyidkey() {
        return myidkey;
    }

    /**
     * @param myidkey
     */
    public void setMyidkey(String myidkey) {
        this.myidkey = myidkey;
    }

    /**
     * @return regip
     */
    public String getRegip() {
        return regip;
    }

    /**
     * @param regip
     */
    public void setRegip(String regip) {
        this.regip = regip;
    }

    /**
     * @return regdate
     */
    public Integer getRegdate() {
        return regdate;
    }

    /**
     * @param regdate
     */
    public void setRegdate(Integer regdate) {
        this.regdate = regdate;
    }

    /**
     * @return lastloginip
     */
    public Integer getLastloginip() {
        return lastloginip;
    }

    /**
     * @param lastloginip
     */
    public void setLastloginip(Integer lastloginip) {
        this.lastloginip = lastloginip;
    }

    /**
     * @return lastlogintime
     */
    public Integer getLastlogintime() {
        return lastlogintime;
    }

    /**
     * @param lastlogintime
     */
    public void setLastlogintime(Integer lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * @return secques
     */
    public String getSecques() {
        return secques;
    }

    /**
     * @param secques
     */
    public void setSecques(String secques) {
        this.secques = secques;
    }
}