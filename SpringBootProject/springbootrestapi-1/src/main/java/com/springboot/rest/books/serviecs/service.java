package com.springboot.rest.books.serviecs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.springboot.rest.books.Dao.bookRepository;
import com.springboot.rest.books.entities.Book;

@Component
public class service {
	@Autowired
	private  bookRepository repository;
	//private static List<Book>list=new ArrayList<>();
	
	/*static {
		list.add(new Book(10,"chemistry","pqr"));
		list.add(new Book(11,"English","lmn"));
		list.add(new Book(12,"History","xyz"));
	}*/
		public List<Book> getallbooks(){
			
			List<Book> list=(List<Book>)this.repository.findAll();
			return list;
		}
		
	/*	public Book getbookbyId(int id) {
			Book book= null;
			try {
				//book = list.stream().filter(e-> e.getId()==id).findFirst().get();
				
				book=this.repository.findById(id);
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			return book;
			
		}*/
		
		public Book addbook(Book b)
		{
			// list.add(b);
			Book b1= this.repository.save(b);
			return b1;
		}

		public void deletebook( int bookid) {
			//List<Book> list1 = list.stream().filter(e->e.getId()==bookid).collect(Collectors.toList());
			
			this.repository.deleteById(bookid);
			System.out.println("deleted");
		}
		
		public void update(Book book,int bookid) {
			
		/*list= list.stream().map(b->{
		 if(b.getId()==bookid)
		 {
			 b.setName(b.getName());
			 b.setAuthor(b.getAuthor());
		 }
		 return b;
		}).collect(Collectors.toList());*/
			book.setId(bookid);
			
			this.repository.save(book);
			
}
}


