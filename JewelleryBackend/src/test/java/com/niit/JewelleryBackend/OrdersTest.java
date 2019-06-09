package com.niit.JewelleryBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.JewelleryBackend.Dao.OrdersDao;

import com.niit.JewelleryBackend.Model.Orders;

public class OrdersTest {

	
	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
		  Orders c  = ( Orders )ctx.getBean("orders");
		  OrdersDao cDao= (OrdersDao)ctx.getBean("ordersDao");
		    c.setOrderId("101");
		
		    c.setGrandTotal(2345);
		    
		 
		  System.out.println("OrderId:"+c.getOrderId());
		 
		  System.out.println("grandTotal:"+c.getGrandTotal());
		 
		 
	  
	  if(cDao.saveorupdate(c)==true)
	  {
		  System.out.println("Orders saved");
	  }
	  else
	  {
		  System.out.println("Orders not saved");
	  }
	  
	  c = cDao.getOrders("32");
	  if(c==null)
	  {
		  System.out.println("Orders not found");
		  
	  }
	  else
	  {
		  System.out.println("OrderId:"+c.getOrderId());
			 
		  System.out.println("grandTotal:"+c.getGrandTotal());
		 
		 
	 }
	  
	  c = cDao.getOrders("101");
	  if(c==null)
	  {
		  System.out.println("orders not found");
		  
	  }
	  else if(cDao.delete(c)==true)
	  {
		  System.out.println(" deleted");
		  
	  }
	  else 
	  {
		  System.out.println("not deleted");
	  
	  }
	  
	  List<Orders > orderslist = cDao.orderslist();
	  for(Orders  c1 : orderslist)
	  {
		  System.out.println("OrderId:"+c.getOrderId());
			 
		  System.out.println("grandTotal:"+c.getGrandTotal());
		 
	  }
	  }

}
