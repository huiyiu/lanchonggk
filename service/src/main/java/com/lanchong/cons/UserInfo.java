package com.lanchong.cons;

public class UserInfo {
    private Integer uid;
    private String username;
    private String mobile;

    public UserInfo() {
    }

    public UserInfo(Integer uid, String username, String mobile) {
        this.uid = uid;
        this.username = username;
        this.mobile = mobile;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}