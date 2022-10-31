package com.te.springmvctask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.springmvctask.EmployeePrimary_Info;
import com.te.springmvctask.repo.EmployeeRepo;

@Controller
public class EmpController {
	
	  @Autowired
	 EmployeeRepo repo;
	
	@GetMapping("/employee")
	public String primaryInfo() {
		return "primaryInfo";
	}
  @PostMapping("/second")
  public String storePrimary(@ModelAttribute EmployeePrimary_Info  emp) {
	  repo.store(emp);
	  return "";
  }
}
