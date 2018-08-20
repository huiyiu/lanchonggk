package com.lanchong.common;

public class UserInfo {
    private Integer uid;
    private String username;

    public UserInfo() {
    }

    public UserInfo(Integer uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}