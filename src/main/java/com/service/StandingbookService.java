package com.service;

import com.entity.DasTerminal;
import com.entity.Standingbook;
import java.util.List;

/**
 * (Standingbook)表服务接口
 *
 * @author makejava
 * @since 2020-12-01 16:41:33
 */
public interface StandingbookService {

    /**
     * 通过ID查询单条数据
     *
     * @param terminalId 主键
     * @return 实例对象
     */
    Standingbook queryById(String terminalId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Standingbook> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param standingbook 实例对象
     * @return 实例对象
     */
    Standingbook insert(Standingbook standingbook);

    /**
     * 修改数据
     *
     * @param standingbook 实例对象
     * @return 实例对象
     */
    Standingbook update(Standingbook standingbook);

    /**
     * 通过主键删除数据
     *
     * @param terminalId 主键
     * @return 是否成功
     */
    boolean deleteById(String terminalId);
    int queryAllNum(Standingbook standingbook);

    List<Standingbook> queryAll(Standingbook standingbook,Integer page,Integer limit);

}