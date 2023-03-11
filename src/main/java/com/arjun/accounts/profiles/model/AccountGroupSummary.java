package com.arjun.accounts.profiles.model;

import java.util.List;

public class AccountGroupSummary {
	String accountGroup;
	List<Accounts> accounts;
	public AccountGroupSummary(String accountGroup, List<Accounts> accounts) {
		super();
		this.accountGroup = accountGroup;
		this.accounts = accounts;
	}
	public String getAccountGroup() {
		return accountGroup;
	}
	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}
	public List<Accounts> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;
	}
	
	

}
