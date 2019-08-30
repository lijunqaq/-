package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.HypertensivePatientsChildNew;
import com.ybs.phl.model.entity.HypertensivePatientsNewComplication;

import java.util.List;

/**
 * 新版高血压复诊时新发合并症 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface HypertensivePatientsNewComplicationService extends IService<HypertensivePatientsNewComplication> {

    /**
     *   查询新发并发症
     * @param child
     * @return
     */
    List<HypertensivePatientsNewComplication> findhypertensivePatientsChildInfoInfoByMainId(HypertensivePatientsChildNew child);
}