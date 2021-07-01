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

import com.model.Pilot;
import com.service.PilotService;

@Controller
public class PilotController {
    @Autowired
    PilotService service;
    
    @RequestMapping("AddingOfPilots")
    public ModelAndView pilotPage(@ModelAttribute("pilot") Pilot pilot) {
        return new ModelAndView("AddingPilots");
    }
    @RequestMapping("DisplayPilots")
    public ModelAndView displayPilots() {
        List<Pilot> pilotList=service.listPilots();
        return new ModelAndView("DisplayPilots","pilotList",pilotList);
    }
    
    @RequestMapping("updatePilot")
    public ModelAndView updatePilot(HttpServletRequest request) {
         int pilotNo = Integer.parseInt(request.getParameter("pilotNo"));
         Pilot pilot = service.getPilot(pilotNo);
         ModelAndView model = new ModelAndView("AddingPilots");
         model.addObject("pilot", pilot);
         return model;
    }
    @RequestMapping("deletePilot")
    public ModelAndView deletePilot(HttpServletRequest request) {
        int pilotNo=Integer.parseInt(request.getParameter("pilotNo"));
        service.deletePilot(pilotNo);
        ModelAndView modelAndView=new ModelAndView("DisplayPilots");
        modelAndView.addObject("pilotList",service.listPilots());
        modelAndView.addObject("status","Deleted Successfully");
        return modelAndView;
    }
    @RequestMapping("addPilot")
    public ModelAndView addingPlanes(@Validated @ModelAttribute("pilot") Pilot pilot, BindingResult result) {
        ModelAndView modelAndView=new ModelAndView("DisplayPilots");
        if (result.hasErrors()) {
            System.out.println("You missed something");
            return new ModelAndView("AddingPilots","status","Could not add.");
        } else {
            if (pilot.getPilotNo()!=0) {
                service.updatePilot(pilot);
                modelAndView.addObject("pilotList",service.listPilots());
                modelAndView.addObject("status","Updated Successfully");
                return modelAndView;
            }
            else {
            try {
                service.savePilot(pilot);
            modelAndView.addObject("pilotList",service.listPilots());
            modelAndView.addObject("status","Added Successfully");
            return modelAndView;
            }
            catch(Exception e) {
                return new ModelAndView("AddingPilots","status","Could not add.");}
            }
        }
    }

 

}
 


