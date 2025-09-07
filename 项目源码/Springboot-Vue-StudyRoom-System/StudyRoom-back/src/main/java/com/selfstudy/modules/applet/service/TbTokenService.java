package com.selfstudy.modules.applet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.selfstudy.common.utils.PageUtils;
import com.selfstudy.modules.applet.entity.TbTokenEntity;

import java.util.Map;

/**
 * 小程序用户Token
 *
 * @author 
 *  
 * @date 2023-01-31 14:21:07
 */
public interface TbTokenService extends IService<TbTokenEntity> {

    TbTokenEntity queryByToken(String token);

    PageUtils queryPage(Map<String, Object> params);
}

