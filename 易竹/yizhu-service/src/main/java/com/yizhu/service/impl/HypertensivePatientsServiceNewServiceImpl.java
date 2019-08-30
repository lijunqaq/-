package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.HypertensivePatientsServiceNewDAO;
import com.ybs.phl.model.biz.save.HypertensivePatientsServiceSaveVO;
import com.ybs.phl.model.entity.HypertensivePatientsService;
import com.ybs.phl.model.entity.HypertensivePatientsServiceNew;
import com.yizhu.service.HypertensivePatientsServiceNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 高血压患者随访服务记录表new Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HypertensivePatientsServiceNewServiceImpl extends ServiceImpl<HypertensivePatientsServiceNewDAO,HypertensivePatientsServiceNew> implements HypertensivePatientsServiceNewService {

    @Autowired
    private HypertensivePatientsServiceNewDAO hypertensivePatientsServiceNewDAO;

    @Override
    public List<HypertensivePatientsServiceNew> queryByIds(List<Long> ids){

        return hypertensivePatientsServiceNewDAO.queryByIds(ids);
    }
    @Override
    public HypertensivePatientsServiceNew findLastHypertensicePatientsServiceNew(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return getOne(criteria);
    }

    @Override
    public HypertensivePatientsServiceNew findhypertensivePatientsInfoById(HypertensivePatientsServiceSaveVO vo) {
        return getById(vo.getId());
    }
}