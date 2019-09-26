package com.happiestminds.springsecurity.services.custom;

import com.happiestminds.springsecurity.model.User;

public interface ICustomeUserDetailsService {

    public User loadUserByEmails(String emails);
}
