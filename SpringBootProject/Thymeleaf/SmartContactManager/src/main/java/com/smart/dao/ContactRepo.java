package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entities.Contacts;

public interface ContactRepo extends JpaRepository<Contacts, Integer>{

} 


