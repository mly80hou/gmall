package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WmsShAreaEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 全国省市区信息
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:58:30
 */
public interface WmsShAreaService extends IService<WmsShAreaEntity> {

    PageVo queryPage(QueryCondition params);
}

