package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WmsFeightTemplateEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:58:30
 */
public interface WmsFeightTemplateService extends IService<WmsFeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

