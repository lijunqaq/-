package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.ReferralBackDAO;
import com.ybs.phl.model.entity.ReferralBack;
import com.yizhu.service.ReferralBackService;
import org.springframework.stereotype.Service;

/**
 * 双向转诊信息表（回转） Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class ReferralBackServiceImpl extends ServiceImpl<ReferralBackDAO,ReferralBack> implements ReferralBackService {

}