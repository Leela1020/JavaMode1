package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Plane;
import com.service.PlaneService;
@Qualifier("planeController")
@Controller
public class PlaneController {
	@Autowired
	PlaneService service;
	@RequestMapping("addingPlanes")
	public ModelAndView addingPlanes(@Validated @ModelAttribute("plane") Plane plane,BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("AddingPlanes");
		}
		else {
			service.addingPlanes(plane);
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
