package com.yizhu.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.VisitFromEnum;
import com.ybs.phl.dao.HealthPrescriptionDAO;
import com.ybs.phl.model.entity.HealthPrescription;
import com.ybs.phl.model.entity.VisitRecord;
import com.ybs.phl.model.inside.query.ResidentVisitRecordQueryVO;
import com.ybs.phl.model.inside.query.VisitRecordCountQueryVO;
import com.yizhu.service.HealthPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 健康处方
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HealthPrescriptionServiceImpl extends ServiceImpl<HealthPrescriptionDAO,HealthPrescription> implements HealthPrescriptionService {

    @Autowired
    private HealthPrescriptionDAO healthPrescriptionDAO;
    @Override
    public int queryCountByResidentId(Long residentId, Integer visitType, VisitRecordCountQueryVO queryVO) {

        QueryWrapper criteria = new QueryWrapper();
        //criteria.eq("year(opening_time)", year);
        criteria.between("opening_time", queryVO.getStartDate(),queryVO.getEndDate());
        criteria.eq("resident_id", residentId);
        criteria.eq("disease_category", visitType);
        criteria.eq("source", VisitFromEnum.PMI.getType());
        return count(criteria);

    }

    @Override
    public List<VisitRecord> queryForSource(ResidentVisitRecordQueryVO vo) {
        return healthPrescriptionDAO.queryForSource(vo.getResidentId(),vo.getVisitType());
    }

    @Override
    public int add(HealthPrescription healthPrescription) {
        return healthPrescriptionDAO.insert(healthPrescription);
    }
}