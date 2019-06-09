package com.niit.JewelleryBackend.Dao;

import java.util.List;

import com.niit.JewelleryBackend.Model.Category;


public interface CategoryDao {
      public boolean saveorupdate(Category category);
      public boolean delete(Category category);
      public Category getCategory(String catId);
      public List<Category> categorylist();
      
}
