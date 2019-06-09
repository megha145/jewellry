package com.niit.JewelleryBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.JewelleryBackend.Dao.UsersDao;

import com.niit.JewelleryBackend.Model.Users;

public class UsersTest {
	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
		  Users c  = ( Users)ctx.getBean("users");
		  UsersDao cDao= (UsersDao)ctx.getBean("usersDao");
		    c.setAddress("101");
		    c.setEmailId("2345");
		    c.setId("2345");
		    c.setName("2345");
		    c.setPassword("2345");
		    c.setPhoneNo("2345");
		   
		 
		      System.out.println(" address:"+c.getAddress());
			  System.out.println("emailId:"+c.getEmailId());
			  System.out.println("id:"+c.getId());
			  System.out.println("name:"+c.getName());
			  System.out.println("password:"+c.getPassword());
			  System.out.println("Phoneno:"+c.getPhoneNo());
	  
	  if(cDao.saveorupdate(c)==true)
	  {
		  System.out.println("users saved");
	  }
	  else
	  {
		  System.out.println("users not saved");
	  }
	  
	  c = cDao.getUsers("101");
	  if(c==null)
	  {
		  System.out.println("users not found");
		  
	  }
	  else
	  {

		  

	      System.out.println(" address:"+c.getAddress());
		  System.out.println("emailId:"+c.getEmailId());
		  System.out.println("id:"+c.getId());
		  System.out.println("name:"+c.getName());
		  System.out.println("password:"+c.getPassword());
		  System.out.println("Phoneno:"+c.getPhoneNo());
  
		 
		 
	 }
	  
	  c = cDao.getUsers("101");
	  if(c==null)
	  {
		  System.out.println("users not found");
		  
	  }
	  else if(cDao.delete(c)==true)
	  {
		  System.out.println(" deleted");
		  
	  }
	  else 
	  {
		  System.out.println("not deleted");
	  
	  }
	  
	  List<Users> userslist = cDao.userslist();
	  for(Users  c1 : userslist)
	  {


	      System.out.println(" address:"+c.getAddress());
		  System.out.println("emailId:"+c.getEmailId());
		  System.out.println("id:"+c.getId());
		  System.out.println("name:"+c.getName());
		  System.out.println("password:"+c.getPassword());
		  System.out.println("Phoneno:"+c.getPhoneNo());
  
	  }
	  }

}
