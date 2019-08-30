package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.HypertensivePatientsNewComplicationDAO;
import com.ybs.phl.model.entity.HypertensivePatientsChildNew;
import com.ybs.phl.model.entity.HypertensivePatientsNewComplication;
import com.yizhu.service.HypertensivePatientsNewComplicationService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 新版高血压复诊时新发合并症 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HypertensivePatientsNewComplicationServiceImpl extends ServiceImpl<HypertensivePatientsNewComplicationDAO,HypertensivePatientsNewComplication> implements HypertensivePatientsNewComplicationService {

    @Override
    public List<HypertensivePatientsNewComplication> findhypertensivePatientsChildInfoInfoByMainId(HypertensivePatientsChildNew child) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("main_id", child.getMainid());
        criteria.eq("valid", child.getValid());
        return list(criteria);
    }
}