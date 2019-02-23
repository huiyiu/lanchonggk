package com.lanchong.mobile.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ldp_mobile_attachment_post", catalog = "")
@Data
public class AttachmentPost {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    @ApiModelProperty(value = "回帖编号")
    private Long id;
    @Column
    @ApiModelProperty(value = "帖子编号")
    private Long aid;
    @Column
    @ApiModelProperty(value = "作者")
    private String author;
    @Column
    @ApiModelProperty(value = "作者编号")
    private Long authorId;
    @Column
    @ApiModelProperty(value = "是否第一作者")
    private Boolean first;
    @Column
    @ApiModelProperty(value = "帖子主题，标题")
    private String title;
    @Column
    @ApiModelProperty(value = "内容")
    private String message;
    @Column
    @ApiModelProperty(value = "楼层")
    private Integer position;
    @Column
    @ApiModelProperty(value = "回帖时间")
    private Integer createTime;
    @Transient
    @ApiModelProperty(value = "作者头像地址")
    private String userAvatar;
    @Transient
    @ApiModelProperty(value = "评论点赞数")
    private Long favorCounts;
    @Transient
    @ApiModelProperty(value = "当前看贴用户是否点过赞")
    private Boolean favored;

}
