package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.ChildEye;
import com.ybs.phl.model.entity.VisitRecord;
import com.ybs.phl.model.inside.query.ResidentLastVisitDateQueryVO;
import com.ybs.phl.model.inside.query.ResidentVisitRecordQueryVO;
import com.ybs.phl.model.inside.query.VisitRecordCountQueryVO;

import java.util.List;

/**
 * 儿童4-6岁龄视力检查表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface ChildEyeService extends IService<ChildEye> {

    /**
     *  根据居民id和年份查询最新服务时间
     * @param vo
     * @return
     */
    VisitRecord findLastAntenatalCareOneByResidentIdAndYear(ResidentLastVisitDateQueryVO vo);

    /**
     * 根据居民id、人群类型、年度查询随访次数
     * @param residentId        居民id
     * @param visitType         随访人群
     * @param year              年度
     * @param queryVO
     * @return
     */
    Integer queryCountByResidentId(Long residentId, Integer visitType, VisitRecordCountQueryVO queryVO);

    /**
     * 根据居民id和时间查询健康体检随访个别字段
     * @return
     */
    List<VisitRecord> queryForSource(ResidentVisitRecordQueryVO vo);
}