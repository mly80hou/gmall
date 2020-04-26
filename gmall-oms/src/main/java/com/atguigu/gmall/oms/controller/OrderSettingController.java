package com.atguigu.gmall.oms.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.oms.entity.OrderSettingEntity;
import com.atguigu.gmall.oms.service.OrderSettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;




/**
 * 订单配置信息
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 12:21:11
 */
@Api(tags = "订单配置信息 管理")
@RestController
@RequestMapping("sms/ordersetting")
public class OrderSettingController {
    @Autowired
    private OrderSettingService orderSettingService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:ordersetting:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = orderSettingService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:ordersetting:info')")
    public Resp<OrderSettingEntity> info(@PathVariable("id") Long id){
		OrderSettingEntity orderSetting = orderSettingService.getById(id);

        return Resp.ok(orderSetting);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:ordersetting:save')")
    public Resp<Object> save(@RequestBody OrderSettingEntity orderSetting){
		orderSettingService.save(orderSetting);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:ordersetting:update')")
    public Resp<Object> update(@RequestBody OrderSettingEntity orderSetting){
		orderSettingService.updateById(orderSetting);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:ordersetting:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		orderSettingService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
