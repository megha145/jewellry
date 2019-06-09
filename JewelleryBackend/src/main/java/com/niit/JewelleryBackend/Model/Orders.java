package com.niit.JewelleryBackend.Model;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class Orders {
	@Id
	String orderId;
	double grandTotal;
	public Orders() {
    	this.orderId="order"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	
	@OneToOne
	@JoinColumn(name="billId")
	private Billing billing;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="shipId")
	private Shipping shipping;
	
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	@OneToOne
	@JoinColumn(name="uId")
	private Users users;
	
	public Billing getBilling() {
		return billing;
	}
	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	public Shipping getShipping() {
		return shipping;
	}
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public Users getUser() {
		return users;
	}
	public void setUser(Users users) {
		this.users = users;
	}
	public Pay getPay() {
		return pay;
	}
	public void setPay(Pay pay) {
		this.pay = pay;
	}
	public List<OrderItems> getOrderitems() {
		return orderitems;
	}
	public void setOrderitems(List<OrderItems> orderitems) {
		this.orderitems = orderitems;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Pay_Id")
	private Pay pay;
	
	@OneToMany(mappedBy="orders")
	private List<OrderItems> orderitems;


	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

}
