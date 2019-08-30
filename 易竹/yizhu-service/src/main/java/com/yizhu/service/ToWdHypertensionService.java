package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.ToWdHypertension;

/**
 * 高血压数据同步到万达，ybs_hypertensive_patients_service_new和ybs_hypertensive_special_record  id偏移量，即下一次从哪个id开始同步数据 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface ToWdHypertensionService extends IService<ToWdHypertension> {

}