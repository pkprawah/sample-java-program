package com.securespringapp.springsecurity.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.securespringapp.springsecurity.services.custom.ICustomeUserDetailsService;

public interface CustomeUserDetailsService extends ICustomeUserDetailsService,UserDetailsService {
    
}
