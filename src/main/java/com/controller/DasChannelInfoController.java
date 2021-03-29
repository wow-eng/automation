package com.controller;

import com.entity.DasChannelInfo;
import com.entity.Standingbook;
import com.service.DasChannelInfoService;
import com.util.LayResult;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

/**
 * (DasChannelInfo)表控制层
 *
 * @author makejava
 * @since 2021-02-01 19:59:48
 */
@RestController
@RequestMapping("dasChannelInfo")
public class DasChannelInfoController {
    /**
     * 服务对象
     */
    @Resource
    private DasChannelInfoService dasChannelInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DasChannelInfo selectOne(String id) {
        return this.dasChannelInfoService.queryById(id);
    }
    @RequestMapping("queryAll")
    @ResponseBody
    public Object queryAll(DasChannelInfo dasChannelInfo, @RequestParam(defaultValue = "1") Integer page, Integer limit){
        int num = this.dasChannelInfoService.queryAllNum(dasChannelInfo);
        List<DasChannelInfo> list = this.dasChannelInfoService.queryAll(dasChannelInfo,page,limit);
        return LayResult.getStringObjectMap(num,list);
    }

}