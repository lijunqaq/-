package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.HealthEdu;
import com.ybs.phl.model.entity.VisitRecord;
import com.ybs.phl.model.inside.query.ResidentVisitRecordQueryVO;
import com.ybs.phl.model.inside.query.VisitRecordCountQueryVO;

import java.util.List;

/**
 * 健康教育活动记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface HealthEduService extends IService<HealthEdu> {

    /**
     * 根据居民id和年度查询健康教育
     * @param residentId        居民id
     * @param
     * @param queryVO
     * @return
     */
    int queryCountByResidentId(Long residentId, VisitRecordCountQueryVO queryVO);
    /**
     * 根据居民id和时间查询健康体检随访个别字段
     * @return
     */
    List<VisitRecord> queryForSource(ResidentVisitRecordQueryVO vo);
}