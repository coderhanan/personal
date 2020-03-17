package com.venuly.entities;

public class Booking extends VenulyBase {
	
	private String description;
	private String startDate;
	private String startTime;
	private String endDate;
	private String endTime;
	
	
	public Booking (long id, String description, String startDate, String startTime, String endDate, String endTime) {
	this.id = id;
	this.description = description;
	this.startDate = startDate;
	this.startTime = startTime;
	this.endDate = endDate;
	this.endTime = endTime;
	}
	
}
