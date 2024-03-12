package com.itb.mif3an.academicologinmif3an.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.mif3an.academicologinmif3an.model.Usuario;


@Controller
@RequestMapping("/academico")
public class AuthController {
	
	
	@GetMapping("/registration")
	public String showRegistrationForm(Usuario usuario, Model model) {
		
		model.addAttribute("user", usuario);
		
		return "registration";
		
	}
	
	@GetMapping("/login")
	public String login(Usuario usuario, Model model) {
		
		
		
		return "login";
	}
	

	
}
