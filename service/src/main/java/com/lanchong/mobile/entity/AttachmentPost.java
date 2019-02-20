package com.lanchong.mobile.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ldp_mobile_attachment_post", catalog = "")
@Data
public class AttachmentPost {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    @ApiModelProperty(value = "附件编号")
    private Long aid;
    @Column
    @ApiModelProperty(value = "作者")
    private String author;
    @Column
    @ApiModelProperty(value = "作者编号")
    private Long authorId;
    @Column
    @ApiModelProperty(value = "评论者编号")
    private Long userId;
    @Column
    @ApiModelProperty(value = "帖子主题，标题")
    private String title;
    @Column
    @ApiModelProperty(value = "内容")
    private String message;
    @Column
    @ApiModelProperty(value = "楼层")
    private Integer position;
    @ApiModelProperty(value = "回帖时间")
    private Integer createTime;
    @Transient
    @ApiModelProperty(value = "用户头像地址")
    private String userAvatar;

}
