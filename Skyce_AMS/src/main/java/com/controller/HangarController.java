package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Hangar;
import com.model.Plane;
import com.service.HangarService;
import com.service.PlaneService;

@Controller
public class HangarController {
	@Autowired
	HangarService service;
	@Autowired
	PlaneService plservice;
	@RequestMapping("AddingHangars")
	public ModelAndView addHangarPage(@ModelAttribute("hangar") Hangar hangar) {
		return new ModelAndView("AddingHangars");
	}
	
	@RequestMapping("deleteHangar")
    public ModelAndView deletePilot(HttpServletRequest request) {
        int hangarNo=Integer.parseInt(request.getParameter("hangarNo"));
        service.deleteHangar(hangarNo);
        ModelAndView modelAndView=new ModelAndView("DisplayHangars");
        modelAndView.addObject("hangarList",service.listHangars());
        modelAndView.addObject("status","Deleted Successfully");
        return modelAndView;
    }
	@RequestMapping("AllotHangar")
	public ModelAndView allotHangarsPage(@ModelAttribute("planenew")Plane plane) {
		ModelAndView modelAndView=new ModelAndView("AllotHangars");
		List<Hangar> hangarList=service.getAvailableHangars();
		modelAndView.addObject("planeList", plservice.getAvailablePlanes());
		modelAndView.addObject("hangarList",hangarList);
		return modelAndView;
	}
	@RequestMapping("PlanesHangars")
	public ModelAndView planehangars() {
		return new ModelAndView("PlanesHangars","planeList",plservice.listPlanes());
	}
	@RequestMapping("setAvailability")
		public ModelAndView setAvail(HttpServletRequest request) {
			int hangarNo=Integer.parseInt(request.getParameter("hangarNo"));
			Hangar hangar=service.getHangar(hangarNo);
			int sent=Integer.parseInt(request.getParameter("sent"));
			service.setAvailability(hangar, sent);
			return new ModelAndView("DisplayManagerHangars","hangarList",service.listHangars());
		}
	@RequestMapping("addHangar")
	public ModelAndView addHangar(@ModelAttribute("hangar") Hangar hangar,BindingResult result) {
		ModelAndView modelAndView=new ModelAndView("DisplayHangars");
		if (result.hasErrors()) {
			return new ModelAndView("AddingHangars");
		} else {
			if (hangar.getHangarNo()!=0) {
				service.updateHangar(hangar);
				modelAndView.addObject("hangarList",service.listHangars());
				modelAndView.addObject("Result","Updated Successfully");
				return modelAndView;
			}
			else {
			try {
				service.addHangar(hangar);
			modelAndView.addObject("hangarList",service.listHangars());
			modelAndView.addObject("Result","Added Successfully");
			return modelAndView;
			}
			catch(Exception e) {
				return new ModelAndView("AddingHangars","Result","Could not add.");}
			}}
		}
	@RequestMapping("DisplayManagerHangars")
	public ModelAndView displayManagerHangars() {
		 List<Hangar> hangarList=service.listHangars();
	        return new ModelAndView("DisplayManagerHangars","hangarList",hangarList);
	}
	@RequestMapping("updateHangar")
	public ModelAndView updatePlane(HttpServletRequest request) {
	     int hangarNo = Integer.parseInt(request.getParameter("hangarNo"));
         Hangar hangar = service.getHangar(hangarNo);
         ModelAndView model = new ModelAndView("AddingHangars");
         model.addObject("hangar", hangar);
         return model;
	}
	@RequestMapping("DisplayHangars")
    public ModelAndView displayPilots() {
        List<Hangar> hangarList=service.listHangars();
        return new ModelAndView("DisplayHangars","hangarList",hangarList);
    }
}