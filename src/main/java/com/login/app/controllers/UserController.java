package com.login.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.app.models.User;
import com.login.app.service.UserService;




@Controller

public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String landingPage() {
		return "index";
	}
	
	
	
	@PostMapping("/signup")
	public String getSignup(@ModelAttribute User user) {
		System.out.println(user);
userService.userSignup(user);
		return "hello";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute User user) {
		
	User usr=	userService.userLogin(user.email, user.password);
	System.out.println(usr);
	if(usr!=null) {
		return "welcome";
	}
	else {
		
		return"error";
	}
		
	}

}
