package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.TuberculosisVisitMoreDAO;
import com.ybs.phl.model.entity.TuberculosisVisitMore;
import com.yizhu.service.TuberculosisVisitMoreService;
import org.springframework.stereotype.Service;

/**
 * 肺结核患者随访服务记录表（多次） Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class TuberculosisVisitMoreServiceImpl extends ServiceImpl<TuberculosisVisitMoreDAO,TuberculosisVisitMore> implements TuberculosisVisitMoreService {
    @Override
    public TuberculosisVisitMore findLastTuberculosisVisitMore(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}