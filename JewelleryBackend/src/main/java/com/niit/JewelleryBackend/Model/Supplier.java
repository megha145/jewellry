package com.niit.JewelleryBackend.Model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component


public class Supplier {
	@Id
	private String Id;
	private String Name;
	private String EmailId;
	private String Address;
	 
	public Supplier() {
	    	this.Id="sup"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}
	
	@OneToMany(mappedBy="supplier")
	private List<Product> product;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
}
