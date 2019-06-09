package com.niit.JewelleryBackend;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.JewelleryBackend.Dao.AuthenticationDao;

import com.niit.JewelleryBackend.Model.Authentication;


public class AuthenticationTest {
	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
//		  Authentication  auth = (Authentication )ctx.getBean("authentication");
//		  AuthenticationDao authDao= (AuthenticationDao)ctx.getBean("authenticationDao");
//		  auth.setRoleId("101");
//		  auth.setRole_Name("Authentication");
//		  auth.setUserName("abc");
//		  System.out.println("role Id:"+auth.getRoleId());
//		  System.out.println("role Name:"+auth.getRole_Name());
//		  System.out.println("role Name:"+auth.getUserName());
	  
//	  if(authDao.saveorupdate(auth)==true)
//	  {
//		  System.out.println("Authentication  saved");
//	  }
//	  else
//	  {
//		  System.out.println("Authentication not saved");
//	  }
	  
//	  auth = authDao.getAuthentication ("C101");
//	  if(auth==null)
//	  {
//		  System.out.println("Authentication  not found");
//		  
//	  }
//	  else
//	  {
//		  System.out.println("role Id: "+auth.getRoleId());
//		  System.out.println("role Name:"+auth.getRole_Name());
//		  System.out.println("role Name:"+auth.getUserName());
//	  }
	  
//	  auth = authDao.getAuthentication ("C101");
//	  if(auth==null)
//	  {
//		  System.out.println("Authentication  not found");
//		  
//	  }
//	  else if(authDao.delete(auth)==true)
//	  {
//		  System.out.println("Authentication  deleted");
//		  
//	  }
//	  else 
//	  {
//		  System.out.println("not deleted");
//	  
//	  }
	  
//	  List<Authentication > authenticationlist = authDao.authenticationlist();
//	  for(Authentication  c1 : authenticationlist)
//	  {
//		  System.out.println("role Id: "+c1.getRoleId());
//		  System.out.println("role_Name :"+c1.getRole_Name());
//		  System.out.println("role Name:"+c1.getUserName());
//		  
//	  }
//	  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	  



