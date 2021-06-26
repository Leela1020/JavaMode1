package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	@RequestMapping("registerAdmin")
	public ModelAndView registerAdmin(@Validated @ModelAttribute("user") User user,BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("RegisterAdmin");
		}
		else {
			service.registerAdmin(user);
		return new ModelAndView("Success");}
	}
	@RequestMapping("Registration")
	public ModelAndView registration() {
		return new ModelAndView("Registration");
	}
	@RequestMapping("AdminRegistration")
	public ModelAndView welcomePage(@ModelAttribute("user") User user) {
		return new ModelAndView("RegisterAdmin");
	}
	
	

}
