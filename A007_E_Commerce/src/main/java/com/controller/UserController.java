package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping("/home")
	public ModelAndView homepage() {
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
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public ModelAndView verify(@ModelAttribute("userlog") UserProfile u,HttpServletRequest req) {
		ModelAndView model=new ModelAndView();
		UserProfile userProfile =userProfileService.loginCheck(u);
		if(userProfile==null) {
			model.addObject("error","Invalid Username Or Password!");
			model.setViewName("login");
		}else {
			HttpSession session =req.getSession();
			session.setAttribute("user", userProfile.getFirstName());
			session.setAttribute("userid", userProfile.getUserId());
			model.setViewName("redirect:home");
		}
		return model;
	}
	@RequestMapping("/userLogout")
	public String logout(HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		session.invalidate();
		return "redirect:home";
	}
	@RequestMapping("/userReg")
	public ModelAndView userReg() {
		ModelAndView model=new ModelAndView();
		model.addObject("userProfile",new UserProfile());
		model.setViewName("registration");
		return model;
	}
	@RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	public ModelAndView addUser(@Valid @ModelAttribute("userProfile") UserProfile p,BindingResult b) {
		ModelAndView model=new ModelAndView();
		model.setViewName("registration");
		if(b.hasErrors()) {
			return model;
		}else {
			userProfileService.addOrUpdateUser(p);
			model.addObject("msg","Registration Successfull..");
			return model;
		}
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
	//********shopcart*******
	@RequestMapping("/shopcart")
	public String shopcart() {
		return "shopcart";
	}
	@RequestMapping("/addcart")
	public String addToCart(@RequestParam("pid") int pid,HttpServletRequest req) {
		System.out.println("product id is: "+pid);
		HttpSession session=req.getSession();
		int uid=(int) session.getAttribute("userid");
		System.out.println("user id is: "+uid);
		return "shopcart";
	}
}
