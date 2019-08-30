package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.ElderlyHealth;

/**
 * 老年人中医 药健康管理服务记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface ElderlyHealthService extends IService<ElderlyHealth> {

    /**
     * 查询最近的中医药健康记录
     * @param residentInfoId
     * @return
     */
    ElderlyHealth findLastChineseHealth(Long residentInfoId);
}