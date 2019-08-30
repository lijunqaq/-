package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.ElderlyHealthDAO;
import com.ybs.phl.model.entity.ElderlyHealth;
import com.yizhu.service.ElderlyHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 老年人中医 药健康管理服务记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class ElderlyHealthServiceImpl extends ServiceImpl<ElderlyHealthDAO,ElderlyHealth> implements ElderlyHealthService {

    @Autowired
    private ElderlyHealthDAO elderlyHealthDAO;
    @Override
    public ElderlyHealth findLastChineseHealth(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("time_filling");

        return getOne(criteria);
    }
}