package com.niit.JewelleryBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.JewelleryBackend.Dao.SupplierDao;

import com.niit.JewelleryBackend.Model.Supplier;

public class SupplierTest {
	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
		  Supplier c  = ( Supplier)ctx.getBean("supplier");
		  SupplierDao cDao= (SupplierDao)ctx.getBean("supplierDao");
		    c.setAddress("101");
		    c.setEmailId("2345");
		    c.setId("2345");
		    c.setName("2345");
		   
		 
		      System.out.println(" address:"+c.getAddress());
			  System.out.println("emailId:"+c.getEmailId());
			  System.out.println("id:"+c.getId());
			  System.out.println("name:"+c.getName());
			 
	  
	  if(cDao.saveorupdate(c)==true)
	  {
		  System.out.println("Supplier saved");
	  }
	  else
	  {
		  System.out.println("Supplier not saved");
	  }
	  
	  c = cDao.getSupplier("101");
	  if(c==null)
	  {
		  System.out.println("Supplier not found");
		  
	  }
	  else
	  {

		  
		  System.out.println(" address:"+c.getAddress());
		  System.out.println("emailId:"+c.getEmailId());
		  System.out.println("id:"+c.getId());
		  System.out.println("name:"+c.getName());
		 
		 
		 
	 }
	  
	  c = cDao.getSupplier("101");
	  if(c==null)
	  {
		  System.out.println(" Supplier not found");
		  
	  }
	  else if(cDao.delete(c)==true)
	  {
		  System.out.println(" deleted");
		  
	  }
	  else 
	  {
		  System.out.println("not deleted");
	  
	  }
	  
	  List<Supplier> supplierlist = cDao.supplierlist();
	  for(Supplier  c1 : supplierlist)
	  {

		  System.out.println(" address:"+c.getAddress());
		  System.out.println("emailId:"+c.getEmailId());
		  System.out.println("id:"+c.getId());
		  System.out.println("name:"+c.getName());
		 
		 
	  }
	  }


}
