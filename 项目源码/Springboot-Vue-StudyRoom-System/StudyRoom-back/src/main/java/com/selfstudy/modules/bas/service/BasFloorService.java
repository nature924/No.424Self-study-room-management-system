package com.selfstudy.modules.bas.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.selfstudy.common.utils.PageUtils;
import com.selfstudy.modules.bas.entity.BasFloorEntity;

import java.util.Map;

/**
 * 
 *
 * @author 
 *  
 * @date    09:31:31
 */
public interface BasFloorService extends IService<BasFloorEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

