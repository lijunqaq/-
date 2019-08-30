package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.HypertensivePatientsChildNew;

import java.util.List;

/**
 * 高血压患者随访服务---用药情况子表new Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface HypertensivePatientsChildNewService extends IService<HypertensivePatientsChildNew> {

    /**
     * 根据主键查询高血压用药
     * @param child
     * @return
     */
    List<HypertensivePatientsChildNew> findhypertensivePatientsChildInfoInfoByMainId(HypertensivePatientsChildNew child);
}