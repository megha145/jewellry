package com.niit.JewelleryBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.JewelleryBackend.Dao.ProductDao;

import com.niit.JewelleryBackend.Model.Product;


public class ProductTest {
	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
		  Product c  = ( Product)ctx.getBean("product");
		  ProductDao cDao= (ProductDao)ctx.getBean("productDao");
		    c.setDescription("");
		    c.setQuantity(2345);
		    c.setId("2345");
		    c.setName("2345");
		    c.setPrice(2345);
		    
		   
		 
		      System.out.println(" Description:"+c.getDescription());
			  System.out.println("Quantity:"+c.getQuantity());
			  System.out.println("id:"+c.getId());
			  System.out.println("name:"+c.getName());
			  System.out.println("Price:"+c.getPrice());
			 
	  
	  if(cDao.saveorupdate(c)==true)
	  {
		  System.out.println("Product saved");
	  }
	  else
	  {
		  System.out.println("Product not saved");
	  }
	  
	  c = cDao.getProduct("101");
	  if(c==null)
	  {
		  System.out.println("Product not found");
		  
	  }
	  else
	  {

		  


	      System.out.println(" Description:"+c.getDescription());
		  System.out.println("Quantity:"+c.getQuantity());
		  System.out.println("id:"+c.getId());
		  System.out.println("name:"+c.getName());
		  System.out.println("Price:"+c.getPrice());
		 
  
		 
	 }
	  
	  c = cDao.getProduct("101");
	  if(c==null)
	  {
		  System.out.println("Product not found");
		  
	  }
	  else if(cDao.delete(c)==true)
	  {
		  System.out.println(" deleted");
		  
	  }
	  else 
	  {
		  System.out.println("not deleted");
	  
	  }
	  
	  List<Product> productlist = cDao.productlist();
	  for(Product  c1 : productlist)
	  {


	      System.out.println(" Description:"+c.getDescription());
		  System.out.println("Quantity:"+c.getQuantity());
		  System.out.println("id:"+c.getId());
		  System.out.println("name:"+c.getName());
		  System.out.println("Price:"+c.getPrice());
		 
  
	  }
	  }


}
