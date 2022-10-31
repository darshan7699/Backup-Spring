package com.te.mvcpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.mvcpractice.Employee;
import com.te.mvcpractice.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService service;

	@GetMapping("/register")
	private String add() {
		return "add";
	}
	@PostMapping("/dataadd")
	public String create(@ModelAttribute Employee employee) {
		service.add(employee);
		return null;
		
	}
}
