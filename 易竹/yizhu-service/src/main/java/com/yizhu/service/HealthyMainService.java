package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.inside.dto.VisitServiceConuntDTO;
import com.ybs.phl.model.entity.HealthyMain;
import com.ybs.phl.model.entity.VisitRecord;
import com.ybs.phl.model.inside.query.ResidentLastVisitDateQueryVO;
import com.ybs.phl.model.inside.query.ResidentVisitRecordQueryVO;
import com.ybs.phl.model.inside.query.VisitRecordCountQueryVO;

import java.util.List;

/**
 * 健康体检主表----包含一般状况、健康评价，健康指导、危险控制因素 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface HealthyMainService extends IService<HealthyMain> {
    /**
     * 根据年份和居民id集合统计居民服务次数
     * @param idList    居民id集合
     * @param year         年份
     *
     * @return true
     */
    List<VisitServiceConuntDTO> queryPlanVisitInfoByResidentIdsAndYear(List<Long> idList, Integer year);

    /**
     * 查询居民最新的健康体检
     * @param residentInfoId
     * @return
     */
    HealthyMain findLastHealthyMain(Long residentInfoId);

    /**
     * 根据居民id和时间查询健康体检随访个别字段
     * @return
     */
    List<VisitRecord>  queryForSource(ResidentVisitRecordQueryVO vo);

    /**
     * 根据居民和年度查询数量
     * @param residentId    居民id
     * @param          年度
     * @param queryVO
     * @return
     */
    int queryCountByResidentId(Long residentId, VisitRecordCountQueryVO queryVO);

    /**
     * 根据年份和居民id集合查询居民当年度最近服务时间
     * @param vo    居民信息
     *
     *
     * @return true
     */
    VisitRecord queryLastVisitDateByResidentIdAndYear(ResidentLastVisitDateQueryVO vo);
}