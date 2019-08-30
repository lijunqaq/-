package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.ChildHealth2DAO;
import com.ybs.phl.model.entity.ChildHealth2;
import com.yizhu.service.ChildHealth2Service;
import org.springframework.stereotype.Service;

/**
 * 12 ～ 30 月龄儿童健康检查记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class ChildHealth2ServiceImpl extends ServiceImpl<ChildHealth2DAO,ChildHealth2> implements ChildHealth2Service {
    @Override
    public ChildHealth2 findLastChildHealth2(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}