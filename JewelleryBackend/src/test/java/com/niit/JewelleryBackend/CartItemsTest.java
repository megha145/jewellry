package com.niit.JewelleryBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.JewelleryBackend.Dao.CartItemsDao;

import com.niit.JewelleryBackend.Model.CartItems;


public class CartItemsTest {
	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
		  CartItems c  = ( CartItems )ctx.getBean("cartItems");
		  CartItemsDao cDao= (CartItemsDao)ctx.getBean("cartItemsDao");
		    c.setCartItemsId("101");
		
		    c.setPrice(2345);
		    
		 
		  System.out.println("CartItems:"+c.getCartItemsId());
		 
		  System.out.println("price:"+c.getPrice());
		 
		 
	  
	  if(cDao.saveorupdate(c)==true)
	  {
		  System.out.println("Cartitems saved");
	  }
	  else
	  {
		  System.out.println("Cartitems not saved");
	  }
	  
	  c = cDao.getCartItems("101");
	  if(c==null)
	  {
		  System.out.println("Cartitems not found");
		  
	  }
	  else
	  {

		  System.out.println("CartItems:"+c.getCartItemsId());
		 
		  System.out.println("price:"+c.getPrice());
		 
		 
	 }
	  
	  c = cDao.getCartItems("101");
	  if(c==null)
	  {
		  System.out.println("Cartitems not found");
		  
	  }
	  else if(cDao.delete(c)==true)
	  {
		  System.out.println(" deleted");
		  
	  }
	  else 
	  {
		  System.out.println("not deleted");
	  
	  }
	  
	  List<CartItems > cartitemslist = cDao.cartitemslist();
	  for(CartItems  c1 : cartitemslist)
	  {
		  System.out.println("CartItems:"+c.getCartItemsId());
			 
		  System.out.println("price:"+c.getPrice());
		 
	  }
	  }


}
