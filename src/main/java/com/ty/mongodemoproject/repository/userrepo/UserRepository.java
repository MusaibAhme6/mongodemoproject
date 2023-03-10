package com.ty.mongodemoproject.repository.userrepo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ty.mongodemoproject.dto.User;

public interface UserRepository extends MongoRepository<User, Integer>{

	public User findByName(String name);
	
	@Query("{'email':?0,'name':?1}")
	public User findByEmAndName(String email,String name);
	
}
