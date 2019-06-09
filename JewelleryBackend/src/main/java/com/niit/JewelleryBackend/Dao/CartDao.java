package com.niit.JewelleryBackend.Dao;

import java.util.List;

import com.niit.JewelleryBackend.Model.Cart;



public interface CartDao {
    public boolean saveorupdate(Cart cart);
    public boolean delete(Cart cart);
    public Cart getCart(String CartId);
    public List<Cart> cartlist();
	
}
