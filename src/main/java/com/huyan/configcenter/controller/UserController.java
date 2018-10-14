// Copyright 2018 Mobvoi Inc. All Rights Reserved.

package com.huyan.configcenter.controller;

import com.alibaba.fastjson.JSON;
import com.huyan.configcenter.dao.model.ConfigUser;
import com.huyan.configcenter.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by pfliu on 2018/10/14
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

  @Resource
  private UserService userService;

  @GetMapping()
  public String getAllUsers() {
    List<ConfigUser> users = userService.listAll();
    return JSON.toJSONString(users);
  }

  @PostMapping()
  public String createUser(@RequestBody ConfigUser user) {
    return String.valueOf(userService.createUser(user));
  }

  @GetMapping(value = "/{id}")
  public String getById(@PathVariable int id) {
    return JSON.toJSONString(userService.getById(id));
  }

  @DeleteMapping(value = "/{id}")
  public String deleteById(@PathVariable int id) {
    return JSON.toJSONString(userService.deleteById(id));
  }

  @PutMapping(value = "/{id}")
  public String updateById(@PathVariable int id, @RequestBody ConfigUser user) {
    return JSON.toJSONString(userService.updateById(user));
  }

}
