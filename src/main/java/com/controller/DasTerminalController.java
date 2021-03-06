package com.controller;

import com.entity.DasTerminal;
import com.entity.TerminalType;
import com.service.DasTerminalService;
import com.util.LayResult;
import com.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (DasTerminal)表控制层
 *
 * @author makejava
 * @since 2020-11-26 20:01:48
 */
@RestController

@RequestMapping("dasTerminal")
public class DasTerminalController {
    /**
     * 服务对象
     */
    @Resource
    private DasTerminalService dasTerminalService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DasTerminal selectOne(String id) {
        return this.dasTerminalService.queryById(id);
    }

    @RequestMapping("queryAll")
    public Object selectAll(DasTerminal dasTerminal,@RequestParam(defaultValue = "1") Integer page,Integer limit){
        if(dasTerminal.getTerminalType() != null){
        String terminalType = dasTerminal.getTerminalType();
        if(terminalType.equals("FTU")){
            dasTerminal.setTerminalType("0");
        }else if(terminalType.equals("DTU")){
            dasTerminal.setTerminalType("1");
        }
        else if(terminalType.equals("TTU")){
            dasTerminal.setTerminalType("2");
        }else if(terminalType.equals("RTU")){
            dasTerminal.setTerminalType("3");
        }else if(terminalType.equals("分布式电源终端")){
            dasTerminal.setTerminalType("4");
        }else if(terminalType.equals("故障指示器")){
            dasTerminal.setTerminalType("5");
        }else if(terminalType.equals("电缆型故障指示器")){
            dasTerminal.setTerminalType("6");
        }else if(terminalType.equals("未知故障指示器")){
            dasTerminal.setTerminalType("7");
        }
        }
         int num = this.dasTerminalService.queryAllNum(dasTerminal);
         List<DasTerminal> list = this.dasTerminalService.queryAll(dasTerminal,page,limit);
        return LayResult.getStringObjectMap(num,list);
    }

    @RequestMapping("countStatistics")
    public Object countStatistics(){
        List<Map> list = this.dasTerminalService.countStatistics();
        TerminalType terminalType = new TerminalType();
        for( int i = 0; i < list.size(); i++ ) {
            Map<String,Long> map = list.get(i);
            if(("0").equals(map.get("terminal_type"))){
                terminalType.setFtu(map.get("num"));
            }else if(("1").equals(map.get("terminal_type"))){
                terminalType.setDtu(map.get("num"));
            }else if(("2").equals(map.get("terminal_type"))){
                terminalType.setTtu(map.get("num"));
            }else if(("3").equals(map.get("terminal_type"))){
                terminalType.setRtu(map.get("num"));
            }else if(("4").equals(map.get("terminal_type"))){
                terminalType.setFbs(map.get("num"));
            }else if(("5").equals(map.get("terminal_type"))){
                terminalType.setGz(map.get("num"));
            }else if(("6").equals(map.get("terminal_type"))){
                terminalType.setDlx(map.get("num"));
            }else if(("7").equals(map.get("terminal_type"))){
                terminalType.setWz(map.get("num"));
            }
        }
        return Result.success(terminalType);
    }

}