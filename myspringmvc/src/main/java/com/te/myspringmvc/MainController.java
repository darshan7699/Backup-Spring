package com.te.myspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	//@RequestMapping(value ="/register",method = RequestMethod.GET)
	@GetMapping("/register")
	public String reg() {
		return "/WEB-INF/view/register.jsp";
	}
	@GetMapping("/logIn")
	public String logIn() {
		return"/WEB-INF/view/logIn.jsp";
	}
	@PostMapping("/home")
	public String home() {
		return "/WEB-INF/view/home.jsp";
		
	}

}
