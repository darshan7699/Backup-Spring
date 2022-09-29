package com.te.springmvc.retriving;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService source;

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/registerstore")
	public String regist(@ModelAttribute Employee emp) {
		boolean b = source.empservice(emp);
		if (b) {
			return "sucess";
		}
		return "failed";
	}

	@GetMapping("/search")
	public String search() {
		return "search";
	}

	@PostMapping("/display")
	public String display(@RequestParam String id, Model model) {
		Employee employee = source.display(Integer.parseInt(id));
		Model attribute = model.addAttribute("id", employee);
		if (employee != null) {
			return "outputid";
		}
		return "error";

	}

	@GetMapping("/delete")
	public String delete() {
		return "delete";

	}

	@PostMapping("/remove")
	public String remove(@ModelAttribute Employee emp) {
		source.delete(emp);
		return "removes";
	}
     @GetMapping("/updatepage")
     public String update() {
		return "updatepage";
    	 
     }
     
     @PostMapping("/update")
     public String updatedata(@ModelAttribute Employee emp) {
    	 source.updatedata(emp);
    	 return "result";
     }
}
