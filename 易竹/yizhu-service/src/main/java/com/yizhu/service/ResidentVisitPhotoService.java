package com.yizhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybs.phl.model.entity.ResidentVisitPhoto;

/**
 * 居民随访现场照片表 Service
 * 
 * @author bianj
 * @date 2019-06-18
 */
public interface ResidentVisitPhotoService extends IService<ResidentVisitPhoto> {
    /**
     * 获取历史随访相片
     * @param residentInfoId
     * @return
     */
    ResidentVisitPhoto selectByResidentId(Long residentInfoId);

    Integer updateByPrimaryKeySelective(ResidentVisitPhoto ybsResidentVisitPhoto);

    Integer insert(ResidentVisitPhoto ybsResidentVisitPhoto);

    /**
     * 据居民id删除
     * @param residentInfoId
     * @return
     */
    Integer delByResidentId(Long residentInfoId);

    /**
     * 获取当天的随访相片
     * @param residentInfoId
     * @return
     */
    ResidentVisitPhoto selectLatest(Long residentInfoId);
}