package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.SelfCareAbility;

/**
 * 老年人生活处理能力评估表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface SelfCareAbilityService extends IService<SelfCareAbility> {

    /**
     * 查询最近的老年人生活自理能力评记录
     * @param residentInfoId
     * @return
     */
    SelfCareAbility findLastSelfCare(Long residentInfoId);
}