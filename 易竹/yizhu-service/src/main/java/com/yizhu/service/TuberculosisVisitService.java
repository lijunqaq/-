package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.TuberculosisVisit;

/**
 * 肺结核患者第一次入户随访记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface TuberculosisVisitService extends IService<TuberculosisVisit> {
    /**
     * 查询最新的肺结核第一次随访记录
     * @param residentInfoId
     * @return
     */
    TuberculosisVisit findLastTuberculosisVisit(Long residentInfoId);
}