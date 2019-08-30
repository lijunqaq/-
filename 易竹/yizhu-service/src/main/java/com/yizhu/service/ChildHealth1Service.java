package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.ChildHealth1;

/**
 * 8个月龄儿童健康检查表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface ChildHealth1Service extends IService<ChildHealth1> {

    /**
     * 查询最新的0-8月龄儿童
     * @param residentInfoId
     * @return
     */
    ChildHealth1 findLastChildHealth1(Long residentInfoId);
}