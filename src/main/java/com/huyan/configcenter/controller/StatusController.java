// Copyright 2018 Mobvoi Inc. All Rights Reserved.

package com.huyan.configcenter.controller;

import com.huyan.configcenter.dao.ConfigUserMapper;
import com.huyan.configcenter.dao.model.ConfigUser;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by pfliu on 2018/10/14
 */
@Controller
public class StatusController {

  @Resource
  private ConfigUserMapper configUserMapper;

  @GetMapping(value = "status")
  public String status() {

    ConfigUser user = configUserMapper.get();
    return "";
  }
}
