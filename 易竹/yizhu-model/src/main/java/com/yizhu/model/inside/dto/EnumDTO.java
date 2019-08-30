package com.yizhu.model.inside.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ybs.phl.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 枚举信息表-枚举键DTO
 * 
 * @author hy
 * @date 2019-06-18
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "枚举信息表-枚举键DTO")
public class EnumDTO extends BaseDTO {

    /** 枚举主键id */
    @ApiModelProperty(value = "枚举主键id")
    private Long id;

    /** 枚举名称 */
    @ApiModelProperty(value = "枚举名称", position = 1)
    private String enumname;

    /** 枚举应用的表 */
    @ApiModelProperty(value = "枚举应用的表", position = 2)
    private String tablename;

    /** 该枚举应用的字段 */
    @ApiModelProperty(value = "该枚举应用的字段", position = 3)
    private String fieldsname;

    /** 枚举状态,1：有效，2：作废 */
    @ApiModelProperty(value = "枚举状态,1：有效，2：作废", position = 4)
    private Integer state;

    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 5)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /** 最后更新时间 */
    @ApiModelProperty(value = "最后更新时间", position = 6)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;
}