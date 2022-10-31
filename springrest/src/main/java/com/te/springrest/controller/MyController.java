package com.te.springrest.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.springrest.entity.Employee;

@RestController
public class MyController {
	List<Employee> asList = Arrays.asList(new Employee(1, "darshan", "software engineer"),
			new Employee(10, "Anil", "null"), new Employee(3, "Vinayak", "database Engineer"),
			new Employee(4, "Mohit", "hard coder"));

	@GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee emp() {
		Employee employee = new Employee();
		employee.setDesignation("Associate Software Engineer");
		employee.setId(10);
		employee.setName("Darshan");
		return employee;
	}

	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee test(@RequestBody Employee employee) {
		System.out.println(employee);
		return employee;
	}

	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee get(@RequestParam String name,@RequestParam Integer id) {
		List<Employee> collect = asList.stream().filter(t->t.getName().equals(name)).collect(Collectors.toList());
		if(collect.get(0).getId()>id) {
		return collect.get(0);
	}
		return new Employee();
	}
}
