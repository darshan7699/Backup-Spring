package com.te.springmvc.retriving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
     @Autowired
	EmployeeRepo repo;
	
	public boolean empservice(Employee emp) {
		if(emp.getPassword().equals(emp.getConfirmpass())) {
			repo.save(emp);
			return true;
		}
		return false;
		
	}

	public Employee display(int id) {
		Employee employee = repo.display(id);
		return employee;
		
	}
	public void delete(Employee emp) {
		repo.delete(emp);
	}

	public void updatedata(Employee emp) {
     repo.updatedata(emp);		
	}
}
