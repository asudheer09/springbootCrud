package com.ramesh.milk.model;

import java.io.Serializable;

public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private String villageName;
	private String phoneNumber;
	private String milkQuantity;
	
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
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMilkQuantity() {
		return milkQuantity;
	}
	public void setMilkQuantity(String milkQuantity) {
		this.milkQuantity = milkQuantity;
	}
	
}
