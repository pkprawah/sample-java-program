package com.happiestminds.springsecurity.repository.custom;

import org.springframework.stereotype.Repository;

import com.happiestminds.springsecurity.model.Privilege;





@Repository
public interface IPrivilegeRepositoryCustom {
	
	String byName="select priv from Privilege priv where priv.privilege= :PName";
	public Privilege findByPrivilegeName(String name);
}
