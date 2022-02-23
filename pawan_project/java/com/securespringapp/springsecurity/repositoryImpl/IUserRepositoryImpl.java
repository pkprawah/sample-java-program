package com.securespringapp.springsecurity.repositoryImpl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.securespringapp.springsecurity.model.Privilege;
import com.securespringapp.springsecurity.model.User;
import com.securespringapp.springsecurity.repository.custom.IPrivilegeRepositoryCustom;
import com.securespringapp.springsecurity.repository.custom.IUserRepositoryCustom;

@Repository
public class IUserRepositoryImpl implements IUserRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public User findByUserName(String userName) {
		User user = null;
		try {
			Query query = entityManager.createQuery(byName);
			query.setParameter("UserName", userName);
			List results = query.getResultList();
			if (results.size() != 0) {
				Iterator stIterator = results.iterator();
				while (stIterator.hasNext()) {
					user= (User)stIterator.next();
					System.out.print("UserName is :" + user.getUserName());
					System.out.println();
				}
				return user;
			} else {
				System.out.println("Record not found.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	
		return null;
	}

	
}
