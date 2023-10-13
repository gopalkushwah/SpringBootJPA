package com.jpabootproj.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpabootproj.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
}
