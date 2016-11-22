package com.kgm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/* Product table with ORM */
@Entity
@Table(name="PRODUCT")
public class Product {
	
	private int productId;
	private String productSize;
	private int productPrice;
	public Product() {
		super();
	}
	public Product(String productSize, int productPrice) {
		super();
		this.productSize = productSize;
		this.productPrice = productPrice;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PRODUCT_ID")
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Column(name="psize")
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	@Column(name="pprice")
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
