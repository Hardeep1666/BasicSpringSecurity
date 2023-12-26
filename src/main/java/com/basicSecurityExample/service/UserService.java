package com.basicSecurityExample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.basicSecurityExample.Entity.User;

@Service	
public class UserService {

List<User> users= new ArrayList<>();
	
	public UserService() {
		users.add(new User("hardeep", "abc", "hardeep@gmail.com"));
		users.add(new User("hemant", "abc", "hemant@gmail.com"));
		users.add(new User("shreyas", "abc", "shreyas@gmail.com"));
		
	}
	
	

	public User adduser(User user) {
		 this.users.add(user);
		 return user;
	}


	public List<User> getAlluser() {
		return this.users;
	}



	public User getUser(String username) {
		return this.users.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
		
	
}
}
