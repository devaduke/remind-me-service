package com.rm.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.bean.entity.UsersEntity;
import com.rm.repository.UserRepository;
import com.rm.service.user.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepo = null;

	@Override
	public UsersEntity save(UsersEntity user) {
	 return userRepo.save(user);
	}
	
	@Override
	public List<UsersEntity> findUserByEmail(String email) {
		
	  return null;
	}
}
