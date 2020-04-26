package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.UmsMemberCollectSubjectEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员收藏的专题活动
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:47:07
 */
public interface UmsMemberCollectSubjectService extends IService<UmsMemberCollectSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

