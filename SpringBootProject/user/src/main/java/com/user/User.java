package com.user;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {

	@Id
	private int id;
	private String Name;
	private String city;
	private String status;
}
