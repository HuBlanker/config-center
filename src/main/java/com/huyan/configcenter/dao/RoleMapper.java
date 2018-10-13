package com.huyan.configcenter.dao;

import com.huyan.configcenter.dao.model.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}