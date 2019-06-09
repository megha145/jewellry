
package com.niit.JewellryFrontend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.JewelleryBackend.Dao.CategoryDao;
import com.niit.JewelleryBackend.Dao.ProductDao;
import com.niit.JewelleryBackend.Dao.SupplierDao;
import com.niit.JewelleryBackend.Model.Category;
import com.niit.JewelleryBackend.Model.Product;
import com.niit.JewelleryBackend.Model.Supplier;
import com.niit.JewellryFrontend.FileInput.FileInput;







@Controller
public class product1controller {
 @Autowired
 Product product ;
 @Autowired
 ProductDao productDao ;
 @Autowired
 Category category;
 @Autowired
 CategoryDao categoryDao;
 @Autowired
 Supplier supplier;
 @Autowired
 SupplierDao supplierDao;
 
 String path = "C:\\Users\\megha\\eclipse-workspace\\JewelleryFrontend\\src\\main\\webapp\\resources\\images\\";
 @RequestMapping("/Product1")
 public ModelAndView Product1()
 {
	 ModelAndView mv = new ModelAndView();
	 List<Category> categorylist=categoryDao.categorylist();
	 mv.addObject("category", new Category());
	 mv.addObject("categories", categorylist);
	 List<Supplier> supplierlist=supplierDao.supplierlist();
	 mv.addObject("supplier", new Supplier());
	 mv.addObject("suppliers", supplierlist);
	 List<Product> product1list = productDao.productlist();
	 mv.addObject("product", new Product());
	 mv.addObject("Products", product1list);
	 mv.setViewName("product1");
	 
	 return mv;
 }
 @RequestMapping(value="/addprod",method=RequestMethod.POST)
 public ModelAndView addProduct(@ModelAttribute("product") Product  product)
 {
	 ModelAndView mv = new ModelAndView("redirect:/Product1");
	 FileInput.upload(path,product.getPimg(),product.getId()+".jpg");
	 if(productDao.saveorupdate(product)==true)
	 {

		 System.out.println("product1 saved");
	 }
		 else
		 {
			 mv.addObject("msg","not saved");
			 System.out.println("product1 not saved");
			 
		 }
	 System.out.println(1234);
//	 mv.setViewName();
	return mv;
	 }
 @RequestMapping("/editProduct1/{Id}")
	public ModelAndView editproduct1(@PathVariable("Id") String Id) {
		ModelAndView mv = new ModelAndView();
		product=productDao.getProduct(Id);
		mv.addObject("product", product);
		List<Product> Products = productDao.productlist();
		mv.addObject("Product", Products);
		mv.setViewName("product1");
		return mv;

	}
 @RequestMapping("/deleteProduct1/{Id}")
	public ModelAndView deleteProduct1(@PathVariable("Id") String Id) {
		ModelAndView mv = new ModelAndView();
		product = productDao.getProduct(Id);
		if (productDao.delete(product) == true) {
			System.out.println("product Deleted");
			mv.addObject("msg", "product Deleted");
		} else {
			System.out.println("Not Deleted ");
			mv.addObject("msg", "product not Deleted");

		}
		mv.setViewName("redirect:/product1");

		return mv;

	}
 
 
 @RequestMapping("/product")
 public String product(Model model)
 {
	 List<Category> categories=categoryDao.categorylist();
		model.addAttribute("categories",categories);
		List<Product> products=productDao.productlist();
		model.addAttribute("products",products);
		System.out.println(products);
		return "product";	
 }
 @RequestMapping(value="/product/{id}")
 public String getProductByCat(@PathVariable("id")String id,Model model)
 {
	 List<Category> categories=categoryDao.categorylist();
		model.addAttribute("categories",categories);
	 List<Product> products=productDao.getProductsById(id);
		model.addAttribute("products",products);
		return "product";
 }
 
 }


