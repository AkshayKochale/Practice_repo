package com.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="address")
public class Address 
{
	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="street")
	private String street;
	
	@Column(name="pincode")
	private int pincode;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String name, String street, int pincode) {
		super();
		this.name = name;
		this.street = street;
		this.pincode = pincode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [name=" + name + ", street=" + street + ", pincode=" + pincode + "]";
	}
	

}
