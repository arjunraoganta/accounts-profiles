package com.arjun.accounts.profiles.model;

public class CheckingAccountSummary extends AccountSummary {
	double currentbalance;
	double availablebalance;

	
	public CheckingAccountSummary(String productname, String productcode, String accountnickname, String displayaccountnumber,
			String accountid, String currencycode, String accountstatus, String accountclassification,double currentbalance, double availablebalance) {
		super(productname,  productcode,  accountnickname,  displayaccountnumber,
				 accountid,  currencycode,  accountstatus,  accountclassification);
		this.productname = productname;
		this.productcode = productcode;
		this.accountnickname = accountnickname;
		this.displayaccountnumber = displayaccountnumber;
		this.accountid = accountid;
		this.currencycode = currencycode;
		this.accountstatus = accountstatus;
		this.accountclassification = accountclassification;
		this.currentbalance = currentbalance;
		this.availablebalance = availablebalance;
	}


	public double getCurrentbalance() {
		return currentbalance;
	}


	public void setCurrentbalance(double currentbalance) {
		this.currentbalance = currentbalance;
	}


	public double getAvailablebalance() {
		return availablebalance;
	}


	public void setAvailablebalance(double availablebalance) {
		this.availablebalance = availablebalance;
	}
	
	
	

}
