package com.yizhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.base.enums.ValidEnum;
import com.ybs.phl.base.enums.VisitFromEnum;
import com.ybs.phl.base.enums.VisitTypeEnum;
import com.ybs.phl.dao.ChildEyeDAO;
import com.ybs.phl.model.entity.ChildEye;
import com.ybs.phl.model.entity.VisitRecord;
import com.ybs.phl.model.inside.query.ResidentLastVisitDateQueryVO;
import com.ybs.phl.model.inside.query.ResidentVisitRecordQueryVO;
import com.ybs.phl.model.inside.query.VisitRecordCountQueryVO;
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
public class ChildEyeServiceImpl extends ServiceImpl<ChildEyeDAO,ChildEye> implements ChildEyeService {

    @Autowired
    private ChildEyeDAO childEyeDAO;
    @Override
    public VisitRecord findLastAntenatalCareOneByResidentIdAndYear(ResidentLastVisitDateQueryVO vo) {

        return childEyeDAO.findLastAntenatalCareOneByResidentIdAndYear(vo.getResidentId(),vo.getYear(),VisitFromEnum.PMI.getType());
    }

    @Override
    public Integer queryCountByResidentId(Long residentId, Integer visitType, VisitRecordCountQueryVO queryVO) {
        Integer childAge = VisitTypeEnum.findChildByType(visitType);

        QueryWrapper criteria = new QueryWrapper();
        criteria.eq("resident_info_id", residentId);
        //criteria.eq("year(visit_date)", year);
        criteria.between("visit_date", queryVO.getStartDate(),queryVO.getEndDate());
        criteria.eq("valid", ValidEnum.VALID.getValue());
        criteria.eq("child_age", childAge);
        criteria.eq("source", VisitFromEnum.PMI.getType());

        return count(criteria);
    }

    @Override
    public List<VisitRecord> queryForSource(ResidentVisitRecordQueryVO vo) {
        Integer childAge = VisitTypeEnum.findChildByType(vo.getVisitType());
        List<VisitRecord> visitRecords = childEyeDAO.queryForSource(vo.getResidentId(), childAge);
        visitRecords.forEach(record-> record.setType(vo.getVisitType()));
        return visitRecords;
    }
}