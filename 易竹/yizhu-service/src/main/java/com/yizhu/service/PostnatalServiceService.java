package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.PostnatalService;

/**
 * 产后访视记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface PostnatalServiceService extends IService<PostnatalService> {

    /**
     * 查询最新孕妇产后
     * @param residentInfoId
     * @return
     */
    PostnatalService findLastPostnatalService(Long residentInfoId);
}