package com.selfstudy.modules.applet.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.selfstudy.modules.applet.entity.TbTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 小程序用户Token
 * 
 * @author 
 *  
 * @date 2023-01-31 14:21:07
 */
@Mapper
public interface TbTokenDao extends BaseMapper<TbTokenEntity> {

    TbTokenEntity queryByToken(String token);
}
