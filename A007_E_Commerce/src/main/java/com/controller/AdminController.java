package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Admin;
import com.model.Category;
import com.model.UserProfile;
import com.service.Adminservice;
import com.service.CategoryService;
import com.service.UserProfileService;

@Controller
public class AdminController {
	@Autowired
	UserProfileService userProfileService;
	@Autowired
	Adminservice adminservice;
	
	@RequestMapping("/adminuserlogin")
	public ModelAndView adminLogin() {
		ModelAndView model=new ModelAndView();
		model.addObject("loginprocess",new Admin());
		model.setViewName("adminlogin");
		return model;
	}
	@RequestMapping("/adminlogin")
	public ModelAndView adminlogin(@ModelAttribute("loginprocess") Admin a,HttpServletRequest req) {
		ModelAndView model=new ModelAndView();
		Admin admin=adminservice.validateUser(a);
		if(admin==null) {
			model.addObject("err","Invalid Credintials");
			model.setViewName("adminlogin");
		}else {
			HttpSession session=req.getSession();
			session.setAttribute("admin", admin.getUsername());
			model.setViewName("adminhome");
		}
		
		return model;
	}
	@RequestMapping("/adminLogout")
	public String adminlogout(HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		session.invalidate();
		return "redirect:adminuserlogin";
	}
	@RequestMapping("/adminuser")
	public ModelAndView adminUser() {
		ModelAndView model=new ModelAndView();
		model.addObject("data", userProfileService.getallUser());
		model.setViewName("adminuser");
		return model;
	}
	
	@RequestMapping("adminhome")
	public ModelAndView adminHome() {
		ModelAndView model=new ModelAndView();
		
		model.setViewName("adminhome");
		return model;
	}
}
