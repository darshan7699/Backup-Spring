package com.te.springmvctask.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.springmvctask.EmployeePrimary_Info;

@Repository
public class EmployeeRepo {
	

	public void store(EmployeePrimary_Info emp) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primaryInfo");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(emp);
		transaction.begin();
		transaction.commit();
		
	}
}
