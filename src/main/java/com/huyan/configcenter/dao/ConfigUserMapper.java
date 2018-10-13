package com.huyan.configcenter.dao;

import com.huyan.configcenter.dao.model.ConfigUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConfigUserMapper {
    int insert(ConfigUser record);

    int insertSelective(ConfigUser record);

    ConfigUser get();
}