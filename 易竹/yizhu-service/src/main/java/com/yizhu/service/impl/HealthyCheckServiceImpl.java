package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.HealthyCheckDAO;
import com.ybs.phl.model.entity.HealthyCheck;
import com.yizhu.service.HealthyCheckService;
import org.springframework.stereotype.Service;

/**
 * 居民的健康体检表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HealthyCheckServiceImpl extends ServiceImpl<HealthyCheckDAO,HealthyCheck> implements HealthyCheckService {

}