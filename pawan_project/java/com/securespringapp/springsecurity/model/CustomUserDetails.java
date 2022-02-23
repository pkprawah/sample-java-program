package com.securespringapp.springsecurity.model;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails extends User implements UserDetails {

	public CustomUserDetails(final User user) {
	    
		super(user);
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> roleList =getRoles()
			.stream()
				.map(role ->new SimpleGrantedAuthority("ROLE_"+role.getRoleName())
				).collect(Collectors.toList());
		
		System.out.println("Role list ::"+roleList);
		return roleList;
	}

	@Override
	public String getPassword() {
	    System.out.println("password  ::"+super.getPassword());
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		
		return super.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

	
	
}
