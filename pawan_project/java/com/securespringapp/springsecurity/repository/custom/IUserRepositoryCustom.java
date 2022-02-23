package com.securespringapp.springsecurity.repository.custom;

import org.springframework.stereotype.Repository;
import com.securespringapp.springsecurity.model.User;

@Repository
public interface IUserRepositoryCustom {
    
	String byName="SELECT usr from User usr where usr.userName= :UserName";
	public User findByUserName(String userName);
}
