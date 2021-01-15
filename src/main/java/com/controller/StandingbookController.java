package com.controller;

import com.entity.DasTerminal;
import com.entity.Standingbook;
import com.service.StandingbookService;
import com.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Standingbook)表控制层
 *
 * @author makejava
 * @since 2020-12-01 16:41:33
 */
@RestController
@RequestMapping("standingbook")
public class StandingbookController {
    /**
     * 服务对象
     */
    @Resource
    private StandingbookService standingbookService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Standingbook selectOne(String id) {
        return this.standingbookService.queryById(id);
    }


    @RequestMapping("queryAll")
    @ResponseBody
    public Object queryAll(Standingbook standingbook,@RequestParam(defaultValue = "1") Integer page, Integer limit){
        int num = this.standingbookService.queryAllNum(standingbook);
        List<Standingbook> list = this.standingbookService.queryAll(standingbook,page,limit);
        return Result.getStringObjectMap(num,list);
    }

}