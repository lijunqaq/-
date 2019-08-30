package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.ReferralDAO;
import com.ybs.phl.model.entity.Referral;
import com.yizhu.service.ReferralService;
import org.springframework.stereotype.Service;

/**
 * 双向转诊信息表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class ReferralServiceImpl extends ServiceImpl<ReferralDAO,Referral> implements ReferralService {

}