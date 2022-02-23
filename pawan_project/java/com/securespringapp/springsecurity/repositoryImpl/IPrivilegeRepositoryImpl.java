package com.securespringapp.springsecurity.repositoryImpl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.happiestminds.springsecurity.model.Privilege;
import com.happiestminds.springsecurity.repository.custom.IPrivilegeRepositoryCustom;

@Repository
public class IPrivilegeRepositoryImpl implements IPrivilegeRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Privilege findByPrivilegeName(String name) {
		Privilege privilege = null;
		try {
			Query query = entityManager.createQuery(byName);
			query.setParameter("PName", name);
			List results = query.getResultList();
			if (results.size() != 0) {
				Iterator stIterator = results.iterator();
				while (stIterator.hasNext()) {
					privilege= (Privilege) stIterator.next();
					System.out.print("sname:" + privilege.getPrivilege());
					System.out.println();
				}
				return privilege;
			} else {
				System.out.println("Record not found.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	
		return null;
	}

}
