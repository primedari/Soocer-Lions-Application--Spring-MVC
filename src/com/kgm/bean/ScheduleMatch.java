package com.kgm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Schedule table with ORM */
@Entity
@Table(name="SCHEDULE")
public class ScheduleMatch{
	private int scheduleId;
	private String date;
	private String scheduleBetween;
	private String place;
	private int price;
	private String operation;
	public ScheduleMatch() {
		super();
	}
	
	public ScheduleMatch(String date, String scheduleBetween,
			String place, int price,String operation) {
		super();
		this.date = date;
		this.scheduleBetween = scheduleBetween;
		this.place = place;
		this.operation = operation;
		this.price=price;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SCH_ID")
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	@Column(name="DATE")
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Column(name="PLACE")
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
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
