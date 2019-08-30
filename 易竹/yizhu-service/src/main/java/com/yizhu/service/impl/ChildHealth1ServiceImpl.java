package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.ChildHealth1DAO;
import com.ybs.phl.model.entity.ChildHealth1;
import com.yizhu.service.ChildHealth1Service;
import org.springframework.stereotype.Service;

/**
 * 8个月龄儿童健康检查表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class ChildHealth1ServiceImpl extends ServiceImpl<ChildHealth1DAO,ChildHealth1> implements ChildHealth1Service {

    @Override
    public ChildHealth1 findLastChildHealth1(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}