package com.example.form.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.form.model.User;
import com.example.form.repository.IformRepo;



@Controller
public class Formcontroller {
	@Autowired
	IformRepo ifrepo;

	@GetMapping("/signin")
	public String showform(User user) {
		return "form";
		
	}
		@PostMapping("/update")
		public String addForm(@Valid User user, BindingResult result) {
			if (result.hasErrors()) {
				return "form";
			
			}
			ifrepo.save(user);
			
			return "success";
	}
	
	
}
