package com.te.mvcpractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.mvcpractice.Employee;
import com.te.mvcpractice.repo.EmpRepo;

@Service
public class EmpService {

	
	@Autowired
	EmpRepo repo;
	
	public void add(Employee employee) {
    repo.add(employee);		
	}

}
