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
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private int price;
	
	private String size;
	
	private int waight;
	
	@ManyToOne
	private Orders orders;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getWaight() {
		return waight;
	}

	public void setWaight(int waight) {
		this.waight = waight;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
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

	public OrderItem() {
		super();
	}

	public OrderItem(long id, String name, int price, String size, int waight, Orders orders, Timestamp creationTime,
			Timestamp updationTime, int isDeleted) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.size = size;
		this.waight = waight;
		this.orders = orders;
		this.creationTime = creationTime;
		this.updationTime = updationTime;
		this.isDeleted = isDeleted;
	}

	
	
	

}
