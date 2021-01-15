package com.dao;

import com.entity.DasTerminal;
import com.entity.Standingbook;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Standingbook)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-01 16:41:33
 */
public interface StandingbookDao {

    /**
     * 通过ID查询单条数据
     *
     * @param terminalId 主键
     * @return 实例对象
     */
    Standingbook queryById(String terminalId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Standingbook> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param standingbook 实例对象
     * @return 对象列表
     */
    List<Standingbook> queryAll(Standingbook standingbook);

    /**
     * 新增数据
     *
     * @param standingbook 实例对象
     * @return 影响行数
     */
    int insert(Standingbook standingbook);

    /**
     * 修改数据
     *
     * @param standingbook 实例对象
     * @return 影响行数
     */
    int update(Standingbook standingbook);

    /**
     * 通过主键删除数据
     *
     * @param terminalId 主键
     * @return 影响行数
     */
    int deleteById(String terminalId);

    int queryAllNum(Standingbook standingbook);

}