package com.huyan.configcenter.dao;

import com.huyan.configcenter.dao.model.Closet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClosetMapper {
    int insert(Closet record);

    int insertSelective(Closet record);
}