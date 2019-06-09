package com.niit.JewelleryBackend.Dao;

import java.util.List;


import com.niit.JewelleryBackend.Model.Shipping;

public interface ShippingDao {
    public boolean saveorupdate(Shipping shipping);
    public boolean delete(Shipping shipping);
    public Shipping getShipping(String ShipId);
    public List<Shipping> shippinglist();
    
}
