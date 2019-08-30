package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.NeonatalHomeVisit;

/**
 * 新生儿家庭访视表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface NeonatalHomeVisitService extends IService<NeonatalHomeVisit> {

    /**
     * 新生儿家庭访式
     * @param residentInfoId
     * @return
     */
    NeonatalHomeVisit findLastNeonatalHomeVisit(Long residentInfoId);
}