package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.MentalDiseaseVisit;

/**
 * 严重精神障碍患者随访服务记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface MentalDiseaseVisitService extends IService<MentalDiseaseVisit> {
    /**
     * 查询最新的重性精神病患者记录
     * @param residentInfoId
     * @return
     */
    MentalDiseaseVisit findLastMetalDiseaseVisit(Long residentInfoId);
}