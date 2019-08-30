package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.HypertensivePatientsChildNewDAO;
import com.ybs.phl.model.entity.HypertensivePatientsChildNew;
import com.yizhu.service.HypertensivePatientsChildNewService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 高血压患者随访服务---用药情况子表new Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HypertensivePatientsChildNewServiceImpl extends ServiceImpl<HypertensivePatientsChildNewDAO,HypertensivePatientsChildNew> implements HypertensivePatientsChildNewService {

    @Override
    public List<HypertensivePatientsChildNew> findhypertensivePatientsChildInfoInfoByMainId(HypertensivePatientsChildNew child) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("main_id", child.getMainid());
        criteria.eq("valid", child.getValid());
        return list(criteria);
    }
}