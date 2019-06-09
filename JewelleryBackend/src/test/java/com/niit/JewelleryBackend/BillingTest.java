package com.niit.JewelleryBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.JewelleryBackend.Dao.BillingDao;

import com.niit.JewelleryBackend.Model.Billing;

    public class BillingTest {
	public static void main (String args[]) {
		  
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		  ctx.scan("com.niit.*");
		  ctx.refresh();
		  
		  //Category c = new Category();
		   Billing b  = ( Billing )ctx.getBean("billing");
		   BillingDao bDao= ( BillingDao)ctx.getBean("billingDao");
		    b.setBillCity("bangalore");
		    b.setBillId("101");
		    b.setBillName("abc");
		    b.setBillPhoneNo("1234566");
		    b.setBillState("Karnataka");
		 
		  System.out.println("billCity:"+b.getBillCity());
		  System.out.println("billId:"+b.getBillId());
		  System.out.println("billName:"+b.getBillName());
		  System.out.println("billPhoneNo:"+b.getBillPhoneNo());
		  System.out.println("billState:"+b.getBillState());
	  
	  if(bDao.saveorupdate(b)==true)
	  {
		  System.out.println("billing  saved");
	  }
	  else
	  {
		  System.out.println("billing not saved");
	  }
	  
	  b = bDao.getBilling ("101");
	  if(b==null)
	  {
		  System.out.println("billing not found");
		  
	  }
	  else
	  {
		  System.out.println("billCity:"+b.getBillCity());
		  System.out.println("billId:"+b.getBillId());
		  System.out.println("billName:"+b.getBillName());
		  System.out.println("billPhoneNo:"+b.getBillPhoneNo());
		  System.out.println("billState:"+b.getBillState());
	  }
	  
	  b = bDao.getBilling("101");
	  if(b==null)
	  {
		  System.out.println("billing not found");
		  
	  }
	  else if(bDao.delete(b)==true)
	  {
		  System.out.println(" deleted");
		  
	  }
	  else 
	  {
		  System.out.println("not deleted");
	  
	  }
	  
	  List<Billing > billinglist = bDao.billinglist();
	  for(Billing  c1 : billinglist)
	  {
		  System.out.println("billCity:"+c1.getBillCity());
		  System.out.println("billId:"+c1.getBillId());
		  System.out.println("billName:"+c1.getBillName());
		  System.out.println("billPhoneNo:"+c1.getBillPhoneNo());
		  System.out.println("billState:"+c1.getBillState());
		  
	  }
	  }
}
