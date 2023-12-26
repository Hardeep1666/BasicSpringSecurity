package com.basicSecurityExample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basicSecurityExample.Entity.User;
import com.basicSecurityExample.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User> getallusers() {
		return userService.getAlluser();	
	}
	
	@PostMapping("/add")
	public User adduser(@RequestBody User user) {
		this.userService.adduser(user);
		return user;
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username")  String username){
		return this.userService.getUser(username);
		
	}
}
