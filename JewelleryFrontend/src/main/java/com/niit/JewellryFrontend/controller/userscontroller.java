package com.niit.JewellryFrontend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.JewelleryBackend.Dao.UsersDao;
import com.niit.JewelleryBackend.Model.Authentication;
import com.niit.JewelleryBackend.Model.Billing;
import com.niit.JewelleryBackend.Model.Cart;
import com.niit.JewelleryBackend.Model.Users;







@Controller
public class userscontroller {
 @Autowired
 Users users ;
 @Autowired
 UsersDao usersDao ;
 @RequestMapping("/users")
 public ModelAndView users()
 {
	 System.out.println("1234"+1111);
	 ModelAndView mv = new ModelAndView("users");
	// List<Users> userslist =usersDao.userslist();
	 mv.addObject("users", new Users());
	// mv.addObject("Users", userslist);
	 
	 return mv;
 }
 @RequestMapping(value="/adduser" , method=RequestMethod.POST)
 public ModelAndView addCategory(@ModelAttribute("users") Users  users ,Model model)
 {
	 ModelAndView mv = new ModelAndView();
	 Authentication a = new Authentication();
		a.setUserName(users.getEmailId());
		users.setAuthentication(a);
		Cart cart= new Cart();
		users.setCart(cart);
//		Billing bill = new Billing();
//		users.setBilling(bill);
	 
	 
	 if(usersDao.saveorupdate(users)==true)
	 {
		 mv.addObject("msg","saved");
		 System.out.println("users saved");
	 }
		 else
		 {
			 mv.addObject("msg","not saved");
			 System.out.println("users not saved");
			 
		 }
	 mv.setViewName("redirect:/users");
	return mv;
	 }
 }



