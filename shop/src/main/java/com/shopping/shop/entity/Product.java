package com.shopping.shop.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String brand;
	
	private int price;
	
	private String size;
	
	private int waight;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ProductItem> productItem;
	
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public List<ProductItem> getProductItem() {
		return productItem;
	}

	public void setProductItem(List<ProductItem> productItem) {
		this.productItem = productItem;
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

	public Product() {
		super();
	}

	public Product(long id, String name, String brand, int price, String size, int waight,
			List<ProductItem> productItem, Timestamp creationTime, Timestamp updationTime, int isDeleted) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.waight = waight;
		this.productItem = productItem;
		this.creationTime = creationTime;
		this.updationTime = updationTime;
		this.isDeleted = isDeleted;
	}

	
	
	
	
}
