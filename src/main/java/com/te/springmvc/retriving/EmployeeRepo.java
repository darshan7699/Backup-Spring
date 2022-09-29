package com.te.springmvc.retriving;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Parser;
import com.mysql.cj.Session;
import com.mysql.cj.x.protobuf.MysqlxCrud.Find;
@Repository
public class EmployeeRepo {

	
	
	public void save(Employee emp) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
	
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(emp);
		transaction.begin();
		transaction.commit();
		
	}

	public Employee display(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
        Employee employee = manager.find(Employee.class,id);
		return employee;
		
	}
	
	public void delete(Employee emp) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		Employee find = manager.find(Employee.class,emp.getId());
		manager.remove(find);
		EntityTransaction transaction = manager.getTransaction();
		
	    transaction.begin();
	    transaction.commit();
	    
		
	}

	public void updatedata(Employee emp) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
        Employee employee = manager.find(Employee.class,emp.getId());
       // System.out.println(employee);
        employee.setName(emp.getName());
        employee.setSal(emp.getSal());
        employee.setDesignation(emp.getDesignation());
        manager.persist(employee);
        transaction.begin();
        transaction.commit();
		//return employee;
		    
		
	}
}
