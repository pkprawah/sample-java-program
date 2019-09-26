package com.happiestminds.springsecurity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happiestminds.springsecurity.model.User;
import com.happiestminds.springsecurity.repository.custom.IUserRepositoryCustom;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> ,IUserRepositoryCustom {

}
