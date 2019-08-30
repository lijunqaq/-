package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.ChildHealth3;

/**
 * 3 ～ 6 岁儿童健康检查记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface ChildHealth3Service extends IService<ChildHealth3> {

    /**
     * 查询最新的3 ～ 6 岁儿童健康检查记录
     * @param residentInfoId
     * @return
     */
    ChildHealth3 findLastChildHealth3(Long residentInfoId);
}