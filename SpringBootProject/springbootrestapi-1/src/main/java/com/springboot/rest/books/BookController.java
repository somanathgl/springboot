package com.springboot.rest.books;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.rest.books.entities.Book;
import com.springboot.rest.books.serviecs.service;

@RestController
public class BookController {
	@Autowired
	private service Service;
	
	@GetMapping("/test")
	public ResponseEntity <List<Book>> getbook() {
		
	List<Book> list = this.Service.getallbooks();
	if(list.size()<=0){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	return ResponseEntity.status(HttpStatus.CREATED).body(list);
		
	}
	
/*@GetMapping("/test/{id}")
	public ResponseEntity<Book> takebookbyId(@PathVariable("id")int id) {
		
	       Book book=this.Service.getbookbyId(id);
	       if(book==null) {
	    	 ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	       return ResponseEntity.of(Optional.of(book));
}*/	
	@PostMapping("/test")
	public ResponseEntity<Book> addbook(@RequestBody Book book) {
		Book b = null;
		try{
			b=this.Service.addbook(book);
			System.out.println(b);
			return ResponseEntity.of(Optional.of(b));
		}
	  catch (Exception e) {
		e.printStackTrace();
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}
	   
	
		
	}
	
	@DeleteMapping("/test/{bookid}")
	public ResponseEntity<Book> deletebook(@PathVariable("bookid")int bookid) {
		
		try {
			this.Service.deletebook(bookid);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@PutMapping("/test/{bookid}")
	public ResponseEntity<Book> update(@RequestBody Book book,@PathVariable("bookid")int bookid) {
		
		try {
			this.Service.update(book, bookid);
			return ResponseEntity.ok().body(book);
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
	}
	
	
	
	

}
