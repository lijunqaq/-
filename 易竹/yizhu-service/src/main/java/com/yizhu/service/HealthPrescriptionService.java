package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.HealthPrescription;
import com.ybs.phl.model.entity.VisitRecord;
import com.ybs.phl.model.inside.query.ResidentVisitRecordQueryVO;
import com.ybs.phl.model.inside.query.VisitRecordCountQueryVO;

import java.util.List;

/**
 * 3 ～ 6 岁儿童健康检查记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface HealthPrescriptionService extends IService<HealthPrescription> {

    /**
     * 根据居民id、人群类型、年度查询随访次数
     * @param residentId        居民id
     * @param visitType         类型
     * @param
     * @param queryVO
     * @return
     */
    int queryCountByResidentId(Long residentId, Integer visitType, VisitRecordCountQueryVO queryVO);

    /**
     * 根据居民id、人群类型、年度查询随访次数
     * @return
     */
    List<VisitRecord> queryForSource(ResidentVisitRecordQueryVO vo);

    int add(HealthPrescription healthPrescription);
}