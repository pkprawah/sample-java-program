package com.securespringapp.springsecurity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happiestminds.springsecurity.model.Role;
import com.happiestminds.springsecurity.repository.custom.IRoleRepositoryCustom;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>,IRoleRepositoryCustom {
    
}
