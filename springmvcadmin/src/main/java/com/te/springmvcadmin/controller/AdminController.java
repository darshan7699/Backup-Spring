package com.te.springmvcadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.springmvcadmin.Batch;
import com.te.springmvcadmin.Mentor;
import com.te.springmvcadmin.repo.Repo;

@Controller
public class AdminController {

	@Autowired
	Repo repo;

	@PostMapping("/login")
	public String log( @ModelAttribute Batch batch,ModelMap map) {
		List<Batch> list = repo.addData(batch);
		ModelMap attribute = map.addAttribute("batch2", list);
		return "batch";
	}

	@GetMapping("/addBatch")
	public String addBatch() {
		return "add";
	}

	@PostMapping("/adding")
	public String addData(@ModelAttribute Batch batch, ModelMap model) {
		List<Batch> list = repo.addData(batch);
		ModelMap attribute = model.addAttribute("batch2", list);
		return "batch";
	}

	@GetMapping("/edit")
	public String edit() {
		return "editpage";
	}

	@PostMapping("/editing")
	public String editing(@ModelAttribute Batch batch,ModelMap model) {
		repo.editData(batch);
		List<Batch> list = repo.addData(batch);
		ModelMap attribute = model.addAttribute("batch2", list);
		return "batch";
	}

	@GetMapping("/mentor")
	public String mentor() {
		return "addMetor";
	}

	@PostMapping("/mentoradd")
	public String mentorAdd(@ModelAttribute Mentor mentor, ModelMap modelMap) {
		List<Mentor> mentorAdd = repo.mentorAdd(mentor);
		modelMap.addAttribute("list", mentorAdd);
		return "mentorTable";
	}

	@GetMapping("/editMentor")
	public String editor() {
		return "editMentorPage";
	}

	@PostMapping("/editMentor")
	public String mentorEdit(@ModelAttribute Mentor mentor) {
		repo.mentorEdit(mentor);
		return "batch";
	}

	@GetMapping("/deleteMentor")
	public String deleteMentor() {
		return "deleteM";
	}

	@PostMapping("/deleteMentor")
	public String deleteM(@ModelAttribute Mentor mentor) {
		repo.deleteMentor(mentor);
		return "mentorTable";
	}

	@GetMapping("/delete")
	public String deleteBatch() {
		return "deleteBatch";
	}

	@PostMapping("/batchDelete")
	public String batchDelete(Batch batch, ModelMap model) {
		repo.deleteBatch(batch);
		List<Batch> list = repo.addData(batch);
		ModelMap attribute = model.addAttribute("list", list);
		return "mentorTable";
	}
}
