package com.model;

public class Customer {

	private String fname;
	private String lname;
	private String street;
	private String address;
	private String city;
	private String date;
	private String email;
	private String phone;
	private String pass;
	
	
	
	
	public Customer(String fname, String lname, String street, String address, String city, String date, String email,
			String phone,String pass) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.street = street;
		this.address = address;
		this.city = city;
		this.date = date;
		this.email = email;
		this.phone = phone;
		this.pass=pass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass= pass;
	}
	
	
}
