package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.base.enums.VisitFromEnum;
import com.ybs.phl.dao.HealthEduDAO;
import com.ybs.phl.model.entity.HealthEdu;
import com.ybs.phl.model.entity.VisitRecord;
import com.ybs.phl.model.inside.query.ResidentVisitRecordQueryVO;
import com.ybs.phl.model.inside.query.VisitRecordCountQueryVO;
import com.yizhu.service.HealthEduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 健康教育活动记录表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class HealthEduServiceImpl extends ServiceImpl<HealthEduDAO,HealthEdu> implements HealthEduService {

    @Autowired
    private HealthEduDAO healthEduDAO;

    @Override
    public int queryCountByResidentId(Long residentId, VisitRecordCountQueryVO queryVO) {

        QueryWrapper criteria = new QueryWrapper();
        //criteria.eq("year(time_filling)", year);
        criteria.between("time_filling", queryVO.getStartDate(),queryVO.getEndDate());
        criteria.eq("resident_info_id", residentId);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.eq("source", VisitFromEnum.PMI.getType());
        return count(criteria);
    }

    public List<VisitRecord> queryForSource(ResidentVisitRecordQueryVO vo){

        return healthEduDAO.queryForSource(vo.getResidentId());
    }
}