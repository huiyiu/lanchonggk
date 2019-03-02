package com.lanchong.mobile.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ldp_mobile_attachment", catalog = "")
@Data
public class AttachmentInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    @ApiModelProperty(value = "用户编号")
    private Long authorId;
    @Column
    @ApiModelProperty(value = "用户名称")
    private String author;
    @Column
    @ApiModelProperty(value = "帖子标题")
    private String subject;
    @Column
    @ApiModelProperty(value = "附件名")
    private String name;
    @Column
    @ApiModelProperty(value = "存储名")
    private String aName;
    @Column
    @ApiModelProperty(value = "上传时间")
    private Date createTm;
    /*@Column
    @ApiModelProperty(value = "查看次数")
    private Long count;*/
    @ApiModelProperty(value = "标签")
    private String marks;
    @Column
    @ApiModelProperty(value = "类型")
    private String type;
    @Column
    @ApiModelProperty(value = "附件路径")
    private String pathUrl;
    @Column
    @ApiModelProperty(value = "内容")
    private String content;
    @Column
    @ApiModelProperty(value = "描述")
    private String descs;
    @ApiModelProperty(value = "大小(M)")
    private String size;
    @Column
    @ApiModelProperty(value = "时长(*分*秒)")
    private String duration;
    @Column
    @ApiModelProperty(value = "附件类型，0：秒拍，1：文档，2：视频，3：图片")
    private Integer aType;
    @Column
    @ApiModelProperty(value = "查看数")
    private Long views;
    @Column
    @ApiModelProperty(value = "分享数")
    private Long shares;
    @Transient
    @ApiModelProperty(value = "点赞数")
    private Long favors;
    @Transient
    @ApiModelProperty(value = "评论数")
    private Long comments;
    @Transient
    @ApiModelProperty(value = "当前看贴用户是否点过赞")
    private Boolean favored;
}
