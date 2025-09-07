package com.selfstudy.modules.bas.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.selfstudy.common.base.PageResult;
import com.selfstudy.common.utils.PageUtils;
import com.selfstudy.modules.bas.dto.query.BasStudyRoomQueryDTO;
import com.selfstudy.modules.bas.entity.BasNoticeEntity;
import com.selfstudy.modules.bas.entity.BasStudyRoomEntity;
import com.selfstudy.modules.bas.vo.BasStudyRoomVO;

import java.util.List;
import java.util.Map;

/**
 * 自习室表
 *
 * @author 
 *  
 * @date 2025-02-01 16:46:47
 */
public interface BasStudyRoomService extends IService<BasStudyRoomEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageResult<BasStudyRoomVO> queryByHelper(BasStudyRoomQueryDTO queryDTO);

    List<BasStudyRoomEntity> getRoomByFloor(Long id);
}

