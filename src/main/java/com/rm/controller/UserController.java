package com.rm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rm.bean.entity.UsersEntity;
import com.rm.service.user.IUserService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = {"Users"})
public class UserController {

  @Autowired
  private IUserService userService = null;
  
  @PostMapping("/save-user")
  public Map saveUser(@RequestAttribute("body") JSONObject body) {
	UsersEntity newUser = new UsersEntity();
	newUser.setUserName(body.has("userName") ? body.getString("userName") : null);
	newUser.setFirstName(body.has("firstName") ? body.getString("firstName") : null);
	newUser.setLastName(body.has("lastName") ? body.getString("lastName") : null);
	newUser.setEmail(body.has("email") ? body.getString("email") : null);
	newUser.setPhone(body.has("phone") ? body.getString("phone") : null);
	newUser.setCity(body.has("city") ? body.getString("city") : null);
	newUser.setCountry(body.has("country") ? body.getString("country") : null);
	
	newUser = userService.save(newUser);
	
    Map outMap = new HashMap<String, String>();
    outMap.put("code", "200");
    outMap.put("status", "success");
    outMap.put("user", newUser);
    return outMap;
  }
}
