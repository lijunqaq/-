package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.ChildHealth3DAO;
import com.ybs.phl.model.entity.ChildHealth3;
import com.yizhu.service.ChildHealth3Service;
import org.springframework.stereotype.Service;

/**
 * 3 ～ 6 岁儿童健康检查记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class ChildHealth3ServiceImpl extends ServiceImpl<ChildHealth3DAO,ChildHealth3> implements ChildHealth3Service {


    @Override
    public ChildHealth3 findLastChildHealth3(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}