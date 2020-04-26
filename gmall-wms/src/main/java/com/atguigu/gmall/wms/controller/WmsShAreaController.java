package com.atguigu.gmall.wms.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.wms.entity.WmsShAreaEntity;
import com.atguigu.gmall.wms.service.WmsShAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;





/**
 * 全国省市区信息
 *
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2020-04-26 11:58:30
 */
@Api(tags = "全国省市区信息 管理")
@RestController
@RequestMapping("sms/wmssharea")
public class WmsShAreaController {
    @Autowired
    private WmsShAreaService wmsShAreaService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:wmssharea:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = wmsShAreaService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:wmssharea:info')")
    public Resp<WmsShAreaEntity> info(@PathVariable("id") Integer id){
		WmsShAreaEntity wmsShArea = wmsShAreaService.getById(id);

        return Resp.ok(wmsShArea);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:wmssharea:save')")
    public Resp<Object> save(@RequestBody WmsShAreaEntity wmsShArea){
		wmsShAreaService.save(wmsShArea);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:wmssharea:update')")
    public Resp<Object> update(@RequestBody WmsShAreaEntity wmsShArea){
		wmsShAreaService.updateById(wmsShArea);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:wmssharea:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		wmsShAreaService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
