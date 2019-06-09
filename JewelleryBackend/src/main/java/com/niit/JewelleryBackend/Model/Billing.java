package com.niit.JewelleryBackend.Model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Billing {
	@Id
	 String billId;
	 String  billName;
	 String  billCity;
	 String  billState;
	 String  billPhoneNo;
	 public Billing() {
	    	this.billId="bill"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}
	 
	 @OneToOne
	 @JoinColumn(name = "userId")
	 private Users users;
	 
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public String getBillCity() {
		return billCity;
	}
	public void setBillCity(String billCity) {
		this.billCity = billCity;
	}
	public String getBillState() {
		return billState;
	}
	public void setBillState(String billState) {
		this.billState = billState;
	}
	public String getBillPhoneNo() {
		return billPhoneNo;
	}
	public void setBillPhoneNo(String billPhoneNo) {
		this.billPhoneNo = billPhoneNo;
	}

}
