package com.atguigu.gmall.ums.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.ums.entity.UmsIntegrationChangeHistoryEntity;
import com.atguigu.gmall.ums.service.UmsIntegrationChangeHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;





/**
 * 积分变化历史记录
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:47:07
 */
@Api(tags = "积分变化历史记录 管理")
@RestController
@RequestMapping("sms/umsintegrationchangehistory")
public class UmsIntegrationChangeHistoryController {
    @Autowired
    private UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:umsintegrationchangehistory:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = umsIntegrationChangeHistoryService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:umsintegrationchangehistory:info')")
    public Resp<UmsIntegrationChangeHistoryEntity> info(@PathVariable("id") Long id){
		UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory = umsIntegrationChangeHistoryService.getById(id);

        return Resp.ok(umsIntegrationChangeHistory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:umsintegrationchangehistory:save')")
    public Resp<Object> save(@RequestBody UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory){
		umsIntegrationChangeHistoryService.save(umsIntegrationChangeHistory);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:umsintegrationchangehistory:update')")
    public Resp<Object> update(@RequestBody UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory){
		umsIntegrationChangeHistoryService.updateById(umsIntegrationChangeHistory);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:umsintegrationchangehistory:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		umsIntegrationChangeHistoryService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
