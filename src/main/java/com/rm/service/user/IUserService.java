package com.rm.service.user;

import java.util.List;

import com.rm.bean.entity.UsersEntity;

public interface IUserService {

	List<UsersEntity> findAll();
	void save(UsersEntity user);
}
