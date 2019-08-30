package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.AntenatalCareOne;
import com.ybs.phl.model.inside.query.ResidentLastVisitDateQueryVO;

/**
 * 第 1  次产前检查服务记录表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface AntenatalCareOneService extends IService<AntenatalCareOne> {

    /**
     * 查询最新的孕产妇第一次随访
     * @param residentInfoId
     * @return
     */
    AntenatalCareOne findLastAntenatalCareOne(Long residentInfoId);

    /**
     * 查询最新的孕产妇第一次随访根据id和年份
     * @param vo 居民信息
     * @return
     */
    AntenatalCareOne findLastAntenatalCareOneByResidentIdAndYear(ResidentLastVisitDateQueryVO vo);
}