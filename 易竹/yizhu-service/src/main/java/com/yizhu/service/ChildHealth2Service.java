package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.ChildHealth2;

/**
 * 12 ～ 30 月龄儿童健康检查记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface ChildHealth2Service extends IService<ChildHealth2> {

    /**
     * 查询最新的12 ～ 30 月龄儿童健康检查记录
     * @param residentInfoId
     * @return
     */
    ChildHealth2 findLastChildHealth2(Long residentInfoId);
}