/*package com.smartcontat.configration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.smartcontat.dao.UserRepo;
import com.smartcontat.entities.User;

public class UserDetailsServiceImpl implements UserDetailsService {
         @Autowired
	    private UserRepo userrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userrepo.getUserByname(username);
		if(user==null) {
		 throw new  UsernameNotFoundException ("could not fount username");
		
	   }
		CustomUserDetails customUserDetails=new CustomUserDetails(user);
		
		return customUserDetails;
		
 }
}*/
