package com.te.springrestcrud;

import java.util.List;

public interface Service {

	void add(Employee employee);

	Employee find(Employee employee);

	Employee update(Employee employee);

	void remove(Employee employee);

	List<Employee> all();

}
