package com.huyan.configcenter.dao;

import com.huyan.configcenter.dao.model.ConfigUser;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConfigUserMapper {

  int insert(ConfigUser record);

  List<ConfigUser> listAll();

  ConfigUser getById(int id);

  int deleteById(int id);

  int updateById(ConfigUser record);
}