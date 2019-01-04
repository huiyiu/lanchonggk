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
    @ApiModelProperty(value = "作者")
    private Integer authorId;

    @Column
    @ApiModelProperty(value = "关注者")
    private Integer userId;
    @Column
    @ApiModelProperty(value = "附件编号")
    private Integer aid;
    @Column
    @ApiModelProperty(value = "附件类型，doc指文档，video是视频,unknown未知")
    private String aidType;
    @Column
    @ApiModelProperty(value = "创建时间")
    private Integer createTime;

}
