package com.dao;

import com.entity.DasTerminal;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DasTerminal)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-27 17:22:07
 */
public interface DasTerminalDao {

    /**
     * 通过ID查询单条数据
     *
     * @param terminalId 主键
     * @return 实例对象
     */
    DasTerminal queryById(String terminalId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DasTerminal> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dasTerminal 实例对象
     * @return 对象列表
     */
    List<DasTerminal> queryAll(DasTerminal dasTerminal);

    /**
     * 新增数据
     *
     * @param dasTerminal 实例对象
     * @return 影响行数
     */
    int insert(DasTerminal dasTerminal);

    /**
     * 修改数据
     *
     * @param dasTerminal 实例对象
     * @return 影响行数
     */
    int update(DasTerminal dasTerminal);

    /**
     * 通过主键删除数据
     *
     * @param terminalId 主键
     * @return 影响行数
     */
    int deleteById(String terminalId);

    int queryAllNum(DasTerminal dasTerminal);

}