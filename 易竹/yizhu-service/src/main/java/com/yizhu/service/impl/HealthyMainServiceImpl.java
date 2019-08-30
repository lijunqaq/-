package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.base.enums.VisitFromEnum;
import com.ybs.phl.dao.HealthyMainDAO;
import com.ybs.phl.model.inside.dto.VisitServiceConuntDTO;
import com.ybs.phl.model.entity.HealthyMain;
import com.ybs.phl.model.entity.VisitRecord;
import com.ybs.phl.model.inside.query.ResidentLastVisitDateQueryVO;
import com.ybs.phl.model.inside.query.ResidentVisitRecordQueryVO;
import com.ybs.phl.model.inside.query.VisitRecordCountQueryVO;
import com.yizhu.service.HealthyMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 健康体检主表----包含一般状况、健康评价，健康指导、危险控制因素 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HealthyMainServiceImpl extends ServiceImpl<HealthyMainDAO,HealthyMain> implements HealthyMainService {

    @Autowired
    private HealthyMainDAO healthyMainDAO;

    @Override
    public List<VisitServiceConuntDTO> queryPlanVisitInfoByResidentIdsAndYear(List<Long> idList, Integer year) {
        return healthyMainDAO.queryPlanVisitInfoByResidentIdsAndYear(idList,year);
    }

    @Override
    public HealthyMain findLastHealthyMain(Long residentInfoId) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("createtime");

        return getOne(criteria);
    }

    public List<VisitRecord> queryForSource(ResidentVisitRecordQueryVO vo){

        return healthyMainDAO.queryForSource(vo.getResidentId());
    }
    @Override
    public int queryCountByResidentId(Long residentId, VisitRecordCountQueryVO queryVO) {

        QueryWrapper criteria = new QueryWrapper();
        //criteria.eq("year(visit_date)", year);
        criteria.between("visit_date", queryVO.getStartDate(),queryVO.getEndDate());
        criteria.eq("resident_info_id", residentId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.eq("source", VisitFromEnum.PMI.getType());
        return count(criteria);
    }

    @Override
    public VisitRecord queryLastVisitDateByResidentIdAndYear(ResidentLastVisitDateQueryVO vo) {

        return healthyMainDAO.queryLastVisitDateByResidentIdAndYear(vo.getResidentId(), vo.getYear(), VisitFromEnum.PMI.getType());
    }
}