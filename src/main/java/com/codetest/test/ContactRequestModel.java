package com.codetest.test;

public class ContactRequestModel {
	public int id;
	public String name;
	public String email;
	public String details;
	public boolean urgent;
	
	public int getId() {
		return id;
	}

	public void setId(int id) { 
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	
	public ContactRequestModel(String name, String email, String details,boolean employee,boolean urgent) {
		this.name = name;
		this.email = email;
		this.details = details;
		this.urgent = urgent;
	}
	
	
}
