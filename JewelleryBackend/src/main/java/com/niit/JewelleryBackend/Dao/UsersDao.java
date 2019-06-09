package com.niit.JewelleryBackend.Dao;

import java.util.List;

import com.niit.JewelleryBackend.Model.Users;



public interface UsersDao {
	public boolean saveorupdate( Users  users);
    public boolean delete( Users  users);
    public  Users getUsers(String Id);
    public  Users getUsersbyemail(String Id);
    public List <Users>  userslist();
    
	public Users isValid(String umail, String pwd);
    
}
