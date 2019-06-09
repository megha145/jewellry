package com.niit.JewelleryBackend.Model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class CartItems {
	@Id
	String CartItemsId;
	float price;
	@ManyToOne
	@JoinColumn(name="CartId")
	private Cart cart;	
	@OneToOne
	@JoinColumn(name="Id")
	private Product product;
 
	public CartItems()
	{
		this.CartItemsId="CARTITEMS"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getCartItemsId() {
		return CartItemsId;
	}
	public void setCartItemsId(String cartItemsId) {
		CartItemsId = cartItemsId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
