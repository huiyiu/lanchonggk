package com.lanchong.ucenter.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "ldp_ucenter_members")
@Entity
public class Members implements Serializable {
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
    
    private Integer status;

}