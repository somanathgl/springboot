package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entities.User;

public interface SmartRepo  extends JpaRepository<User, Integer>{

	
}
