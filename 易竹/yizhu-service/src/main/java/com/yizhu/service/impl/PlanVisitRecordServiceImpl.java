package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.dao.PlanVisitRecordDAO;
import com.ybs.phl.model.biz.dto.PlanVisitRecordDTO;
import com.ybs.phl.model.entity.PlanVisitRecord;
import com.yizhu.service.PlanVisitRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 居民随访计划表 Service 实现类
 *
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class PlanVisitRecordServiceImpl extends ServiceImpl<PlanVisitRecordDAO, PlanVisitRecord> implements PlanVisitRecordService {
    @Autowired
    private PlanVisitRecordDAO planVisitRecordDAO;

    @Override
    public List<PlanVisitRecordDTO> queryPlanVisitRecordsByResidentId(List<Long> idList) {
        return planVisitRecordDAO.queryPlanVisitRecordsByResidentId(idList);
    }

    @Override
    public Integer delList(Long residentInfoId, List<String> delGroupTypes) {

        return planVisitRecordDAO.delList(residentInfoId, delGroupTypes);
    }

    @Override
    public PlanVisitRecord findOne(PlanVisitRecord params) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", params.getResidentInfoId());
        criteria.eq("valid", ValidEnum.VALID.getValue());
        if (params.getGroupType() != null) {
            criteria.eq("group_type", params.getGroupType());
        }
        if (params.getModuleType() != null) {
            criteria.eq("module_Type", params.getModuleType());
        }
        return getOne(criteria);

    }

    @Override
    public Integer insertList(List<PlanVisitRecord> planVisitRecordList) {
        return saveBatch(planVisitRecordList) ? 1 : 0;
    }

    @Override
    public PlanVisitRecord findOneByCondition(PlanVisitRecord record) {
        return planVisitRecordDAO.findOneByCondition(record);
    }

    @Override
    public PlanVisitRecord findResidentInGroupType(PlanVisitRecord query) {
        return planVisitRecordDAO.findResidentInGroupType(query);
    }

    @Override
    public Integer delPlan(Long residentInfoId, List<Integer> moduleTypes) {
        return planVisitRecordDAO.delPlan(residentInfoId,moduleTypes);
    }


    @Override
    public List<PlanVisitRecord> findAll(PlanVisitRecord planVisitRecord) {
        return planVisitRecordDAO.findAll(planVisitRecord);
    }

    @Override
    public Integer delByCondition(PlanVisitRecord planVisitRecord) {
        return planVisitRecordDAO.delByCondition(planVisitRecord);
    }

    @Override
    public Integer insert(PlanVisitRecord planVisitRecord) {
        return planVisitRecordDAO.insert(planVisitRecord);
    }

    @Override
    public Integer updatePlanVisitDate(PlanVisitRecord planVisitRecord) {
        return planVisitRecordDAO.updatePlanVisitDate(planVisitRecord);
    }

    @Override
    public List<PlanVisitRecord> findChildWhichNotMedicine(PlanVisitRecord record) {
        return planVisitRecordDAO.findChildWhichNotMedicine(record);
}
}