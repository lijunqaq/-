package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.ToWdHypertensionDAO;
import com.ybs.phl.model.entity.ToWdHypertension;
import com.yizhu.service.ToWdHypertensionService;
import org.springframework.stereotype.Service;

/**
 * 高血压数据同步到万达，ybs_hypertensive_patients_service_new和ybs_hypertensive_special_record  id偏移量，即下一次从哪个id开始同步数据 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class ToWdHypertensionServiceImpl extends ServiceImpl<ToWdHypertensionDAO,ToWdHypertension> implements ToWdHypertensionService {

}