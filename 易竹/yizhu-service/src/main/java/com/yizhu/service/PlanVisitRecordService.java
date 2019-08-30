package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.biz.dto.PlanVisitRecordDTO;
import com.ybs.phl.model.entity.PlanVisitRecord;

import java.util.List;

/**
 * 居民随访计划表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface PlanVisitRecordService extends IService<PlanVisitRecord> {
    /**
     * 根据年份和居民id集合统计居民服务次数
     * @param idList    居民id集合
     *
     * @return true
     */
    List<PlanVisitRecordDTO> queryPlanVisitRecordsByResidentId(List<Long> idList);

    /**
     * 删除人群更新随访计划
     * @param residentInfoId
     * @param delGroupTypes
     * @return
     */
    Integer delList(Long residentInfoId, List<String> delGroupTypes);
    /**
     * 查询随访计划
     *
     * @return
     */
    PlanVisitRecord findOne(PlanVisitRecord params);

    /**
     * 批量插入随访计划
     * @param planVisitRecordList
     * @return
     */
    Integer insertList(List<PlanVisitRecord> planVisitRecordList);

    /**
     * 根据条件查询对应的随访计划
     * @param record
     * @return
     */
    PlanVisitRecord findOneByCondition(PlanVisitRecord record);

    /**
     * 根据条件查询对应的随访计划
     * @param query
     * @return
     */
    PlanVisitRecord findResidentInGroupType(PlanVisitRecord query);
    /**
     * 根据模块id更新随访计划
     * @param residentInfoId
     * @param moduleTypes
     * @return
     */
    Integer delPlan(Long residentInfoId, List<Integer> moduleTypes);



    /**
     * 根据条件查询对应的随访计列表
     * @param
     * @return
     */
    List<PlanVisitRecord> findAll(PlanVisitRecord planVisitRecord);

    /**
     * 根据条件删除对应的随访计列表
     * @param
     * @return
     */
    Integer delByCondition(PlanVisitRecord planVisitRecord);

    /**
     * 保存
     * @param planVisitRecord
     * @return
     */
    Integer insert(PlanVisitRecord planVisitRecord);


    /**
     * 更新对应的随访计列表
     * @param
     * @return
     */
    Integer updatePlanVisitDate(PlanVisitRecord planVisitRecord);

    List<PlanVisitRecord> findChildWhichNotMedicine(PlanVisitRecord record);
}