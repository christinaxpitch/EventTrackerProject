package com.skilldistillery.cc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.cc.services.UserService;

@RequestMapping("api")
@RestController
public class UserController {
	
	@Autowired
	private UserService svc;
	
	@GetMapping("ping")
	public String ping() {
		return "pong!";
	}
	

}