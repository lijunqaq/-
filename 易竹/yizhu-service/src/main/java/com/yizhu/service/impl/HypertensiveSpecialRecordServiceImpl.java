package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.HypertensiveSpecialRecordDAO;
import com.ybs.phl.model.entity.HypertensivePatientsServiceNew;
import com.ybs.phl.model.entity.HypertensiveSpecialRecord;
import com.yizhu.service.HypertensiveSpecialRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 高血压特殊记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HypertensiveSpecialRecordServiceImpl extends ServiceImpl<HypertensiveSpecialRecordDAO,HypertensiveSpecialRecord> implements HypertensiveSpecialRecordService {

    @Override
    public List<HypertensiveSpecialRecord> queryByResidentInfoId(Long residentInfoId){

        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);

        return list(criteria);
    }

}