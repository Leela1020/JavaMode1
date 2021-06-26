package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Plane;
import com.model.User;
import com.service.PlaneServiceIntf;
import com.service.UserServiceIntf;

@Controller
public class MainController {
	@Autowired
	UserServiceIntf user_service;
	@RequestMapping("registerAdmin")
	public ModelAndView registerAdmin(@Validated @ModelAttribute("user") User user,BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("RegisterAdmin");
		}
		else {
			user_service.registerAdmin(user);
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
	
	
	@Autowired
	PlaneServiceIntf plane_service;
	@RequestMapping("addingPlanes")
	public ModelAndView addingPlanes(@Validated @ModelAttribute("plane") Plane plane,BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("AddingPlanes");
		}
		else {
			plane_service.addingPlanes(plane);
		return new ModelAndView("PlaneSuccess");
		}
	}
	/* @RequestMapping("AddPlanes")
	public ModelAndView addPlanes() {
		return new ModelAndView("AddPlanes");
	} */
	
	@RequestMapping("AddingOfPlanes")
	public ModelAndView welcomePage(@ModelAttribute("plane") Plane plane) {
		return new ModelAndView("AddingPlanes");
	}
	

}
