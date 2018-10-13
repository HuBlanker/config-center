package com.huyan.configcenter.dao;

import com.huyan.configcenter.dao.model.Drawer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DrawerMapper {
    int insert(Drawer record);

    int insertSelective(Drawer record);
}