package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Plane;
import com.service.PlaneService;

@Controller
public class PlaneController {
	@Autowired
	PlaneService service;
	
	@RequestMapping("AddingOfPlanes")
	public ModelAndView planePage(@ModelAttribute("plane") Plane plane) {
		return new ModelAndView("AddingPlanes");
	}
	@RequestMapping("displayPlanes")
	public ModelAndView displayPlanes() {
		List<Plane> planeList=service.listPlanes();
		return new ModelAndView("DisplayPlanes","planeList",planeList);
	}
	
	@RequestMapping("updatePlane")
	public ModelAndView updatePlane(HttpServletRequest request) {
	     int planeNo = Integer.parseInt(request.getParameter("planeNo"));
         Plane plane = service.getPlane(planeNo);
         ModelAndView model = new ModelAndView("AddingPlanes");
         model.addObject("plane", plane);
         return model;
	}
	@RequestMapping("deletePlane")
	public ModelAndView deletePlane(HttpServletRequest request) {
		int planeNo=Integer.parseInt(request.getParameter("planeNo"));
		service.deletePlane(planeNo);
		ModelAndView modelAndView=new ModelAndView("DisplayPlanes");
		modelAndView.addObject("planeList",service.listPlanes());
		modelAndView.addObject("status","Deleted Successfully");
		return modelAndView;
	}
	@RequestMapping("allotHangar")
	public ModelAndView allothangar(@ModelAttribute("planenew") Plane planenew ) {
		service.setHangarID(planenew);
		return new ModelAndView("PlanesHangars","planeList",service.listPlanes());
	}
	@RequestMapping("deallotHangar")
	public ModelAndView deallotion(HttpServletRequest request) {
		int planeNo=Integer.parseInt(request.getParameter("planeNo"));
		service.deallotPlane(planeNo);
		return  new ModelAndView("PlanesHangars","planeList",service.listPlanes());
	}
	@RequestMapping("addPlanes")
	public ModelAndView addingPlanes(@Validated @ModelAttribute("plane") Plane plane, BindingResult result) {
		ModelAndView modelAndView=new ModelAndView("DisplayPlanes");
		if (result.hasErrors()) {
			return new ModelAndView("AddingPlanes");
		} else {
			if (plane.getPlaneNo()!=0) {
				service.updatePlane(plane);
				modelAndView.addObject("planeList",service.listPlanes());
				modelAndView.addObject("Result","Updated Successfully");
				return modelAndView;
			}
			else {
			try {
				service.savePlane(plane);
			modelAndView.addObject("planeList",service.listPlanes());
			modelAndView.addObject("Result","Added Successfully");
			return modelAndView;
			}
			catch(Exception e) {
				return new ModelAndView("AddingPlanes","Result","Could not add.");}
			}
		}
	}

}
