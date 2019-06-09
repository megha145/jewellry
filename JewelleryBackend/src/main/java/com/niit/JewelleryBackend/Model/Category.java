package com.niit.JewelleryBackend.Model;



import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Category {
	
	@Id
	private String catId;
    private String catName;
    
    public Category() {
    	this.catId="cat"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	@OneToMany(mappedBy = "category")
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
}
