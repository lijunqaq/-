package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.ResponseDataModel;
import com.ybs.phl.dao.HealthyHospitalizationDAO;
import com.ybs.phl.model.entity.HealthPrescription;
import com.ybs.phl.model.entity.HealthyHospitalization;
import com.ybs.phl.model.inside.dto.ResponseDTO;
import com.yizhu.service.HealthyHospitalizationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 健康检查表---住院治疗情况子表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HealthyHospitalizationServiceImpl extends ServiceImpl<HealthyHospitalizationDAO,HealthyHospitalization> implements HealthyHospitalizationService {

}