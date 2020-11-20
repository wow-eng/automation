package com.dao;

import com.entity.DasCMp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DasCMpDao {

  List<DasCMp> queryAll(String mpId);
}
