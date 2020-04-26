package com.atguigu.gmall.ums.dao;


import com.atguigu.gmall.ums.entity.UmsMemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:47:07
 */
@Mapper
public interface UmsMemberDao extends BaseMapper<UmsMemberEntity> {
	
}
