package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.inside.dto.VisitServiceConuntDTO;
import com.ybs.phl.model.entity.VisitRecord;
import com.ybs.phl.model.inside.query.ResidentLastVisitDateQueryVO;
import com.ybs.phl.model.inside.query.ResidentVisitRecordQueryVO;
import com.ybs.phl.model.inside.query.VisitRecordCountQueryVO;

import java.util.Date;
import java.util.List;

/**
 * 居民随访总表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface VisitRecordService extends IService<VisitRecord> {

    /**
     * 查询同一天得随访记录
     * @param residentInfoId    居民id
     * @param visitDate         随访日期
     * @param groupType         人群分类
     * @return true 表示有重复记录 false 没有重复记录
     */
    List<VisitRecord> queryVisitRecordList(Long residentInfoId, Date visitDate, Integer groupType);

    /**
     * 根据居民id、人群类型、年度查询随访次数
     * @param residentId        居民id
     * @param groupType         随访人群
     * @param
     * @param queryVO
     * @return
     */
    int queryCountByResidentId(Long residentId, Integer groupType, VisitRecordCountQueryVO queryVO);
    /**
     * 根据年份和居民id集合统计居民服务次数
     * @param idList    居民id集合
     * @param year         年份
     *
     * @return true
     */
    List<VisitServiceConuntDTO> queryPlanVisitInfoByResidentIdsAndYear(List<Long> idList, Integer year);

    /**
     * 查询居民年度随访记录
     * @param residentInfoIds 居民id集合
     * @param year 年度
     * @return
     */
    List<VisitRecord> queryStandingBookCount(Integer year, List<Long> residentInfoIds);

    /**
     *查询居民随访记录
     * @param
     * @param type 人群类型
     * @param
     * @param vo
     * @return
     */
    List<VisitRecord> queryByGroupAndSource( ResidentVisitRecordQueryVO vo, Integer type);


    List<VisitRecord> queryForSource(ResidentVisitRecordQueryVO vo);

    /**
     * 根据年份和居民id和人群查询居民服务当年度最新随访时间
     * @param vo    居民id集合
     * @param groupNames   人群
     *
     * @return true
     */
    List<VisitRecord> findLastVisitDateByResidentIdAndYear(ResidentLastVisitDateQueryVO vo, List<Integer> groupNames);

    /**
     * 根据年份和居民id和服务类型查询居民服务当年度最新随访时间
     * @param vo    居民id集合
     * @param antenatalType   type
     *
     *
     * @return true
     */
    VisitRecord findLastVisitDateByResidentIdAndYearAndType(ResidentLastVisitDateQueryVO vo, List<Integer> antenatalType, Integer grouptype);
}