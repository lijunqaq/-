package com.yizhu.model.inside.query;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 请求随访次数统计参数vo
 */
@Data
@ApiModel(value="请求随访次数统计参数vo")
public class VisitRecordCountQueryVO {

    /** 居民id */
    @ApiModelProperty(value = "居民id")
    private Long residentId;

    /** 随访类别集合*/
    @ApiModelProperty(value = "随访类别集合")
    private List<Integer> visitTypes;

//    /** 检查年限*/
//    @ApiModelProperty(value = "检查年限")
//    @NotNull(message = "检查年限不能为空")
//    private Integer year;

    /** 签约开始时间 */
    @ApiModelProperty(value = "签约开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startDate;

    /** 签约结束时间 */
    @ApiModelProperty(value = "签约结束时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endDate;

}
