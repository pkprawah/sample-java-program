package com.securespringapp.springsecurity.servicesImpl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.happiestminds.springsecurity.model.CustomUserDetails;
import com.happiestminds.springsecurity.model.User;
import com.happiestminds.springsecurity.repository.IUserRepository;
import com.happiestminds.springsecurity.services.CustomeUserDetailsService;

import ch.qos.logback.core.net.SyslogOutputStream;

@Transactional
@Service
public class CustomeUserDetailsServiceImpl implements CustomeUserDetailsService,UserDetailsService {

	@Autowired
	IUserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user=userRepository.findByUserName(userName);
		System.out.println("fetching user details is ::"+user);
		 if (user == null) {
		            throw new UsernameNotFoundException(String.format("User %s does not exist!", userName));
		        }

		
		return new CustomUserDetails(user);
	}

	@Override
	public User loadUserByEmails(String emails) {
	    // TODO Auto-generated method stub
	    return null;
	}

	

}
