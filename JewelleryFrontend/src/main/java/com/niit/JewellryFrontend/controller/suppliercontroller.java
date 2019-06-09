package com.niit.JewellryFrontend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.JewelleryBackend.Model.Product;
import com.niit.JewelleryBackend.Model.Supplier;
import com.niit.JewelleryBackend.Dao.SupplierDao;




@Controller
public class suppliercontroller {
 @Autowired
 Supplier supplier ;
 @Autowired
 SupplierDao supplierDao ;
 @RequestMapping("/supplier")
 public ModelAndView Supplier()
 {
	 ModelAndView mv = new ModelAndView();
	 List<Supplier> supplierlist = supplierDao.supplierlist();
	 mv.addObject("supplier", new Supplier());
	 mv.addObject("Supplieries", supplierlist);
	 mv.setViewName("supplier");
	 
	 return mv;
 }
 @RequestMapping("/addsup")
 public ModelAndView addSupplier(@ModelAttribute("supplier") Supplier  supplier)
 {
	 ModelAndView mv = new ModelAndView();
	 if(supplierDao.saveorupdate(supplier)==true)
	 {
		 mv.addObject("msg","saved");
		 System.out.println("supplier saved");
	 }
		 else
		 {
			 mv.addObject("msg","not saved");
			 System.out.println("supplier not saved");
			 
		 }
	 mv.setViewName("redirect:/supplier");
	return mv;
	 }
 @RequestMapping("/editSupplier/{Id}")
	public ModelAndView editSupplier(@PathVariable("Id") String Id) {
		ModelAndView mv = new ModelAndView();
		supplier=supplierDao.getSupplier(Id);
		mv.addObject("supplier", supplier);
		List<Supplier> Suppliers = supplierDao.supplierlist();
		mv.addObject("Supplier", Suppliers);
		mv.setViewName("supplier");
		return mv;

	}
 @RequestMapping("/deleteSupplier/{Id}")
	public ModelAndView deleteSupplier(@PathVariable("Id") String Id) {
		ModelAndView mv = new ModelAndView();
		supplier = supplierDao.getSupplier(Id);
		if (supplierDao.delete(supplier) == true) {
			System.out.println("supplier Deleted");
			mv.addObject("msg", "supplier Deleted");
		} else {
			System.out.println("Not Deleted ");
			mv.addObject("msg", "supplier not Deleted");

		}
		mv.setViewName("redirect:/supplier");

		return mv;

	}
 }


