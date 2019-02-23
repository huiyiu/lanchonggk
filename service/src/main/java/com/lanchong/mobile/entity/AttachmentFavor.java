package com.lanchong.mobile.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ldp_mobile_attachment_favor", catalog = "")
@Data
public class AttachmentFavor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    @ApiModelProperty(value = "帖子编号")
    private Integer pid;
   /* @Column
    @ApiModelProperty(value = "作者")
    private Integer authorId;
    @Column
    @ApiModelProperty(value = "作者")
    private String author;*/
    @Column
    @ApiModelProperty(value = "关注者")
    private Integer userId;
    @Column
    @ApiModelProperty(value = "类型：0，帖子；1：跟帖")
    private Integer pidType;
    @Column
    @ApiModelProperty(value = "关注时间")
    private Integer createTime;

}
