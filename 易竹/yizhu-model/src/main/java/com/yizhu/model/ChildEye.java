package com.yizhu.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 儿童龄视力检查表
 */
@Data
//@TableName("ybs_child_eye")
public class ChildEye {

    /** 主键自动增长*/
    private Long id;
    /** 采集方式*/
    private Integer collectMode;
    /** 居民基本信息表ID*/
    private Long residentInfoId;
    /** 执行人ID, 家签系统医生UUID*/
    private String executorId;
    /** 最后修改人ID*/
    private String lastExecutorId;
    /** 录入医生id*/
    private String inputDoctorId;
    /** 录入时间*/
    private Date inputDate;
    /** 随访日期*/
    private Date visitDate;
    /** 随访单位id*/
    private String visitUnitId;
    /** 岁龄*/
    private Integer childAge;
    /** 年龄单位 1：天 2：月 3：岁*/
    private Integer unitAge;
    /** 学校id*/
    private Long schoolId;
    /** 年级*/
    private Long grade;
    /** 班级*/
    private String className;
    /** 眼睑（1：未见异常  2：异常）*/
    private Integer eyelid;
    /** 眼睑异常信息*/
    private String eyelidValue;
    /** 结膜（1：未见异常  2：异常）*/
    private Integer conjunctiva;
    /** 结膜异常信息*/
    private String conjunctivaValue;
    /** 角膜（1：未见异常  2：异常）*/
    private Integer cornea;
    /** 角膜异常值*/
    private String corneaValue;
    /** 瞳孔（1：未见异常  2：异常）*/
    private Integer pupil;
    /** 瞳孔异常值*/
    private String pupilValue;
    /** 临床处理并随访(1:无 2：有)*/
    private Integer visit;
    /** 临床处理并随访值*/
    private String visitValue;
    /** 转诊建议：1：无，2：有*/
    private Integer referral;
    /** 转诊的原因*/
    private String referralOther;
    /** 转诊科室*/
    private String referralDepartment;
    /** 诊断结果：1：无，2：有*/
    private Integer diagnostic;
    /** 诊断结果值*/
    private String diagnosticResult;
    /** 随访地点*/
    private String visitPlace;
    /** 随访现场照片*/
    private String visitScenePhoto;
    /** 测量视力表(1图形视力表（2.5-3.5岁）2标准对数视力表（3.5周岁以上） 3国际标准对数表)*/
    private Integer measureVision;
    /** 标准右眼视力*/
    private BigDecimal standardEyeRight;
    /** 标准左眼视力*/
    private BigDecimal standardEyeLeft;
    /** 国际标准右眼视力*/
    private BigDecimal internationalStandardEyeRight;
    /** 国际标准左眼视力*/
    private BigDecimal internationalStandardEyeLeft;
    /** 1:未见异常 ；2：裸眼视力≤4.9(标准对数视力表)/0.8(国际标准视力表)；3：两眼视力相差两行及以上；*/
    private String eyeTestResult;
    /** 来源 0 公卫app，1 家签系统 2 公卫pc 3 母婴 6 航创 7 玉溪 8 红河 9 建川*/
    private Integer source;
    /** 是否有效(0：无效   1：有效)*/
    private Integer valid;
    /** 创建时间*/
    private Date createtime;
    /** 最后更新时间*/
    private Date updatetime;

}