package com.rm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rm.bean.entity.UsersEntity;

@Repository
public interface UserRepository extends CrudRepository<UsersEntity, Long>{

}
