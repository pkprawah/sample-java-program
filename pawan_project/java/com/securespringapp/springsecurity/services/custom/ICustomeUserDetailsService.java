package com.securespringapp.springsecurity.services.custom;

import com.securespringapp.springsecurity.model.User;

public interface ICustomeUserDetailsService {

    public User loadUserByEmails(String emails);
}
