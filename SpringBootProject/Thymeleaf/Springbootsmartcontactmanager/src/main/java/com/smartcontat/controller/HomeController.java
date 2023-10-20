package com.smartcontat.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.smartcontat.dao.UserRepo;
import com.smartcontat.entities.User;
import com.smartcontat.helper.Message;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	//@Autowired
	//private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	 private UserRepo userrepo;
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title","home-smart contact manager");
		return "home";
	}
		
     @RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title","about-smart contact manager");
		return "about";
	}
		
     @RequestMapping("/signup")
 	public String signup(Model model) {
 		model.addAttribute("title","signup-smart contact manager");
 		model.addAttribute("user", new User());
 		return "signup";
 	}
     
     @RequestMapping("/login")
 	public String login(Model model) {
 		model.addAttribute("title","login-smart contact manager");
 		return "login";
 	}
     
   
     
     
     @RequestMapping(value="/do_register", method=RequestMethod.POST)
     
  	public String registerUser(@Valid @ModelAttribute("user") User user,BindingResult result1,@RequestParam(value="agreement", defaultValue="false")boolean agreement, Model model, HttpSession session) {
  		
  		model.addAttribute("user", new User());
  		try { 
  		       if(!agreement) { 
  		    	 System.out.println("you have not agreed terms and conditions");
  		    	 throw new Exception("you have not agreed terms and conditions");
  		       }
  		       if(result1.hasErrors()) {
  		    	   System.out.println("Error"+result1.toString());
  		    	   model.addAttribute("user", user);
  		    	   return "signup";
  		       }
  		                 
  		                  user.setRole("USER_ROLE");               
     	                  user.setImageUrl("default.png");
  	                      user.setEnabled(true);
  	                      
  	                     // user.setPassword(passwordEncoder.encode(user.getPassword()));
  	
  	                       System.out.println("agreement"+agreement);
		                   System.out.println("User"+user);
  	 
  	    
                            User result = this.userrepo.save(user);
                            
    	                     model.addAttribute("User", new User() );
  		
    	              session.setAttribute("message", new Message("Successfully Registered", "alert-success"));
    	          		   
		        return "signup";
    	                      
  		     }
  		
  		catch (Exception e) {
			e.printStackTrace();
	        model.addAttribute("user", user);
		   session.setAttribute("message", new Message("something went wrong"+e.getMessage(), "alert-danger"));
		   return "signup";
		   
  		}
  		
  		
		
  		}   
     
}
	
