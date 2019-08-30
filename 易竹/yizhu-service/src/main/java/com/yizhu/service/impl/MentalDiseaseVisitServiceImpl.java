package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.MentalDiseaseVisitDAO;
import com.ybs.phl.model.entity.MentalDiseaseVisit;
import com.yizhu.service.MentalDiseaseVisitService;
import org.springframework.stereotype.Service;

/**
 * 严重精神障碍患者随访服务记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class MentalDiseaseVisitServiceImpl extends ServiceImpl<MentalDiseaseVisitDAO,MentalDiseaseVisit> implements MentalDiseaseVisitService {
    @Override
    public MentalDiseaseVisit findLastMetalDiseaseVisit(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}