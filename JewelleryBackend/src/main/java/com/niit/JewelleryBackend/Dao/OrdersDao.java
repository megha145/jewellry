package com.niit.JewelleryBackend.Dao;

import java.util.List;


import com.niit.JewelleryBackend.Model.Orders;

public interface OrdersDao {
    public boolean saveorupdate(Orders orders);
    public boolean delete(Orders orders);
    public Orders getOrders(String OrderId);
    public List<Orders> orderslist();
    
}