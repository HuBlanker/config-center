// Copyright 2018 Mobvoi Inc. All Rights Reserved.

package com.huyan.configcenter.service;

import com.huyan.configcenter.dao.model.ConfigUser;
import java.util.List;

/**
 * created by pfliu on 2018/10/14
 */
public interface UserService {

  List<ConfigUser> listAll();

  int createUser(ConfigUser user);

  ConfigUser getById(int id);

  int deleteById(int id);

  int updateById(ConfigUser user);

}
