package com.securespringapp.springsecurity.repository.custom;

import org.springframework.stereotype.Repository;

import com.securespringapp.springsecurity.model.Privilege;





@Repository
public interface IPrivilegeRepositoryCustom {
	
	String byName="select priv from Privilege priv where priv.privilege= :PName";
	public Privilege findByPrivilegeName(String name);
}
