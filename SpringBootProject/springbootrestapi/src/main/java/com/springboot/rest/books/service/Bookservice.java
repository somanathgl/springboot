package com.springboot.rest.books.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.rest.books.entities.Books;
@Component
public class Bookservice {
	
	private static List<Books> list=new ArrayList<>();
		static {
			list.add(new Books(102,"strength of machine","abc"));
			list.add(new Books(103,"Bhagwatgita","shree Krushna"));
			list.add(new Books(104,"Mahabharat","xyz"));
		}
		
		public List<Books> getallbooks() {
			return list;
		}
		
		public Books getbookbyid(int id) {
			Books book=null;
			 book = list.stream().filter(e->e.getId()==id).findFirst().get();
			return book;
		}
}


