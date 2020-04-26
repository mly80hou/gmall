package com.atguigu.gmall.oms.controller;

import java.util.Arrays;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.oms.entity.OrderReturnReasonEntity;
import com.atguigu.gmall.oms.service.OrderReturnReasonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;





/**
 * 退货原因
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 12:21:11
 */
@Api(tags = "退货原因 管理")
@RestController
@RequestMapping("sms/orderreturnreason")
public class OrderReturnReasonController {
    @Autowired
    private OrderReturnReasonService orderReturnReasonService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:orderreturnreason:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = orderReturnReasonService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:orderreturnreason:info')")
    public Resp<OrderReturnReasonEntity> info(@PathVariable("id") Long id){
		OrderReturnReasonEntity orderReturnReason = orderReturnReasonService.getById(id);

        return Resp.ok(orderReturnReason);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:orderreturnreason:save')")
    public Resp<Object> save(@RequestBody OrderReturnReasonEntity orderReturnReason){
		orderReturnReasonService.save(orderReturnReason);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:orderreturnreason:update')")
    public Resp<Object> update(@RequestBody OrderReturnReasonEntity orderReturnReason){
		orderReturnReasonService.updateById(orderReturnReason);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:orderreturnreason:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		orderReturnReasonService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
