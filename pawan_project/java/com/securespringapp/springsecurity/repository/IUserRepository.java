package com.securespringapp.springsecurity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.securespringapp.springsecurity.model.User;
import com.securespringapp.springsecurity.repository.custom.IUserRepositoryCustom;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> ,IUserRepositoryCustom {

}
