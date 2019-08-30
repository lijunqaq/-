package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.TuberculosisVisitMore;

/**
 * 肺结核患者随访服务记录表（多次） Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface TuberculosisVisitMoreService extends IService<TuberculosisVisitMore> {
    /**
     * 查询最新的肺结核病患者多次记录
     * @param residentInfoId
     * @return
     */
    TuberculosisVisitMore findLastTuberculosisVisitMore(Long residentInfoId);
}