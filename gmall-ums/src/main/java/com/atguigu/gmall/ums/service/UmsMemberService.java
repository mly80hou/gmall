package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.UmsMemberEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:47:07
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageVo queryPage(QueryCondition params);
}

