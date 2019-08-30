package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.AntenatalManyService;

/**
 * 第 2～5 次产前随访服务记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface AntenatalManyServiceService extends IService<AntenatalManyService> {
    /**
     * 查询最新的孕妇2-5次随访
     * @param residentInfoId
     * @return
     */
    AntenatalManyService findLastAntenatalManyService(Long residentInfoId);
}