// Copyright 2018 Mobvoi Inc. All Rights Reserved.

package com.huyan.configcenter.controller;

import com.alibaba.fastjson.JSONObject;
import com.huyan.configcenter.dao.ConfigUserMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by pfliu on 2018/10/14
 */
@RestController
public class StatusController {

  @Resource
  private ConfigUserMapper configUserMapper;

  @GetMapping(value = "status")
  public JSONObject status() {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("service", "config-center");
    jsonObject.put("status", "ok");
    return jsonObject;
  }
}
