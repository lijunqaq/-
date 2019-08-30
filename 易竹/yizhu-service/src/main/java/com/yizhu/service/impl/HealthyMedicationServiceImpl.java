package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.HealthyMedicationDAO;
import com.ybs.phl.model.entity.HealthyMedication;
import com.yizhu.service.HealthyMedicationService;
import org.springframework.stereotype.Service;

/**
 * 健康检查表---主要用药情况子表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HealthyMedicationServiceImpl extends ServiceImpl<HealthyMedicationDAO,HealthyMedication> implements HealthyMedicationService {

}