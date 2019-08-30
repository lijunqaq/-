package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.ChinesMedicineChildDAO;
import com.ybs.phl.model.entity.ChinesMedicineChild;
import com.yizhu.service.ChinesMedicineChildService;
import org.springframework.stereotype.Service;

/**
 * 6 ～ 36 月龄儿童中医药健康管理服务记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class ChinesMedicineChildServiceImpl extends ServiceImpl<ChinesMedicineChildDAO,ChinesMedicineChild> implements ChinesMedicineChildService {

    @Override
    public ChinesMedicineChild findLastChinesMedicineChild(Long residentInfoId) {

        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}