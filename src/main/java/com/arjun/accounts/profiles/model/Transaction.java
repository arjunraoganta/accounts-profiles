package com.arjun.accounts.profiles.model;

public class Transaction {
	String transactionAmount;
	String transactionDate;
	String transactionDescription;
	String transactionDescriptionExtension;
	String transactionId;
	String transactionStatus;
	String transactionType;
	
	public Transaction(String transactionAmount, String transactionDate, String transactionDescription,
			String transactionDescriptionExtension, String transactionId, String transactionStatus,
			String transactionType) {
		super();
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
		this.transactionDescription = transactionDescription;
		this.transactionDescriptionExtension = transactionDescriptionExtension;
		this.transactionId = transactionId;
		this.transactionStatus = transactionStatus;
		this.transactionType = transactionType;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getTransactionDescriptionExtension() {
		return transactionDescriptionExtension;
	}

	public void setTransactionDescriptionExtension(String transactionDescriptionExtension) {
		this.transactionDescriptionExtension = transactionDescriptionExtension;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	
	

}
