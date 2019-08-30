package com.yizhu.service.impl;


import com.yizhu.model.ChildEye;
import com.yizhu.model.inside.query.VisitRecordCountQueryVO;
import com.yizhu.service.ChildEyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 儿童4-6岁龄视力检查表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
//extends ServiceImpl<ChildEyeDAO,ChildEye> implements ChildEyeService
public class ChildEyeServiceImpl  {

//    @Autowired
//    private ChildEyeDAO childEyeDAO;
//    @Override
//    public VisitRecord findLastAntenatalCareOneByResidentIdAndYear(ResidentLastVisitDateQueryVO vo) {
//
//        return childEyeDAO.findLastAntenatalCareOneByResidentIdAndYear(vo.getResidentId(),vo.getYear(),VisitFromEnum.PMI.getType());
//    }
//
//    @Override
//    public Integer queryCountByResidentId(Long residentId, Integer visitType, VisitRecordCountQueryVO queryVO) {
//        Integer childAge = VisitTypeEnum.findChildByType(visitType);
//
//        QueryWrapper criteria = new QueryWrapper();
//        criteria.eq("resident_info_id", residentId);
//        //criteria.eq("year(visit_date)", year);
//        criteria.between("visit_date", queryVO.getStartDate(),queryVO.getEndDate());
//        criteria.eq("valid", ValidEnum.VALID.getValue());
//        criteria.eq("child_age", childAge);
//        criteria.eq("source", VisitFromEnum.PMI.getType());
//
//        return count(criteria);
//    }
//
//    @Override
//    public List<VisitRecord> queryForSource(ResidentVisitRecordQueryVO vo) {
//        Integer childAge = VisitTypeEnum.findChildByType(vo.getVisitType());
//        List<VisitRecord> visitRecords = childEyeDAO.queryForSource(vo.getResidentId(), childAge);
//        visitRecords.forEach(record-> record.setType(vo.getVisitType()));
//        return visitRecords;
//    }
}