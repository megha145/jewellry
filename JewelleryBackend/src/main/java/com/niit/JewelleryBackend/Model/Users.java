package com.niit.JewelleryBackend.Model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component


public class Users {
	@javax.persistence.Id
	 private String Id;
	 private String Name;
	 private String Address;
	 private String PhoneNo;
	 private String EmailId;
	 private String Password;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="roleId")
	private Authentication authentication;
	public Users() {
	    	this.Id="user"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cartId")
	public Cart cart;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="billId")
	public Billing billing;
	
	public Cart getCart() {
		return cart;
	}
	
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Billing getBilling() {
		return billing;
	}
	public void setBilling(Billing billing) {
		this.billing = billing;
	}
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}
	

}
