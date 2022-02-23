package com.securespringapp.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.securespringapp.springsecurity.model.UserLoginDTO;
import com.securespringapp.springsecurity.utility.APIResponse;

@RestController
@RequestMapping("/rest")
public class LoginController {
	
    @RequestMapping(value = "/", method = RequestMethod.POST)
	public String test(){
		System.out.println("welcome to spring security");
		String testMessage="test to spring";
		return testMessage;
	}
    
    	@PreAuthorize("hasAnyRole('ADMIN')")
	@PostMapping("/secure/login")
	public APIResponse secureLogin(@RequestBody UserLoginDTO login){
    	    
		return null;
	}
	
	
	
}
