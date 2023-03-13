package com.arjun.accounts.profiles.model;

import java.util.List;

public class Customer {
	String name;
	List<Address> address;
	List<Account> accounts;
	List<String> phoneNumbers;
	String emailId;
	public Customer(String name, List<Address> address, List<Account> accounts, List<String> phoneNumbers,
			String emailId) {
		super();
		this.name = name;
		this.address = address;
		this.accounts = accounts;
		this.phoneNumbers = phoneNumbers;
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	
	
	

}
