package com.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.model.Category;
import com.model.Product;
import com.service.CategoryService;
import com.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
	@RequestMapping("/admincate")
	public ModelAndView adminCat() {
		ModelAndView model=new ModelAndView();
		model.addObject("catAdd", new Category());
		model.addObject("data", categoryService.getallCat());
		model.setViewName("admincat");
		return model;
	}

	@RequestMapping(value = "/cat_add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("catAdd") Category cat) {
		categoryService.addOrUpdateCat(cat);
		categoryService.getallCat();
		return "redirect:admincate";
	}
	@RequestMapping("updatecat")
	public ModelAndView updateCat(@RequestParam("uid") int uid) {
		ModelAndView model=new ModelAndView();
		model.addObject("catAdd",categoryService.getById(uid));
		model.addObject("data", categoryService.getallCat());
		model.setViewName("admincat");
		return model;
	}
	@RequestMapping("deletecat")
	public ModelAndView deleteCat(@RequestParam("uid") int uid) {
		ModelAndView model=new ModelAndView();
		categoryService.deleteCat(uid);
		model.setViewName("redirect:admincate");
		return model;
	}
	//************product*********//
	@RequestMapping("/adminProd")
	public ModelAndView products() {
		ModelAndView model=new ModelAndView();
		model.addObject("product",new Product());
		model.addObject("categories", categoryService.getallCat());
		model.addObject("products", productService.getallProduct());
		model.setViewName("adminproduct");
		return model;
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute("product")Product product,@RequestParam("catid") int id,@RequestParam CommonsMultipartFile file, HttpSession session) {
		//String path=session.getServletContext().getRealPath("/");
		String path="D:\\Laxman_DoNot_Delete\\Java\\A007_E_Commerce\\src\\main\\webapp\\WEB-INF\\user\\img\\products";
		String filepath=path+File.separator+file.getOriginalFilename();
		System.out.println(filepath);
		byte b[]=file.getBytes();
		
		try {
			FileOutputStream fos=new FileOutputStream(new File(filepath));
			fos.write(b);
			fos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Category cat=categoryService.getById(id);
		product.setImage(file.getOriginalFilename());
		System.out.println(file.getOriginalFilename());
		product.setCategory(cat);
		productService.addOrUpdateProduct(product);
		ModelAndView model=new ModelAndView();
		model.setViewName("redirect:adminProd");
		return model;
	}
	@RequestMapping("updateProduct")
	public ModelAndView updateProduct(@RequestParam("uid") int uid) {
		ModelAndView model=new ModelAndView();
		model.addObject("product",productService.getProductById(uid));
		model.addObject("categories", categoryService.getallCat());
		model.addObject("products", productService.getallProduct());
		model.setViewName("adminproduct");
		return model;
	}
	@RequestMapping("deleteProduct")
	public ModelAndView deleteProduct(@RequestParam("uid") int uid) {
		ModelAndView model=new ModelAndView();
		productService.deleteProduct(uid);
		model.setViewName("redirect:adminProd");
		return model;
	}
}
