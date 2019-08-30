package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.ChinesMedicineChild;

/**
 * 6 ～ 36 月龄儿童中医药健康管理服务记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface ChinesMedicineChildService extends IService<ChinesMedicineChild> {

    /**
     * 查询最新的儿童中医药健康
     * @param residentInfoId
     * @return
     */
    ChinesMedicineChild findLastChinesMedicineChild(Long residentInfoId);
}