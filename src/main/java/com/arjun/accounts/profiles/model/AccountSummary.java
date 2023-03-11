package com.arjun.accounts.profiles.model;

public class AccountSummary {
	String productname;
	String productcode;
	String accountnickname;
	String displayaccountnumber;
	String accountid;
	String currencycode;
	String accountstatus;
	String accountclassification;
	public AccountSummary(String productname, String productcode, String accountnickname, String displayaccountnumber,
			String accountid, String currencycode, String accountstatus, String accountclassification) {
		super();
		this.productname = productname;
		this.productcode = productcode;
		this.accountnickname = accountnickname;
		this.displayaccountnumber = displayaccountnumber;
		this.accountid = accountid;
		this.currencycode = currencycode;
		this.accountstatus = accountstatus;
		this.accountclassification = accountclassification;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getAccountnickname() {
		return accountnickname;
	}
	public void setAccountnickname(String accountnickname) {
		this.accountnickname = accountnickname;
	}
	public String getDisplayaccountnumber() {
		return displayaccountnumber;
	}
	public void setDisplayaccountnumber(String displayaccountnumber) {
		this.displayaccountnumber = displayaccountnumber;
	}
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getAccountstatus() {
		return accountstatus;
	}
	public void setAccountstatus(String accountstatus) {
		this.accountstatus = accountstatus;
	}
	public String getAccountclassification() {
		return accountclassification;
	}
	public void setAccountclassification(String accountclassification) {
		this.accountclassification = accountclassification;
	}
	
	

}
