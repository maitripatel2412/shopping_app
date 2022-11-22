package com.shopping.shop.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table
public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int size;
	
	private int waight;
	
	@ManyToOne
	private Cart cart;
	
	private long ProductItemId;
	
	@CreationTimestamp
	private Timestamp creationTime;
	
	@UpdateTimestamp
	private Timestamp updationTime;
	
	@Column(name = "isDeleted",columnDefinition = "integer default 0")
	private int isDeleted;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWaight() {
		return waight;
	}

	public void setWaight(int waight) {
		this.waight = waight;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public long getProductItemId() {
		return ProductItemId;
	}

	public void setProductItemId(long productItemId) {
		ProductItemId = productItemId;
	}

	public Timestamp getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	public Timestamp getUpdationTime() {
		return updationTime;
	}

	public void setUpdationTime(Timestamp updationTime) {
		this.updationTime = updationTime;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public CartItem() {
		super();
	}

	public CartItem(long id, int size, int waight, Cart cart, long productItemId, Timestamp creationTime,
			Timestamp updationTime, int isDeleted) {
		super();
		this.id = id;
		this.size = size;
		this.waight = waight;
		this.cart = cart;
		ProductItemId = productItemId;
		this.creationTime = creationTime;
		this.updationTime = updationTime;
		this.isDeleted = isDeleted;
	}

	

	

	
	
	
}
