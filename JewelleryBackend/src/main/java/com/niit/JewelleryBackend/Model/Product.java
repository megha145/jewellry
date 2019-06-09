package com.niit.JewelleryBackend.Model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component


public class Product {
	@Id
	private String Id;
	private String Name;
	private float Price ;
	private int Quantity;
	private String description;
	
	@Transient
	private MultipartFile pimg;
	
	public Product() {
    	this.Id="prod"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	public MultipartFile getPimg() {
		return pimg;
	}
	public void setPimg(MultipartFile pimg) {
		this.pimg = pimg;
	}
	
	@ManyToOne
	@JoinColumn(name="catId")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="supplierId")
	private Supplier supplier;

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
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	
	

}
