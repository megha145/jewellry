package com.niit.JewelleryBackend.Model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class OrderItems{
	 @Id
	 String OrderItemId;
	 String ProductId;
	 public OrderItems() {
	    	this.OrderItemId="order"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}

		@ManyToOne
		@JoinColumn(name="orderId")
		private Orders orders; 
		
		@OneToMany
		private List<OrderItems>orderItems;
		
		@OneToOne
		@JoinColumn(name="userId")
		private Users users;
		
		@OneToOne
		@JoinColumn(name="payId")
		private Pay pay;
		
		@OneToOne
		@JoinColumn(name="ShipId")
		private Shipping shipping;
		
		@OneToOne
		@JoinColumn(name="billId")
		private Billing billing;
		

	public List<OrderItems> getOrderItems() {
			return orderItems;
		}
		public void setOrderItems(List<OrderItems> orderItems) {
			this.orderItems = orderItems;
		}
		public Users getUsers() {
			return users;
		}
		public void setUsers(Users users) {
			this.users = users;
		}
		public Pay getPay() {
			return pay;
		}
		public void setPay(Pay pay) {
			this.pay = pay;
		}
		public Shipping getShipping() {
			return shipping;
		}
		public void setShipping(Shipping shipping) {
			this.shipping = shipping;
		}
		public Billing getBilling() {
			return billing;
		}
		public void setBilling(Billing billing) {
			this.billing = billing;
		}
	public String getOrderItemId() {
		return OrderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		OrderItemId = orderItemId;
	}
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	
}
