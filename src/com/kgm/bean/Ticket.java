package com.kgm.bean;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/* Ticket table with ORM */
@Entity
@Table(name="TICKET")
public class Ticket {
	
	private int ticketId;
	private String firstName;
	private String lastName;
	private String phone;
	private String emailId;
	private int numberOfTicket;
	private String Address;
	private String scheduleBetween;
	private int price;
	private boolean status;
	private String operation;
	public Ticket() {
		super();
	}
	
	public Ticket(String firstName, String lastName, String phone,
			String emailId, int numberOfTicket, String address,
			String scheduleBetween, int price, boolean status, String operation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.emailId = emailId;
		this.numberOfTicket = numberOfTicket;
		Address = address;
		this.scheduleBetween = scheduleBetween;
		this.price = price;
		this.status = status;
		this.operation = operation;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TICKET_ID")
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	public int getNumberOfTicket() {
		return numberOfTicket;
	}

	public void setNumberOfTicket(int numberOfTicket) {
		this.numberOfTicket = numberOfTicket;
	}

	public String getScheduleBetween() {
		return scheduleBetween;
	}

	public void setScheduleBetween(String scheduleBetween) {
		this.scheduleBetween = scheduleBetween;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
