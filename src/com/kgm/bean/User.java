package com.kgm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/* User table with ORM */
@Entity
@Table(name="USER")
public class User {
	
	private int userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String oparation;
	private int age;
	private String address;
	private String phoneNO;
	public User() {
		super();
	}
	public User(String firstName, String lastName, String emailId,
			String password, String oparation, int age, String address,
			String phoneNO) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.oparation = oparation;
		this.age = age;
		this.address = address;
		this.phoneNO = phoneNO;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	public int getUserId() {
		return userId;
	}
	@Column(name="USER_FNAME")
	public String getFirstName() {
		return firstName;
	}
	@Column(name="USER_LNAME")
	public String getLastName() {
		return lastName;
	}
	@Column(name="USER_EMAIL")
	public String getEmailId() {
		return emailId;
	}
	@Column(name="PASSWORD",nullable = false)
	public String getPassword() {
		return password;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOparation() {
		return oparation;
	}
	public void setOparation(String oparation) {
		this.oparation = oparation;
	}
	@Column(name="AGE")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Column(name="ADDRESS")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="PHONE")
	public String getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}
	
}
