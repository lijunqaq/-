package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.HypertensivePatientsServiceNew;
import com.ybs.phl.model.entity.HypertensiveSpecialRecord;

import java.util.List;

/**
 * 高血压特殊记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface HypertensiveSpecialRecordService extends IService<HypertensiveSpecialRecord> {

    /**
     * 查询居民失访，死亡，转诊记录
     * @param residentInfoId 居民id
     * @return
     */
    List<HypertensiveSpecialRecord> queryByResidentInfoId(Long residentInfoId);

}