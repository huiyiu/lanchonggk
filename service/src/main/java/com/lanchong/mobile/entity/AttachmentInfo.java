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
    private String memberId;
    @Column
    @ApiModelProperty(value = "用户名称")
    private String memberNm;
    @Column
    @ApiModelProperty(value = "附件名")
    private String name;
    @Column
    @ApiModelProperty(value = "上传时间")
    private Date createTm;
    @Column
    @ApiModelProperty(value = "查看次数")
    private Long count;
    @ApiModelProperty(value = "标签")
    private String marks;
    @Column
    @ApiModelProperty(value = "类型")
    private String type;
    @Column
    @ApiModelProperty(value = "附件路径")
    private String pathUrl;
    @Column
    @ApiModelProperty(value = "描述")
    private String descs;
    @ApiModelProperty(value = "大小(M)")
    private String size;
    @Column
    @ApiModelProperty(value = "时长(*分*秒)")
    private String duration;
    @Column
    @ApiModelProperty(value = "是否图片")
    private Boolean image;
    @Column
    @ApiModelProperty(value = "是否视频")
    private Boolean video;
    @Column
    @ApiModelProperty(value = "是否文档")
    private Boolean doc;

}
