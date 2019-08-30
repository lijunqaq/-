package com.yizhu.model.entity;

import java.util.Date;
import java.math.BigDecimal;

import lombok.*;

/**
* 第 1  次产前检查服务记录表
*
* @author hy
* @date 2019-06-18
*/
@Data
//@TableName("ybs_antenatal_care_one")
public class AntenatalCareOne {

    /** 唯一ID */
    private Long id;

    /** 居民档案ID */
    private Long residentInfoId;

    /** 采集方式 */
    private Integer collectMode;

    /** 孕周 */
    private Integer gestationalWeek;

    /** 孕周加天数 */
    private Integer gestationalWeekPlusDays;

    /** 孕妇年龄 */
    private Integer age;

    /** 是否有丈夫， 1-没有；2-有 */
    private Integer hasHusband;

    /** 丈夫姓名 */
    private String husbandName;

    /** 丈夫年龄 */
    private Integer husbandAge;

    /** 丈夫电话 */
    private String husbandTel;

    /** 怀孕次数 */
    private Integer pregnancyNum;

    /** 阴道分娩次数 */
    private Integer vaginalDeliveryNum;

    /** 剖宫产次数 */
    private Integer caesareanSectionNum;

    /** 末次月经：1：不详，2：日期 */
    private Integer lastMenstrual;

    /** 末次月经日期 */
    private Date lastMenstrualPeriod;

    /** 预产期 */
    private Date expectedChildbirth;

    /** 分娩日期 */
    private Date childbirthDate;

    /** 既往史类型为疾病时的疾病名称，见枚举表下ybs_antenatal_care_one的diseasename */
    private String diseasename;

    /** 既往史-其他 */
    private String diseasenameOther;

    /** 家庭史的疾病ID，见枚举表，family_disease记录 */
    private String familyDisease;

    /** 家族史其他 */
    private String familyDiseaseOther;

    /** 个人史，见枚举表ybs_antenatal_care_one下的personal_history */
    private String personalHistory;

    /** 个人史-其他 */
    private String personalHistoryOther;

    /** 妇产科手术史,1：无，2有 */
    private Integer operationHistory;

    /** 妇产科手术史输入 */
    private String operationHistoryValue;

    /** 自然流产次数，有则填，无则0 */
    private Integer motherhoodFlow;

    /** 人工流产次数,有则填，无则0 */
    private Integer motherhoodArtificialAbortion;

    /** 死胎次数,有则填，无则0 */
    private Integer motherhoodDie;

    /** 死产次数,有则填，无则0 */
    private Integer motherhoodStillbirth;

    /** 新生儿死亡,有则填，无则0 */
    private Integer motherhoodNeonatalDeath;

    /** 新生儿缺陷,有则填，无则0 */
    private Integer motherhoodDefects;

    /** 身高 */
    private BigDecimal height;

    /** 体重 */
    private BigDecimal weight;

    /** 体质指数（BMI） */
    private BigDecimal bmi;

    /** 血压(高压#低压) */
    private String bloodPressure;

    /** 听诊心脏：1：未见异常，2异常#异常情况 */
    private Integer heart;

    /** 心脏异常详情 */
    private String heartError;

    /** 肺部检查，1：未见异常，2，异常#异常情况 */
    private String lungs;

    /** 肺部检查异常详情 */
    private String lungsError;

    /** 妇科检查--外阴  1：未见异常，2：异常#异常情况 */
    private String vulva;

    /** 外阴异常详情 */
    private String vulvaError;

    /** 妇科检查--阴道  1：未见异常，2：异常#异常情况 */
    private String vagina;

    /** 阴道异常详情 */
    private String vaginaError;

    /** 妇科检查--宫颈  1：未见异常，2：异常#异常情况 */
    private String cervical;

    /** 宫颈异常详情 */
    private String cervicalError;

    /** 妇科检查--子宫  1：未见异常，2：异常#异常情况 */
    private String uterus;

    /** 子宫异常详情 */
    private String uterusError;

    /** 妇科检查--附件  1：未见异常，2：异常#异常情况 */
    private String enclosure;

    /** 附件异常详情 */
    private String enclosureError;

    /** 辅助检查--血常规--检查状态  1-未检查； 2-已检查 */
    private Integer bloodCheck;

    /** 辅助检查--血常规--血红蛋白值 */
    private BigDecimal hemoglobinValue;

    /** 辅助检查--血常规--白细胞计数值 */
    private BigDecimal wbcCount;

    /** 辅助检查--血常规--血小板计数值 */
    private BigDecimal plateletCount;

    /** 血常规-其他 */
    private String bloodNormalOther;

    /** 辅助检查--尿常规--检查状态  1-未检查； 2-已检查 */
    private Integer urineCheck;

    /** 辅助检查--尿常规--尿蛋白 */
    private String urineProtein;

    /** 辅助检查--尿常规--尿糖 */
    private String urineNiaotang;

    /** 辅助检查--尿常规--尿酮体 */
    private String urineKetone;

    /** 辅助检查--尿常规--尿潜血 */
    private String urineOccultBlood;

    /** 辅助检查--尿常规--其他 */
    private String urineOther;

    /** 辅助检查--血型--检查状态 */
    private Integer bloodTypeCheck;

    /** 血型，见枚举表，public下blood_type记录 */
    private Integer bloodType;

    /** RH阴性血型 */
    private Integer rhRegative;

    /** 辅助检查--血糖值--检查状态  1-未检查； 2-已检查 */
    private Integer bloodSugarCheck;

    /** 血糖值 */
    private BigDecimal bloodSugar;

    /** 辅助检查--肝功能--检查状态  1-未检查； 2-已检查 */
    private Integer liverCheck;

    /** 血清谷丙转氨酶(Serum glutamic pyruvic transaminase) */
    private BigDecimal liverSgpt;

    /** 血清谷草转氨酶(Serum aspartate aminotransferase) */
    private BigDecimal liverSaa;

    /** 肝功能--白蛋白 */
    private BigDecimal liverAlbumin;

    /** 肝功能--总胆红素 */
    private BigDecimal liverBilirubin;

    /** 肝功能--结合胆红素 */
    private BigDecimal liverConjugatedBilirubin;

    /** 肾功能检查， 1-未检查； 2-已检查 */
    private Integer kidneyCheck;

    /** 辅助检查--肾功能--血清肌酐（ScR） */
    private BigDecimal kidneyScr;

    /** 辅助检查--肾功能—血尿素 */
    private BigDecimal kidneyBloodUrea;

    /** 阴道分泌物 */
    private String vaginaSecreta;

    /** 阴道分泌物-其他 */
    private String vaginaSecretaOther;

    /** 辅助检查--阴道分泌物--检查状态  1-未检查； 2-已检查 */
    private Integer vaginaSecretaCheck;

    /** 阴道--阴道清洁度，见枚举表：public下vagina_clear */
    private Integer vaginaClear;

    /** 乙肝五项检查, 1-未检查；2-已检查 */
    private Integer hepatitisCheck;

    /** 乙肝--乙型肝炎表面抗原 */
    private String hepatitisBSurfaceAntigen;

    /** 乙肝--乙型肝炎表面抗体 */
    private String hepatitisBSurfaceAntibody;

    /** 乙肝--乙型肝炎 e 抗原 */
    private String hepatitisBEAntigen;

    /** 乙肝--乙型肝炎 e 抗体 */
    private String hepatitisBEAntibody;

    /** 乙肝--乙型肝炎核心抗体 */
    private String hepatitisBCoreAntibody;

    /** 梅毒血清学试验检查  1-未检查； 2-已检查 */
    private Integer syphilisCheck;

    /** 梅毒血清学试验 1：阴性，2：阳性 */
    private Integer syphilis;

    /** HIV 抗体检测，1-未检测； 2-已检测 */
    private Integer hivCheck;

    /** HIV结果， 1-阴性；2-阳性 */
    private Integer hiv;

    /** B超检查， 1-未检查； 2-已检查 */
    private Integer bUltrasonographyCheck;

    /** B超检查结果 */
    private String bUltrasonography;

    /** 其他检查内容 */
    private String other;

    /** 总体评估，1：未见异常，2异常#异常情况 */
    private String assessment;

    /** 总体评估异常详情 */
    private String assessmentError;

    /** 健康指导，见枚举表，PUBLIC下health_guidance */
    private String healthGuidance;

    /** 健康指导-其他 */
    private String healthGuidanceOther;

    /** 转诊：1无，2有 */
    private Integer referral;

    /** 转诊原因 */
    private String referralReason;

    /** 转诊科室 */
    private String referralDepartment;

    /** 孕产妇档案状态 1、正常 2、正常结案  3、流产结案 4、死胎结案 5、终止妊娠 6、死亡(2-6都是结案) (母婴) */
    private Integer state;

    /** 责任医生ID */
    private String respDoctorId;

    /** 执行首次产前检查的医生id */
    private String executorId;

    /** 随访单位id */
    private String visitUnitId;

    /** 执行人客户端IP, 长整型格式 */
    private Long executorIp;

    /** 首次产前检查填表人id */
    private String createUserId;

    /** 首次产前检查医生所在单位id */
    private String createUnitId;

    /** 修改首次产前检查的医生id */
    private String lastExecutorId;

    /** 录入医生id */
    private String inputDoctorId;

    /** 修改首次产前检查医生所在单位id */
    private String lastExecutorUnitId;

    /** 填写首次产前检查的时间 */
    private Date createtime;

    /** 修改首次产前检查的时间 */
    private Date updatetime;

    /** 随访地点 */
    private String visitPlace;

    /** 随访现场照片 */
    private String visitScenePhoto;

    /** 访视日期 */
    private Date visitDate;

    /** 下次随访日期 */
    private Date nextDate;

    /** 执行医生签名 */
    private String doctorSign;

    /** 居民签名 */
    private String peopleSign;

    /** 有效状态，1：有效，0：作废 */
    private Integer valid;

    /** 来源 0 公卫系统，1 家签系统 6 航创 7 玉溪 8 红河 9 建川 */
    private Integer source;

    /** 国籍 1、中国  2、其他(母婴) */
    private Integer nationality;

    /** 国籍选其他时输入内容 25汉字(母婴) */
    private String nationalityOther;

    /** 户籍类型 1、农籍 2、非农籍(母婴) */
    private Integer householdRegister;

    /** 居住地区1、坝区 2、半山区 3、山区、4、其他地区(母婴) */
    private Integer livearea;

    /** 居住地区选择其他地区时输入内容  255汉字(母婴) */
    private String liveareaOther;

    /** 居住地到最近的乡级以上卫生机构公里数0-999.99(母婴) */
    private BigDecimal liveareaTownshipDistance;

    /** 产后修养地code(最低级区域code)(母婴) */
    private String postpartumNursingPlace;

    /** 产后修养地详细地址(门牌号)(母婴) */
    private String postpartumNursingPlaceDetail;

    /** 产后修养地code所属级别(母婴) */
    private Integer postpartumNursingPlaceLevel;

    /** 丈夫文化程度(母婴) */
    private Integer husbandEducation;

    /** 丈夫职业(母婴) */
    private Integer husbandOccupation;

    /** 丈夫职业选其他时输入内容(母婴) */
    private String husbandOccupationOther;

    /** 丈夫工作单位(母婴) */
    private String husbandWorkUnit;

    /** 孕产妇建册机构id(母婴) */
    private String createUnitIdPr;

    /** 孕产妇建册人id(母婴) */
    private String createUserIdPr;

    /** 档案更新医生所在单位id(母婴) */
    private String updateUnitIdPr;

    /** 档案修改医生id(母婴) */
    private String updateUserIdPr;

    /** 档案责任医生id(母婴) */
    private String fileResponUserId;

    /** 档案责任医生所在单位id(母婴) */
    private String fileResponUnitId;

    /** 孕产妇建册时间(母婴) */
    private Date createtimePr;

    /** 孕产妇建册修改时间(母婴) */
    private Date updatetimePr;

    /** 孕产妇档案状态 1、正常 2、正常结案  3、流产结案 4、死胎结案 5、终止妊娠 6、死亡(2-6都是结案) (母婴)(废弃) */
    private Integer statusPr;

    /** 迁出状态 1 正常(要将档案责任医生id和档案责任医生所在单位id置空) 2 迁出   */
    private Integer transferStatusPr;

    /** 现病史(母婴) */
    private String presentIllness;

    /** 初潮年龄(母婴) */
    private Integer menophaniaAge;

    /** 月经持续天数(母婴) */
    private Integer menstrualCycle1;

    /** 月经间隔天数(母婴) */
    private Integer menstrualCycle2;

    /** 总产次(母婴) */
    private Integer parity;

    /** 胎头吸引产次(母婴) */
    private Integer fetalHeadNum;

    /**  产钳产次(母婴) */
    private Integer obstetricForcepsNum;

    /** 臀位产次(母婴) */
    private Integer breechNum;

    /** 流产总次数(母婴) */
    private Integer abortion;

    /** 末次流产时间 年月日(母婴) */
    private Date lastAbortionTime;

    /** 末次流产方式 */
    private Integer lastAbortionWay;

    /** 输血史 1无 2有(母婴) */
    private Integer bloodHistory;

    /** 输血史选择有时输入的值(母婴) */
    private String bloodHistoryOther;

    /** 药物过敏史 多选逗号分隔(母婴) */
    private String allergyHistory;

    /** 药物过敏史其他(母婴) */
    private String allergyHistoryOther;

    /** 避孕史 逗号分隔(母婴) */
    private String contraceptionHistory;

    /** 避孕史选择了其他时输入的内容(母婴) */
    private String contraceptionHistoryOther;

    /** 新生儿死亡如果选择了有，这个字段指死亡时间(母婴) */
    private Date neonatalDeathTime;

    /** 新生儿死亡如果选择了有，这个字段指死亡的原因(母婴) */
    private String neonatalDeathReason;

    /** 早产次数(母婴) */
    private Integer prematureDeliveryNum;

    /** 现存活男孩个数(母婴) */
    private Integer survivalSon;

    /** 现存活女孩个数(母婴) */
    private Integer survivalDaughter;

    /** 既往妊娠合并症及并发症名称(母婴) */
    private String ppcomplications;

    /** 体检记录--营养(母婴) */
    private Integer perNutrition;

    /** 体检记录--营养选择其他时输入的内容(母婴) */
    private String perNutritionOther;

    /** 体检记录--浮肿  1 无 2有(母婴) */
    private Integer perGeneraledema;

    /** 体检记录--四肢、脊柱、膝反射 1 正常 2其他(母婴) */
    private Integer perSpinalknee;

    /** 体检记录--四肢、脊柱、膝反射选择其他时输入的内容(母婴) */
    private String perSpinalkneeOther;

    /** 体检记录--甲状腺 1、未见异常  2 其他(母婴) */
    private Integer perThyroid;

    /** 体检记录--甲状腺选择其他时输入的内容(母婴) */
    private String perThyroidOther;

    /** 体检记录--心率 次数(母婴) */
    private Integer perHeartrate;

    /** 体检记录--心率是否异常  1 未见异常 2 异常(母婴)(废) */
    private Integer perHeartrateStatus;

    /** 体检记录--心率是否异常选择异常是输入的内容(母婴)(废) */
    private String perHeartrateOther;

    /** 体检记录--呼吸 次数(母婴) */
    private Integer perBreath;

    /** 体检记录--呼吸是否异常  1、未见异常  2异常(母婴) */
    private Integer perBreathStatus;

    /** 体检记录--呼吸是否异常选择异常是输入的内容(母婴) */
    private String perBreathOther;

    /** 体检记录--肝脏 1、未触及 2、异常(母婴) */
    private Integer perHepar;

    /** 体检记录--肝脏选择异常时输入的内容(母婴) */
    private String perHeparOther;

    /** 体检记录--乳房 1、未见异常 2、异常(母婴) */
    private Integer perBreast;

    /** 体检记录--乳房选择异常时输入的内容(母婴) */
    private String perBreastOther;

    /** 体检记录--脾脏 1、未触及 2、异常(母婴) */
    private Integer perSpleen;

    /** 体检记录--脾脏选择异常时输入的内容(母婴) */
    private String perSpleenOther;

    /** 体检记录--其他检查 1、未见异常 2、异常(母婴) */
    private Integer perOthercheck;

    /** 体检记录--其他检查选择异常时输入的内容(母婴) */
    private String perOthercheckOther;

    /** HIV抗体首次检测时间(母婴) */
    private Date hivCheckTime;

    /** 梅毒血清学检测时间(母婴) */
    private Date syphilisCheckTime;

    /** 乙肝病院检测时间 (母婴) */
    private Date surfaceAntigenTime;

    /** 肾功能血钾浓度(母婴) */
    private BigDecimal serumPotConcen;

    /** 肾功能血钠浓度(母婴) */
    private BigDecimal serumSodConcen;

    /** 心电图 1、未检查  2、已检查(母婴) */
    private Integer cardiogram;

    /** 心电图选择已检查时输入的结果(母婴) */
    private String cardiogramOther;

    /** 医疗保障类型(母婴) */
    private String medicalSecurityType;

    /** 本次妊娠异常情况(母婴) */
    private String abnormalPregnancy;

    /** 丈夫健康情况1、良好  2其他 */
    private Integer husbandHelath;

    /** 丈夫健康情况选择其他时输入内容(母婴) */
    private String husbandHelathOther;

    /** abnormal_pregnancy选择其他时输入的内容 */
    private String abnormalPregnancyOther;

    /** 档案结案人id */
    private String filecloseUserId;

    /** 档案结案人所属单位id */
    private String filecloseUnitId;

    /** 档案结案时间 */
    private Date filecloseCreateTime;

    /** 撤销档案结案人id(单位撤销) */
    private String fileuncloseUserId;

    /** 撤销档案结案人所属单位(目前只允许单位撤销) */
    private String fileuncloseUnitId;

    /** 撤销档案结案时间 */
    private Date fileuncloseCreateTime;

    /** 末次分娩时间 */
    private Date lastDeliveryTime;

    /** 乙肝病院学检测结果 1 阴性 2阳性 */
    private Integer hepatitis;

    /** 结案时选择了某种类型的结案后输入的内容 */
    private String filecloseContent;

    /** 丈夫证件类型(家签是bigint，沿用) (母婴) */
    private Long husbandCertificatetype;

    /** 丈夫证件号码(母婴) */
    private String husbandIdcard;

    /** 丈夫民族(家签是int类型 沿用）(母婴) */
    private Integer husbandNational;

    /** 肝功能检查结果1正常  2异常(母婴) */
    private Integer liverResult;

    /** 肾功能检查结果1正常 2异常(母婴) */
    private Integer kidneyResult;
}