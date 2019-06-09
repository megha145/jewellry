package com.niit.JewelleryBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.JewelleryBackend.Dao.OrderItemsDao;

import com.niit.JewelleryBackend.Model.OrderItems;


public class OrderItemsTest {

	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
		  OrderItems c  = (OrderItems)ctx.getBean("orderItems");
		  OrderItemsDao cDao= (OrderItemsDao)ctx.getBean("orderItemsDao");
		    c.setOrderItemId("101");
		
		    c.setProductId("2345");
		    
		 
		  System.out.println("OrderId:"+c.getOrderItemId());
		 
		  System.out.println("grandTotal:"+c.getProductId());
		 
		 
	  
	  if(cDao.saveorupdate(c)==true)
	  {
		  System.out.println("Orderitems saved");
	  }
	  else
	  {
		  System.out.println("Orderitemss not saved");
	  }
	  
	  c = cDao.getOrderItems("101");
	  if(c==null)
	  {
		  System.out.println("Orders not found");
		  
	  }
	  else
	  {

		  System.out.println("OrderId:"+c.getOrderItemId());
		 
		  System.out.println("grandTotal:"+c.getProductId());
		 
		 
		 
	 }
	  
	  c = cDao.getOrderItems("101");
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
	  
	  List<OrderItems > orderitemslist = cDao.orderitemslist();
	  for(OrderItems  c1 : orderitemslist)
	  {

		  System.out.println("OrderId:"+c.getOrderItemId());
		 
		  System.out.println("grandTotal:"+c.getProductId());
		 
		 
	  }
	  }


}
