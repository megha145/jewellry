package com.niit.JewelleryBackend.Model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.h2.engine.User;
import org.springframework.stereotype.Component;
@Entity
@Table
@Component


public class Shipping {
	@Id
	String  shipId;
	
	private String  shipName;
	private String  shipCity;
	private String  shipState;
	private String  shipPhoneNo;
	private String  email;
	private String  companyName;
	private String  CountryName;
	private String  ZipCode;
	
	 public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	
	public Shipping() {
	    	this.shipId="ship"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}
	@ManyToOne
	@JoinColumn(name="userId")
	private Users users;


	public String getShipId() {
		return shipId;
	}
	public void setShipId(String shipId) {
		this.shipId = shipId;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getShipCity() {
		return shipCity;
	}
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}
	public String getShipState() {
		return shipState;
	}
	public void setShipState(String shipState) {
		this.shipState = shipState;
	}
	public String getShipPhoneNo() {
		return shipPhoneNo;
	}
	public void setShipPhoneNo(String shipPhoneNo) {
		this.shipPhoneNo = shipPhoneNo;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
}
