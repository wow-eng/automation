package com.service;

import com.entity.DasTerminal;
import java.util.List;
import java.util.Map;

/**
 * (DasTerminal)表服务接口
 *
 * @author makejava
 * @since 2020-11-27 17:22:08
 */
public interface DasTerminalService {

    /**
     * 通过ID查询单条数据
     *
     * @param terminalId 主键
     * @return 实例对象
     */
    DasTerminal queryById(String terminalId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DasTerminal> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dasTerminal 实例对象
     * @return 实例对象
     */
    DasTerminal insert(DasTerminal dasTerminal);

    /**
     * 修改数据
     *
     * @param dasTerminal 实例对象
     * @return 实例对象
     */
    DasTerminal update(DasTerminal dasTerminal);

    /**
     * 通过主键删除数据
     *
     * @param terminalId 主键
     * @return 是否成功
     */
    boolean deleteById(String terminalId);

    int queryAllNum(DasTerminal dasTerminal);

    List<DasTerminal> queryAll(DasTerminal dasTerminal,Integer page,Integer limit);

    List<Map> countStatistics();

}