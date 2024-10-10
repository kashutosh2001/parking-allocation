package com.yash.parkingallocationsystem.model;

public class Feedback {
	
	private String email, description;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(String email, String description) {
		super();
		this.email = email;
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
