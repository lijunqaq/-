package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.TuberculosisVisitDAO;
import com.ybs.phl.model.entity.TuberculosisVisit;
import com.yizhu.service.TuberculosisVisitService;
import org.springframework.stereotype.Service;

/**
 * 肺结核患者第一次入户随访记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class TuberculosisVisitServiceImpl extends ServiceImpl<TuberculosisVisitDAO,TuberculosisVisit> implements TuberculosisVisitService {

    @Override
    public TuberculosisVisit findLastTuberculosisVisit(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}