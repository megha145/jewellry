package com.niit.JewelleryBackend.Dao;

import java.util.List;

import com.niit.JewelleryBackend.Model.OrderItems;



public interface OrderItemsDao {
    public boolean saveorupdate(OrderItems orderItems);
    public boolean delete(OrderItems orderItems);
    public OrderItems getOrderItems(String OrderItemsId);
    public List<OrderItems> orderitemslist();
    
}