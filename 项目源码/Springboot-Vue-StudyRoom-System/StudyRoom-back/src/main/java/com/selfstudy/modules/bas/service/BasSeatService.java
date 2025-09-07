package com.selfstudy.modules.bas.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.selfstudy.common.base.PageResult;
import com.selfstudy.common.utils.PageUtils;
import com.selfstudy.modules.bas.dto.query.BasSeatQueryDTO;
import com.selfstudy.modules.bas.entity.BasSeatEntity;
import com.selfstudy.modules.bas.vo.BasSeatVO;

import java.util.List;
import java.util.Map;

/**
 * 座位表
 *
 * @author 
 *  
 * @date 2025-02-01 16:46:47
 */
public interface BasSeatService extends IService<BasSeatEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageResult<BasSeatVO> queryByHelper(BasSeatQueryDTO queryDTO);

    List<BasSeatEntity> getSeatByRoom(Long id);

    List<Long> getSeatID(List<Long> asList);
}

