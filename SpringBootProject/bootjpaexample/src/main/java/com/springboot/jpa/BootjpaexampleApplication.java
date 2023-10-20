package com.springboot.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.springboot.jpa.Dao.UserRepository;
import com.springboot.jpa.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository= context.getBean(UserRepository.class);
		
		/*User user=new User();
		
		user.setName("Somanath Lokhande");
		user.setCity("Solapur");
		user.setStatus("I am learning Springboot"); 
		*/
		User user1=new User();
		user1.setName("Raghav");
		user1.setCity("zanshi");
		user1.setStatus("I am learning Python");
		
		User user2=new User();
		user2.setName("Gautam");
		user2.setCity("Delhi");
		user2.setStatus("I am Plyaying cricket");
		
		/*List<User> users = List.of(user1,user2);
		Iterable<User> result = userRepository.saveAll(users);
		
		result.forEach(user->{
			System.out.println(user);
			
		});*/
		
		/*Optional<User> optional = userRepository.findById(103);
		
		User user = optional.get();
		user.setName("Gulgul");
		
		User save = userRepository.save(user);
		System.out.println(save);*/
		
		/*Iterable<User> findAll = userRepository.findAll();
		findAll.forEach(user->{
			System.out.println(user);
		});*/
		
		/*userRepository.deleteById(103);
		System.out.println("deleted");*/
		
		/*User user =new User();
		
		user.setName("Virat");
		user.setCity("Delhi");
		user.setStatus("I am playing cricket for india");
		
		User user5=new User();
		user5.setName("Rohi Sharma");
		user5.setCity("Mumbai");
		user5.setStatus("playing for mubai indians");*/
		
	/*	User user6=new User();
		user6.setName("Suryakumar yadav");
		user6.setCity("RCB");
		user6.setStatus("playing for RCB");
		
        User user =new User();
		
		user.setName("Kl Rahul");
		user.setCity("panjab");
		user.setStatus("I am playing crickrt for K11B");
		
		
		List<User> users = List.of(user,user6);
		 Iterable<User> result = userRepository.saveAll(users);
		 result.forEach(Users ->{
			 System.out.println(users);
			 
			 
		 });
		
		Optional<User> optional = userRepository.findById(303);
		User user = optional.get();
		user.setStatus("Playing for Mumbai Indians");
		
		User save = userRepository.save(user);
		System.out.println(save);*/
		
		userRepository.deleteById(203);
		userRepository.deleteById(252);
		userRepository.deleteById(253);
		
		System.out.println("Reord Deleted");
		
		
		
	}

}
