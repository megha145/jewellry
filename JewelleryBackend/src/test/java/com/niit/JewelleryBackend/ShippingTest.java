package com.niit.JewelleryBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.JewelleryBackend.Dao.ShippingDao;

import com.niit.JewelleryBackend.Model.Shipping;

public class ShippingTest {
	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
	     	Shipping c  = ( Shipping )ctx.getBean("shipping");
	     	ShippingDao cDao= (ShippingDao)ctx.getBean("shippingDao");
		    c.setShipCity("101");
		    c.setShipId("2345");
		    c.setShipName("2345");
		    c.setShipPhoneNo("2345");
		    c.setShipState("2345");
		 
		  System.out.println("shipcity:"+c.getShipCity());
		  System.out.println("shipId:"+c.getShipId());
		  System.out.println("shipname:"+c.getShipName());
		  System.out.println("shipphoneno:"+c.getShipPhoneNo());
		  System.out.println("shipstate:"+c.getShipState());
		 
		 
	  
	  if(cDao.saveorupdate(c)==true)
	  {
		  System.out.println("Shipping saved");
	  }
	  else
	  {
		  System.out.println("Shipping not saved");
	  }
	  
	  c = cDao.getShipping("101");
	  if(c==null)
	  {
		  System.out.println("Shipping not found");
		  
	  }
	  else
	  {

		  System.out.println("shipcity:"+c.getShipCity());
		  System.out.println("shipId:"+c.getShipId());
		  System.out.println("shipname:"+c.getShipName());
		  System.out.println("shipphoneno:"+c.getShipPhoneNo());
		  System.out.println("shipstate:"+c.getShipState());
		 
		 
		 
	 }
	  
	  c = cDao.getShipping("101");
	  if(c==null)
	  {
		  System.out.println(" Shipping not found");
		  
	  }
	  else if(cDao.delete(c)==true)
	  {
		  System.out.println(" deleted");
		  
	  }
	  else 
	  {
		  System.out.println("not deleted");
	  
	  }
	  
	  List<Shipping > shippinglist = cDao.shippinglist();
	  for(Shipping  c1 : shippinglist)
	  {

		  System.out.println("shipcity:"+c.getShipCity());
		  System.out.println("shipId:"+c.getShipId());
		  System.out.println("shipname:"+c.getShipName());
		  System.out.println("shipphoneno:"+c.getShipPhoneNo());
		  System.out.println("shipstate:"+c.getShipState());
		 
		 
	  }
	  }


}
