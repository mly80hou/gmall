package com.atguigu.gmall.ums.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.ums.entity.UmsGrowthChangeHistoryEntity;
import com.atguigu.gmall.ums.service.UmsGrowthChangeHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;





/**
 * 成长值变化历史记录
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:47:07
 */
@Api(tags = "成长值变化历史记录 管理")
@RestController
@RequestMapping("sms/umsgrowthchangehistory")
public class UmsGrowthChangeHistoryController {
    @Autowired
    private UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:umsgrowthchangehistory:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = umsGrowthChangeHistoryService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:umsgrowthchangehistory:info')")
    public Resp<UmsGrowthChangeHistoryEntity> info(@PathVariable("id") Long id){
		UmsGrowthChangeHistoryEntity umsGrowthChangeHistory = umsGrowthChangeHistoryService.getById(id);

        return Resp.ok(umsGrowthChangeHistory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:umsgrowthchangehistory:save')")
    public Resp<Object> save(@RequestBody UmsGrowthChangeHistoryEntity umsGrowthChangeHistory){
		umsGrowthChangeHistoryService.save(umsGrowthChangeHistory);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:umsgrowthchangehistory:update')")
    public Resp<Object> update(@RequestBody UmsGrowthChangeHistoryEntity umsGrowthChangeHistory){
		umsGrowthChangeHistoryService.updateById(umsGrowthChangeHistory);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:umsgrowthchangehistory:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		umsGrowthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
