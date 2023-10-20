package com.smart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.dao.ContactRepo;
import com.smart.dao.SmartRepo;
import com.smart.entities.Contacts;
import com.smart.entities.User;

@Controller
//@ResponseBody
public class HomeController {
	/*@Autowired
	private SmartRepo smartrepo;
	@Autowired
	private ContactRepo contactrepo;
	
	 @GetMapping("/home")
	public String Home() {
		
		 User user=new User();
		 user.setId(1);
		 user.setName("Raju");
		 user.setAbout("i am businessman");
		 
		 Contacts contact=new Contacts();
		 
		contact.setCid(1);
		 contact.setName("shahuram");
		contact.setSecondname("shahu");
		 
		 User s = smartrepo.save(user);
		 Contacts c = contactrepo.save(contact);
		 System.out.println(s+" "+c);
		return "this is home page";

	}*/
	
	
		

}
