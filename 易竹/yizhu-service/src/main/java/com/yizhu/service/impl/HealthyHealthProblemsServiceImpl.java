package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.HealthyHealthProblemsDAO;
import com.ybs.phl.model.entity.HealthyHealthProblems;
import com.yizhu.service.HealthyHealthProblemsService;
import org.springframework.stereotype.Service;

/**
 * 健康检查表---主要健康问题子表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HealthyHealthProblemsServiceImpl extends ServiceImpl<HealthyHealthProblemsDAO,HealthyHealthProblems> implements HealthyHealthProblemsService {

}