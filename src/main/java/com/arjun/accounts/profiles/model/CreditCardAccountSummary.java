package com.arjun.accounts.profiles.model;

public class CreditCardAccountSummary extends AccountSummary{
	
	double outstandingbalance;
	double availablecredit;
	double creditlimit;
	double minimumdueamount;
	String paymentduedate;
	String alternatecurrency; 
	double alternatecurrencycurrentbalance;
	String cardholdertype;
	public CreditCardAccountSummary(String productname, String productcode, String accountnickname, String displayaccountnumber,
			String accountid, String currencycode, String accountstatus, String accountclassification,double outstandingbalance, double availablecredit, double creditlimit,
			double minimumdueamount, String paymentduedate, String alternatecurrency,
			double alternatecurrencycurrentbalance, String cardholdertype) {
		super(productname,  productcode,  accountnickname,  displayaccountnumber,
				 accountid,  currencycode,  accountstatus,  accountclassification);
		this.outstandingbalance = outstandingbalance;
		this.availablecredit = availablecredit;
		this.creditlimit = creditlimit;
		this.minimumdueamount = minimumdueamount;
		this.paymentduedate = paymentduedate;
		this.alternatecurrency = alternatecurrency;
		this.alternatecurrencycurrentbalance = alternatecurrencycurrentbalance;
		this.cardholdertype = cardholdertype;
	}
	public double getOutstandingbalance() {
		return outstandingbalance;
	}
	public void setOutstandingbalance(double outstandingbalance) {
		this.outstandingbalance = outstandingbalance;
	}
	public double getAvailablecredit() {
		return availablecredit;
	}
	public void setAvailablecredit(double availablecredit) {
		this.availablecredit = availablecredit;
	}
	public double getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(double creditlimit) {
		this.creditlimit = creditlimit;
	}
	public double getMinimumdueamount() {
		return minimumdueamount;
	}
	public void setMinimumdueamount(double minimumdueamount) {
		this.minimumdueamount = minimumdueamount;
	}
	public String getPaymentduedate() {
		return paymentduedate;
	}
	public void setPaymentduedate(String paymentduedate) {
		this.paymentduedate = paymentduedate;
	}
	public String getAlternatecurrency() {
		return alternatecurrency;
	}
	public void setAlternatecurrency(String alternatecurrency) {
		this.alternatecurrency = alternatecurrency;
	}
	public double getAlternatecurrencycurrentbalance() {
		return alternatecurrencycurrentbalance;
	}
	public void setAlternatecurrencycurrentbalance(double alternatecurrencycurrentbalance) {
		this.alternatecurrencycurrentbalance = alternatecurrencycurrentbalance;
	}
	public String getCardholdertype() {
		return cardholdertype;
	}
	public void setCardholdertype(String cardholdertype) {
		this.cardholdertype = cardholdertype;
	}
	
	

}
