package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.PostnatalHealthCheck;

/**
 * 产后 42 天健康检查记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface PostnatalHealthCheckService extends IService<PostnatalHealthCheck> {
    /**
     * 查询最新的孕妇产后42天
     * @param residentInfoId
     * @return
     */
    PostnatalHealthCheck findLastPostnatalHealthCheck(Long residentInfoId);
}