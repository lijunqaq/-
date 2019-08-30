package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.PostnatalHealthCheckDAO;
import com.ybs.phl.model.entity.PostnatalHealthCheck;
import com.yizhu.service.PostnatalHealthCheckService;
import org.springframework.stereotype.Service;

/**
 * 产后 42 天健康检查记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class PostnatalHealthCheckServiceImpl extends ServiceImpl<PostnatalHealthCheckDAO,PostnatalHealthCheck> implements PostnatalHealthCheckService {

    @Override
    public PostnatalHealthCheck findLastPostnatalHealthCheck(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }
}