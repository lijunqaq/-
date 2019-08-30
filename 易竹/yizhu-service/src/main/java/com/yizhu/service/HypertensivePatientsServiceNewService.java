package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.biz.save.HypertensivePatientsServiceSaveVO;
import com.ybs.phl.model.entity.HypertensivePatientsService;
import com.ybs.phl.model.entity.HypertensivePatientsServiceNew;

import java.util.List;

/**
 * 高血压患者随访服务记录表new Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface HypertensivePatientsServiceNewService extends IService<HypertensivePatientsServiceNew> {

    /**
     * 查询居民所有随访记录
     * @param ids 业务随访集合
     * @return
     */
    List<HypertensivePatientsServiceNew> queryByIds(List<Long> ids);
    /**
     *  查询最新的高血压
     * @param residentInfoId
     * @return
     */
    HypertensivePatientsServiceNew findLastHypertensicePatientsServiceNew(Long residentInfoId);

    /**
     * 主键查询
     * @param vo
     * @return
     */
    HypertensivePatientsServiceNew findhypertensivePatientsInfoById(HypertensivePatientsServiceSaveVO vo);
}