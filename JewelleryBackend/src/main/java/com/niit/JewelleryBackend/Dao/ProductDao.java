package com.niit.JewelleryBackend.Dao;

import java.util.List;

import com.niit.JewelleryBackend.Model.Product;

public interface ProductDao {
	
	
	    public boolean saveorupdate(Product product);
	    public boolean delete(Product product);
	    public Product getProduct(String Id);
	    public List<Product> productlist();
	    public List<Product> getProductsById(String catId);
	    public List<Product> getProductsBySupplierId(String supplierId);

}
