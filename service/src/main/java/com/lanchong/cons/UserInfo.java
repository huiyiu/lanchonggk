package com.lanchong.cons;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private Integer uid;
    private String username;
    private String mobile;
    private Boolean avatarstatus;//用户头像状态
}