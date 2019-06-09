package com.niit.JewelleryBackend.Dao;

import java.util.List;

import com.niit.JewelleryBackend.Model.CartItems;


public interface CartItemsDao {
    public boolean saveorupdate(CartItems cartItems);
    public boolean delete(CartItems cartItems);
    public CartItems getCartItems(String CartItemsId);
    public List<CartItems> cartitemslist();
    public List<CartItems> cartitemslist(String Id);
    public List<CartItems> getCartItemsByProductId(String productId);

    
}



