package com.rm.service.user;

import java.util.List;

import com.rm.bean.entity.UsersEntity;

public interface IUserService {

	UsersEntity save(UsersEntity user);
	
	public List<UsersEntity> findUserByEmail(String email);
 }
