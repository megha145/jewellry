package com.niit.JewelleryBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.JewelleryBackend.Dao.PayDao;
import com.niit.JewelleryBackend.Model.Pay;


public class PayTest {
	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
	     	Pay c  = ( Pay )ctx.getBean("pay");
	     	PayDao cDao= (PayDao)ctx.getBean("payDao");
		    c.setPayId("101");
		    c.setPayStatus("2345");
		    c.setPayMethod("2345");
		    
		 
		  System.out.println("OrderId:"+c.getPayId());
		  System.out.println("grandTotal:"+c.getPayMethod());
		  System.out.println("grandTotal:"+c.getPayStatus());
		 
		 
	  
	  if(cDao.saveorupdate(c)==true)
	  {
		  System.out.println("pay saved");
	  }
	  else
	  {
		  System.out.println("pay not saved");
	  }
	  
	  c = cDao.getPay("101");
	  if(c==null)
	  {
		  System.out.println("pay not found");
		  
	  }
	  else
	  {

		  System.out.println("OrderId:"+c.getPayId());
		  System.out.println("grandTotal:"+c.getPayMethod());
		  System.out.println("grandTotal:"+c.getPayStatus());
		 
		 
		 
	 }
	  
	  c = cDao.getPay("101");
	  if(c==null)
	  {
		  System.out.println("pay not found");
		  
	  }
	  else if(cDao.delete(c)==true)
	  {
		  System.out.println(" deleted");
		  
	  }
	  else 
	  {
		  System.out.println("not deleted");
	  
	  }
	  
	  List<Pay > paylist = cDao.paylist();
	  for(Pay  c1 : paylist)
	  {

		  System.out.println("OrderId:"+c.getPayId());
		  System.out.println("grandTotal:"+c.getPayMethod());
		  System.out.println("grandTotal:"+c.getPayStatus());
		 
		 
	  }
	  }


}
