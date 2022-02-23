package com.securespringapp.springsecurity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happiestminds.springsecurity.model.Privilege;
import com.happiestminds.springsecurity.repository.custom.IPrivilegeRepositoryCustom;


@Repository
public interface IPrivilegeRepository extends JpaRepository<Privilege, Long>,IPrivilegeRepositoryCustom {

}
