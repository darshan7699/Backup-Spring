package com.te.springrestcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.springrestcrud.Employee;
import com.te.springrestcrud.Service;
import com.te.springrestcrud.repo.EmpRepo;

@org.springframework.stereotype.Service

public class EmployeeService implements Service {
	
	@Autowired
	EmpRepo repo;

	@Override
	public void add(Employee employee) {
		repo.add(employee);
	}

	@Override
	public Employee find(Employee employee) {
        Employee find = repo.find(employee);
        return find;
	}

	@Override
	public Employee update(Employee employee) {
         Employee find = repo.update(employee);
		return find;
	}

	@Override
	public void remove(Employee employee) {
           repo.remove(employee);		
	}

	@Override
	public List<Employee> all() {
        List<Employee> all = repo.all();	
        return all;
	}

}
