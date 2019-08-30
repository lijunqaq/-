package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.NeonatalHomeVisitDAO;
import com.ybs.phl.model.entity.NeonatalHomeVisit;
import com.yizhu.service.NeonatalHomeVisitService;
import org.springframework.stereotype.Service;

/**
 * 新生儿家庭访视表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class NeonatalHomeVisitServiceImpl extends ServiceImpl<NeonatalHomeVisitDAO,NeonatalHomeVisit> implements NeonatalHomeVisitService {

    @Override
    public NeonatalHomeVisit findLastNeonatalHomeVisit(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}