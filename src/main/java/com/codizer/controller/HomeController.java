package com.codizer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codizer.models.User;

@Controller
@RequestMapping
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String home(Model model, @RequestParam(defaultValue = "Adrian") String name) {
		model.addAttribute("name", name);
		return "home";
	}
	
	@RequestMapping("/admin")
	public String adminAll(Model model) {
	
		User user = new User(2, "adrianortizmartinez@gmail.com", "secret");
	
		model.addAttribute("user", user);
		return "admin";
	}

}
