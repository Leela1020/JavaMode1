package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping("SuccessAdmin")
	public ModelAndView adminHome() {
		return new ModelAndView("SuccessAdmin");
	}
	@RequestMapping("registerAdmin")
	public ModelAndView registerAdmin(@Validated @ModelAttribute("user") User user, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("RegisterAdmin");
		} else {
			User u = service.registerAdmin(user);
			return new ModelAndView("LoginAdmin", "ID", u.getAdminID());
		}
	}

	@RequestMapping("ManagerRegistration")
	public ModelAndView managerRegistrationPage(@ModelAttribute("user") User user) {
		return new ModelAndView("RegisterManager");
	}

	@RequestMapping("RequestApprover")
	public ModelAndView requestApproverPage() {
		List<User> userList = service.listManagerRequest();
		return new ModelAndView("RequestApprover", "userList", userList);
	}
	@RequestMapping("SuccessManager")
	public ModelAndView managerPage() {
		return new ModelAndView("SuccessManager");
	}

	@RequestMapping("registerManager")
	public ModelAndView registerManager(@Validated @ModelAttribute("user") User user, BindingResult result) {
		ModelAndView modelAndView=new ModelAndView("RegisterManager");
		if (result.hasErrors()) {
			modelAndView.addObject("result", "Couldn't place request");
			return modelAndView;
		} else {
			service.registerManager(user);
			modelAndView.addObject("result","Request placed. Wait for authentication");
			return modelAndView;
		}
	}
	
	@RequestMapping("approveRequest/{userId}")
	public ModelAndView approveRequest(@PathVariable int userId) {
		boolean status = service.approveManager(userId);
		ModelAndView modelAndView = new ModelAndView("redirect:/RequestApprover");
		modelAndView.addObject("userList", service.listManagerRequest());
		if (status == true) {
			modelAndView.addObject("result", "Approved Successfully");
			return modelAndView;
		} else {
			modelAndView.addObject("result", "Couldn't approve");
			return modelAndView;
		}
	}
	@RequestMapping("deleteRequest/{userId}")
	public ModelAndView deleteRequest(@PathVariable int userId) {
		boolean status=service.deleteManager(userId);
		ModelAndView modelAndView = new ModelAndView("redirect:/RequestApprover");
		modelAndView.addObject("userList", service.listManagerRequest());
		if (status == true) {
			modelAndView.addObject("result", "Deleted Successfully");
			return modelAndView;
		} else {
			modelAndView.addObject("result", "Couldn't delete");
			return modelAndView;
		}
	}

	@RequestMapping("AdminLogin")
	public ModelAndView adminLoginPage(@ModelAttribute("user") User user) {
		return new ModelAndView("LoginAdmin");
	}

	@RequestMapping("ManagerLogin")
	public ModelAndView managerLoginPage(@ModelAttribute("user") User user) {
		return new ModelAndView("LoginManager");
	}

	@RequestMapping("LoginAdmin")
	public ModelAndView loginAdmin(@ModelAttribute("user") User user, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("LoginAdmin");
		} else {
			try {
			String status = service.loginAdmin(user.getAdminID(), user.getPassword());
			return new ModelAndView("SuccessAdmin", "firstName", status);}
			catch(IndexOutOfBoundsException ide) {
				return new ModelAndView("LoginAdmin");
			}

		}
	}

	@RequestMapping("LoginManager")
	public ModelAndView loginManager(@ModelAttribute("user") User user, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("LoginManager");
		} else {
			try {
			String status = service.loginManager(user.getManagerID(), user.getPassword());
			return new ModelAndView("SuccessManager", "firstName", status);}
			catch(IndexOutOfBoundsException ide) {
				return new ModelAndView("LoginManager");
			}

		}
	}
	@RequestMapping("AdminRegistration")
	public ModelAndView registerAdminPage(@ModelAttribute("user") User user) {
		return new ModelAndView("RegisterAdmin");
	}

}
