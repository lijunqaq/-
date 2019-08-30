package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.base.enums.VisitFromEnum;
import com.ybs.phl.dao.VisitRecordDAO;
import com.ybs.phl.model.inside.dto.VisitServiceConuntDTO;
import com.ybs.phl.model.entity.VisitRecord;
import com.ybs.phl.model.inside.query.ResidentLastVisitDateQueryVO;
import com.ybs.phl.model.inside.query.ResidentVisitRecordQueryVO;
import com.ybs.phl.model.inside.query.VisitRecordCountQueryVO;
import com.yizhu.service.VisitRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 居民随访总表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class VisitRecordServiceImpl extends ServiceImpl<VisitRecordDAO,VisitRecord> implements VisitRecordService {

    @Autowired
    private VisitRecordDAO visitRecordDAO;

    @Override
    public List<VisitRecord> queryVisitRecordList(Long residentInfoId, Date visitDate, Integer groupType) {

        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentInfoId);
        criteria.eq("group_type", groupType);
        criteria.eq("visit_date", visitDate);
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.isNotNull("type_child_detail");

        return list(criteria);
    }

    @Override
    public int queryCountByResidentId(Long residentId, Integer groupType, VisitRecordCountQueryVO queryVO) {

        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentId);
        criteria.eq("type", groupType);
        //criteria.eq("year(visit_date)", year);
        criteria.between("visit_date", queryVO.getStartDate(),queryVO.getEndDate());
        criteria.eq("source", VisitFromEnum.PMI.getType());
        criteria.eq("valid", ValidEnum.VALID.getValue());

        return count(criteria);
    }

    @Override
    public List<VisitServiceConuntDTO> queryPlanVisitInfoByResidentIdsAndYear(List<Long> idList, Integer year) {

        return  visitRecordDAO.queryPlanVisitInfoByResidentIdsAndYear(idList,year);

    }

    @Override
    public List<VisitRecord> queryStandingBookCount(Integer year, List<Long> residentInfoIds){

        return visitRecordDAO.queryStandingBookCount(year, residentInfoIds);
    }

    @Override
    public List<VisitRecord> queryByGroupAndSource(ResidentVisitRecordQueryVO vo, Integer type ){

        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", vo.getResidentId());
        criteria.eq("group_type", type);
        //criteria.eq("year(visit_date)", vo.getYear());
       // criteria.between("visit_date", vo.getStartDate(),vo.getEndDate());
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");

        return list(criteria);
    }

    @Override
    public List<VisitRecord> queryForSource(ResidentVisitRecordQueryVO vo){

        return visitRecordDAO.queryForSource(vo.getResidentId(), vo.getVisitType());
    }


    @Override
    public List<VisitRecord> findLastVisitDateByResidentIdAndYear(ResidentLastVisitDateQueryVO vo, List<Integer> groupNames) {
        return visitRecordDAO.findLastVisitDateByResidentIdAndYear(vo.getResidentId(),vo.getYear(), groupNames, VisitFromEnum.PMI.getType());
    }

    @Override
    public VisitRecord findLastVisitDateByResidentIdAndYearAndType(ResidentLastVisitDateQueryVO vo, List<Integer> antenatalType, Integer groupType) {
        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", vo.getResidentId());
        criteria.in("type", antenatalType);
        criteria.eq("year(visit_date)", vo.getYear());
        criteria.eq("group_type",groupType );
        criteria.eq("source", VisitFromEnum.PMI.getType());
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.orderByDesc("visit_date");
        return getOne(criteria);
    }
}