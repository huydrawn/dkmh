package com.example.dkmh.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dkmh.model.user.User;
import com.example.dkmh.service.UserServiceIml;

@Controller
public class ControllerWeb {
	@Autowired
	UserServiceIml user ;
	@GetMapping("/")
	public String homePage() {
		return "unlog/homePage";
	}
	@GetMapping("/register")
	public String register(Model m) {
		m.addAttribute("newUser", new User());
		return "unlog/register";
	}
	@PostMapping("/handleRegister")
	public String handleRegister( @Valid @ModelAttribute("newUser") User u ,  BindingResult br) {
		if(br.hasErrors()) {
			return "redirect:/register";
		}
		else {
			user.saveUser(u);
			return "redirect:/";
		}
	}
}
