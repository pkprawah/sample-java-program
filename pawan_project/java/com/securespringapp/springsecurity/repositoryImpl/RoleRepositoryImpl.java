package com.securespringapp.springsecurity.repositoryImpl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.happiestminds.springsecurity.model.Privilege;
import com.happiestminds.springsecurity.model.Role;
import com.happiestminds.springsecurity.repository.custom.IRoleRepositoryCustom;

@Repository
public class RoleRepositoryImpl implements IRoleRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Role findByRoleName(String name) {
		Role role = null;
		try {
			Query query = entityManager.createQuery(byName);
			query.setParameter("rName", name);
			List results = query.getResultList();
			if (results.size() != 0) {
				Iterator stIterator = results.iterator();
				while (stIterator.hasNext()) {
					role= (Role) stIterator.next();
					System.out.print("Role name :::" + role.getRoleName());
					System.out.println();
				}
				return role;
			} else {
				System.out.println("Passing Role"+name+" is not found.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	
		return null;
	}

}
