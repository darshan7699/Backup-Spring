package com.te.jpql;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JpqlMain {
@PostMapping("/wellcome")
	public String wellcome(@RequestParam String username,Model model) {
		return "updatepage";
	}

@PostMapping("/inbox")
public String inbox() {
	return "inbox";
}
}
