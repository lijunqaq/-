package com.yizhu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ybs.phl.dao.ResidentVisitPhotoDAO;
import com.ybs.phl.model.entity.ResidentVisitPhoto;
import com.yizhu.service.ResidentVisitPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 居民随访现场照片表 Service 实现类
 * 
 * @author bianj
 * @date 2019-06-18
 */
@Service
public class ResidentVisitPhotoServiceImpl extends ServiceImpl<ResidentVisitPhotoDAO,ResidentVisitPhoto> implements ResidentVisitPhotoService {

    @Autowired
    private ResidentVisitPhotoDAO residentVisitPhotoDAO;
    @Override
    public ResidentVisitPhoto selectByResidentId(Long residentInfoId) {
        return residentVisitPhotoDAO.selectByResidentId(residentInfoId);
    }

    @Override
    public Integer updateByPrimaryKeySelective(ResidentVisitPhoto residentVisitPhoto) {
        return residentVisitPhotoDAO.updateById(residentVisitPhoto);
    }

    @Override
    public Integer insert(ResidentVisitPhoto esirdentVisitPhoto) {
        return residentVisitPhotoDAO.insert(esirdentVisitPhoto);
    }

    @Override
    public Integer delByResidentId(Long residentInfoId) {
        return residentVisitPhotoDAO.delByResidentId(residentInfoId);
    }

    @Override
    public ResidentVisitPhoto selectLatest(Long residentInfoId) {
        return   residentVisitPhotoDAO.selectLatest(residentInfoId);
    }
}