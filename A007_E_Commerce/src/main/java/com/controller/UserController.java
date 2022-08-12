package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.UserProfile;
import com.service.CategoryService;
import com.service.ProductService;
import com.service.UserProfileService;

@Controller
public class UserController {
	@Autowired
	UserProfileService userProfileService;
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView model=new ModelAndView();
		model.addObject("categories",categoryService.getallCat());
		model.addObject("products",productService.getallProduct());
		model.setViewName("index");
		return model;
	}
	@RequestMapping("/userLogin")
	public ModelAndView userLogin() {
		ModelAndView model=new ModelAndView();
		model.addObject("userlog",new UserProfile());
		model.setViewName("login");
		return model;
	}
	@RequestMapping("/userReg")
	public ModelAndView userReg() {
		ModelAndView model=new ModelAndView();
		model.addObject("userProfile",new UserProfile());
		model.setViewName("registration");
		return model;
	}
	@RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("userProfile") UserProfile p) {
		userProfileService.addOrUpdateUser(p);
		return "registration";
	}
	@RequestMapping("/products")
	public ModelAndView products() {
		ModelAndView model=new ModelAndView();
		model.addObject("categories",categoryService.getallCat());
		model.addObject("products",productService.getallProduct());
		model.setViewName("product");
		return model;
	}
	@RequestMapping("/blog")
	public ModelAndView blog() {
		ModelAndView model=new ModelAndView();
		model.setViewName("blog_list");
		return model;
	}
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView model=new ModelAndView();
		model.setViewName("contact");
		return model;
	}
}
