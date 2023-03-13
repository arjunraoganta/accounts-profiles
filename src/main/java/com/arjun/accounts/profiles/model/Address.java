package com.arjun.accounts.profiles.model;

public class Address {
	String addressType;
	String houseNo;
	String Street;
	String city;
	String state;
	public Address(String addressType, String houseNo, String street, String city, String state) {
		super();
		this.addressType = addressType;
		this.houseNo = houseNo;
		Street = street;
		this.city = city;
		this.state = state;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
