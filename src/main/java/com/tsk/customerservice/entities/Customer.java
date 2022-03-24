package com.tsk.customerservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Customer {

	@Id
	private String id;
	
	private String fName;
	
	private String lName;
	
	
	private String email;
	
	private String address;

	public Customer(String fName, String lName, String email, String address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.address = address;
	}

	public Customer() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
