package com.dao;

import com.entity.DasChannelInfo;
import com.entity.Standingbook;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DasChannelInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-01 19:59:47
 */
public interface DasChannelInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param terminalId 主键
     * @return 实例对象
     */
    DasChannelInfo queryById(String terminalId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DasChannelInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dasChannelInfo 实例对象
     * @return 对象列表
     */
    List<DasChannelInfo> queryAll(DasChannelInfo dasChannelInfo);

    /**
     * 新增数据
     *
     * @param dasChannelInfo 实例对象
     * @return 影响行数
     */
    int insert(DasChannelInfo dasChannelInfo);

    /**
     * 修改数据
     *
     * @param dasChannelInfo 实例对象
     * @return 影响行数
     */
    int update(DasChannelInfo dasChannelInfo);

    /**
     * 通过主键删除数据
     *
     * @param terminalId 主键
     * @return 影响行数
     */
    int deleteById(String terminalId);

    int queryAllNum(DasChannelInfo dasChannelInfo);

}