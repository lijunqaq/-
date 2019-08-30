package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.AntenatalManyServiceDAO;
import com.ybs.phl.model.entity.AntenatalManyService;
import com.yizhu.service.AntenatalManyServiceService;
import org.springframework.stereotype.Service;

/**
 * 第 2～5 次产前随访服务记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class AntenatalManyServiceServiceImpl extends ServiceImpl<AntenatalManyServiceDAO,AntenatalManyService> implements AntenatalManyServiceService {
    @Override
    public AntenatalManyService findLastAntenatalManyService(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}