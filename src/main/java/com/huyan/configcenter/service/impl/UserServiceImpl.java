// Copyright 2018 Mobvoi Inc. All Rights Reserved.

package com.huyan.configcenter.service.impl;

import com.huyan.configcenter.dao.ConfigUserMapper;
import com.huyan.configcenter.dao.model.ConfigUser;
import com.huyan.configcenter.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * created by pfliu on 2018/10/14
 */
@Service
public class UserServiceImpl implements UserService {

  @Resource
  private ConfigUserMapper configUserMapper;

  @Override
  public List<ConfigUser> listAll() {
    return configUserMapper.listAll();
  }

  @Override
  public int createUser(ConfigUser user) {
    return configUserMapper.insert(user);
  }

  @Override
  public ConfigUser getById(int id) {
    return configUserMapper.getById(id);
  }

  @Override
  public int deleteById(int id) {
    return configUserMapper.deleteById(id);
  }

  @Override
  public int updateById(ConfigUser user) {
    return configUserMapper.updateById(user);
  }
}
