package com.te.springrestcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springrestcrud.Employee;
import com.te.springrestcrud.Service;

@RestController
public class ServiceController {
	@Autowired
	Service service;
	
	

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String add(@RequestBody Employee employee) {
		service.add(employee);
		return "data Added Successfully!!!!!";
	}

	@PostMapping(path = "/fetch", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee find(@RequestBody Employee employee) {
		Employee find = service.find(employee);
		return find;
	}

	@PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee update(@RequestBody Employee employee) {
		Employee find = service.update(employee);
		return find;
	}

	@PostMapping(path = "/remove",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String remove(@RequestBody Employee employee) {
		service.remove(employee);
		return "remove successfully";
	}
	
	@GetMapping( path = "/alldata",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> all() {
		List<Employee> all = service.all();
		return all;
	}
}
