package com.niit.JewellryFrontend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.JewelleryBackend.Dao.CategoryDao;
import com.niit.JewelleryBackend.Model.Category;

@Controller
public class categorycontroller {
 @Autowired
 Category category ;
 @Autowired
 CategoryDao categoryDao ;
 @RequestMapping("/Category")
 public ModelAndView Category()
 {
	 ModelAndView mv = new ModelAndView();
	 List<Category> categorylist = categoryDao.categorylist();
	 mv.addObject("category", new Category());
	 mv.addObject("Categories", categorylist);
	 mv.setViewName("category");
	 
	 return mv;
 }
 @RequestMapping("/addcat")
 public ModelAndView addCategory(@ModelAttribute("category") Category category)
 {
	 ModelAndView mv = new ModelAndView();
	 if(categoryDao.saveorupdate(category)==true)
	 {
		 mv.addObject("msg","saved");
		 System.out.println("category saved");
	 }
		 else
		 {
			 mv.addObject("msg","not saved");
			 System.out.println("category not saved");
			 
		 }
	 mv.setViewName("redirect:/Category");
	return mv;
	 }
 @RequestMapping("/editCategory/{catId}")
	public ModelAndView editCategory(@PathVariable("catId") String catId) {
		ModelAndView mv = new ModelAndView();
		category=categoryDao.getCategory(catId);
		mv.addObject("category", category);
		List<Category> Categories = categoryDao.categorylist();
		mv.addObject("Catgeories", Categories);
		mv.setViewName("category");
		return mv;

	}
 @RequestMapping("/deleteCategory/{catId}")
	public ModelAndView deleteCategory(@PathVariable("catId") String catId) {
		ModelAndView mv = new ModelAndView();
		category = categoryDao.getCategory(catId);
		if (categoryDao.delete(category) == true) {
			System.out.println("Category Deleted");
			mv.addObject("msg", "Category Deleted");
		} else {
			System.out.println("Not Deleted ");
			mv.addObject("msg", "Category not Deleted");

		}
		mv.setViewName("redirect:/Category");

		return mv;

	}
 }


