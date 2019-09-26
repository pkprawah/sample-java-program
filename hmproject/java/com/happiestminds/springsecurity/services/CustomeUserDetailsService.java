package com.happiestminds.springsecurity.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.happiestminds.springsecurity.services.custom.ICustomeUserDetailsService;

public interface CustomeUserDetailsService extends ICustomeUserDetailsService,UserDetailsService {
    
}
