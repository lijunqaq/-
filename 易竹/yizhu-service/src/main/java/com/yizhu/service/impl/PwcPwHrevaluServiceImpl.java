package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.PwcPwHrevaluDAO;
import com.ybs.phl.model.entity.PwcPwHrevalu;
import com.yizhu.service.PwcPwHrevaluService;
import org.springframework.stereotype.Service;

/**
 * 高危孕产妇评估结果表（对于一份孕妇档案每个时间段可能有多次） Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class PwcPwHrevaluServiceImpl extends ServiceImpl<PwcPwHrevaluDAO,PwcPwHrevalu> implements PwcPwHrevaluService {

}