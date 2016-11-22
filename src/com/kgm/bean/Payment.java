package com.kgm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Payment table with ORM */
@Entity
@Table(name="payment")
public class Payment {
	
	private int paymentId;
	private int productId;
	private String productSize;
	private int productPrice;
	private String userName;
	private String cvvNumber;
	private String expiryDate12;
	private String address;
	private String operation;
	public Payment() {
		super();
	}
	
	public Payment(int productId, String productSize, int productPrice, String userName,
			String cvvNumber, String expiryDate12, String address,
			String operation) {
		super();
		this.productId = productId;
		this.productSize = productSize;
		this.productPrice = productPrice;
		this.userName = userName;
		this.cvvNumber = cvvNumber;
		this.expiryDate12 = expiryDate12;
		this.address = address;
		this.operation = operation;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="")
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	@Column(name="")
	public String getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	@Column(name="")
	public String getExpiryDate12() {
		return expiryDate12;
	}
	public void setExpiryDate12(String expiryDate12) {
		this.expiryDate12 = expiryDate12;
	}
	
	@Column(name="")
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
	
}
