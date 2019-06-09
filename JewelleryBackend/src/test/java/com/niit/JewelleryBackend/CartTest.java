package com.niit.JewelleryBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.JewelleryBackend.Dao.CartDao;

import com.niit.JewelleryBackend.Model.Cart;

public class CartTest {
	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
		  Cart c  = ( Cart )ctx.getBean("cart");
		  CartDao cDao= (CartDao)ctx.getBean("cartDao");
		    c.setCartId("101");
		
		    c.setGrandTotal(2345);
		    c.setTotalItems(5);
		    
		 
		  System.out.println("billCity:"+c.getCartId());
		 
		  System.out.println("billName:"+c.getGrandTotal());
		  System.out.println("billPhoneNo:"+c.getTotalItems());
		 
	  
	  if(cDao.saveorupdate(c)==true)
	  {
		  System.out.println("Cart saved");
	  }
	  else
	  {
		  System.out.println("Cart not saved");
	  }
	  
	  c = cDao.getCart("101");
	  if(c==null)
	  {
		  System.out.println("Cart not found");
		  
	  }
	  else
	  {
		  System.out.println("billCity:"+c.getCartId());
			 
		  System.out.println("billName:"+c.getGrandTotal());
		  System.out.println("billPhoneNo:"+c.getTotalItems());
	 }
	  
	  c = cDao.getCart("101");
	  if(c==null)
	  {
		  System.out.println("Cart not found");
		  
	  }
	  else if(cDao.delete(c)==true)
	  {
		  System.out.println(" deleted");
		  
	  }
	  else 
	  {
		  System.out.println("not deleted");
	  
	  }
	  
	  List<Cart > cartlist = cDao.cartlist();
	  for(Cart  c1 : cartlist)
	  {
		  System.out.println("billCity:"+c.getCartId());
			 
		  System.out.println("billName:"+c.getGrandTotal());
		  System.out.println("billPhoneNo:"+c.getTotalItems());
	  }
	  }

}
