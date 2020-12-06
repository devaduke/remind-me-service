package com.rm.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rm.bean.entity.UsersEntity;
import com.rm.service.user.IUserService;

@RestController
public class UserController {

  @Autowired
  private IUserService userService = null;
  
  @RequestMapping("/fetchUsers")
  public List<UsersEntity> fetchUsers() {
    List users = userService.findAll();
    return users;
  }
}
