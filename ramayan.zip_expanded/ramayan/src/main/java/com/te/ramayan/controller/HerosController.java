package com.te.ramayan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.ramayan.entity.Heros;
import com.te.ramayan.servi.HerosInterface;


@RestController
public class HerosController {

	@Autowired
	HerosInterface herosInterface;
	
	@PostMapping("/save")
	public Heros save(@RequestBody Heros heros) {
	 Heros save = herosInterface.save(heros);
	 return save;
	}
	
	@GetMapping("/findby")
	public Heros findby(@RequestParam String name) {
		Heros findby = herosInterface.findby(name);
		return findby;
		
	}
}
