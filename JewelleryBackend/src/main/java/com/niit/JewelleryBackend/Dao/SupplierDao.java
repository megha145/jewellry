package com.niit.JewelleryBackend.Dao;

import java.util.List;

import com.niit.JewelleryBackend.Model.Supplier;



public interface SupplierDao {
	public boolean saveorupdate(Supplier supplier);
    public boolean delete(Supplier supplier);
    public Supplier getSupplier (String Id);
    public List<Supplier> supplierlist();
    
}
