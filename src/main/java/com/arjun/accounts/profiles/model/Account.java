package com.arjun.accounts.profiles.model;

public class Account {
	String accountType;
	String accountNumber;
	double accountBalance;
	Transaction trasaction;
	public Account(String accountType, String accountNumber, double accountBalance,Transaction transaction) {
		super();
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.trasaction=transaction;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Transaction getTrasaction() {
		return trasaction;
	}
	public void setTrasaction(Transaction trasaction) {
		this.trasaction = trasaction;
	}
	
	
	

}
