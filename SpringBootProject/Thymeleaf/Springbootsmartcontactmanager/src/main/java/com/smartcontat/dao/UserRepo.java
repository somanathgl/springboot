package com.smartcontat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smartcontat.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
    @Query("select  u from User u where u.email= : email " ) 
	public User getUserByname(@Param("email")String email ) ;
}
