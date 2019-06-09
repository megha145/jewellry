package com.niit.JewelleryBackend.Dao;

import java.util.List;

import com.niit.JewelleryBackend.Model.Pay;


public interface PayDao {
    public boolean saveorupdate(Pay pay);
    public boolean delete(Pay pay);
    public Pay getPay(String payId);
    public List<Pay> paylist();
    
}
