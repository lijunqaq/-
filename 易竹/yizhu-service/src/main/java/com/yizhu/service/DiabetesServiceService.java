package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.DiabetesService;

/**
 * 2 型糖尿病患者随访服务记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface DiabetesServiceService extends IService<DiabetesService> {
    /**
     * 查询最新的2型糖尿病患者记录
     * @param residentInfoId
     * @return
     */
    DiabetesService findLastDiabetesService(Long residentInfoId);
}