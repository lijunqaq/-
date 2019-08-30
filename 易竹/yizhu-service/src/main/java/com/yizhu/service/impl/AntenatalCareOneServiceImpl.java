package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.base.enums.VisitFromEnum;
import com.ybs.phl.dao.AntenatalCareOneDAO;
import com.ybs.phl.model.entity.AntenatalCareOne;
import com.ybs.phl.model.inside.query.ResidentLastVisitDateQueryVO;
import com.yizhu.service.AntenatalCareOneService;
import org.springframework.stereotype.Service;

/**
 * 第 1  次产前检查服务记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class AntenatalCareOneServiceImpl extends ServiceImpl<AntenatalCareOneDAO,AntenatalCareOne> implements AntenatalCareOneService {
    @Override
    public AntenatalCareOne findLastAntenatalCareOne(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }

    @Override
    public AntenatalCareOne findLastAntenatalCareOneByResidentIdAndYear(ResidentLastVisitDateQueryVO vo) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", vo.getResidentId());
        criteria.eq("YEAR (visit_date)", vo.getYear());
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.eq("source", VisitFromEnum.PMI.getType());
        criteria.eq("state", 1);
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}