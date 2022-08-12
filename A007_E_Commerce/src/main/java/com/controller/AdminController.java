package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Category;
import com.model.UserProfile;
import com.service.CategoryService;
import com.service.UserProfileService;

@Controller
public class AdminController {
	@Autowired
	UserProfileService userProfileService;
	
	@RequestMapping("/adminlogin")
	public ModelAndView adminlogin() {
		ModelAndView model=new ModelAndView();
		model.setViewName("adminlogin");
		return model;
	}
	@RequestMapping("/adminuser")
	public ModelAndView adminUser() {
		ModelAndView model=new ModelAndView();
		model.addObject("data", userProfileService.getallUser());
		model.setViewName("adminuser");
		return model;
	}
	
	@RequestMapping("adminhome")
	public String adminHome() {
		return "adminhome";
	}
}
