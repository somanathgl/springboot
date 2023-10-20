package com.springboot.rest.books;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.books.entities.Books;
import com.springboot.rest.books.service.Bookservice;

@RestController
public class Controller {
	@Autowired
	private  Bookservice bookservice;
	
@GetMapping("/books")
public List<Books> getbook() {
	
	return this.bookservice.getallbooks();
}

@GetMapping("/book/{id}")
public Books bookbyid(@PathVariable("id")int id){
	
	return bookservice.getbookbyid(id);
}
}
	
		
		
	

