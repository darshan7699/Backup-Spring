package com.te.springrestcrud.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springrestcrud.Employee;

@Repository
public class EmpRepo {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("rest");
	EntityManager createEntityManager = factory.createEntityManager();
	EntityTransaction transaction = createEntityManager.getTransaction();

	public void add(Employee employee) {
		createEntityManager.persist(employee);
		transaction.begin();
		transaction.commit();
	}

	public Employee find(Employee employee) {
		Employee find = createEntityManager.find(Employee.class, employee.getId());
		return find;

	}

	public Employee update(Employee employee) {
		Employee find = createEntityManager.find(Employee.class, employee.getId());
		find.setDesignation(employee.getDesignation());
		find.setName(employee.getName());
		find.setSal(employee.getSal());
		// createEntityManager.persist(find);
		transaction.begin();
		transaction.commit();
		return find;

	}

	public void remove(Employee employee) {
		Employee find = createEntityManager.find(Employee.class, employee.getId());
		createEntityManager.remove(find);
		transaction.begin();
		transaction.commit();
	}

	public List<Employee> all() {
		String query = "from Employee";
		Query createQuery = createEntityManager.createQuery(query);
		List<Employee> list = createQuery.getResultList();
		return list;
	}

}
