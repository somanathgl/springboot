package com.smartcontat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcontat.entities.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
