package com.securespringapp.springsecurity.repository.custom;

import org.springframework.stereotype.Repository;
import com.securespringapp.springsecurity.model.Role;

@Repository
public interface IRoleRepositoryCustom {

	
	String byName="select r from Role r where r.roleName= :rName";
	public Role findByRoleName(String name);
}
