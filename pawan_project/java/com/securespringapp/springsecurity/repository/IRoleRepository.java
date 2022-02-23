package com.securespringapp.springsecurity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.securespringapp.springsecurity.model.Role;
import com.securespringapp.springsecurity.repository.custom.IRoleRepositoryCustom;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>,IRoleRepositoryCustom {
    
}
