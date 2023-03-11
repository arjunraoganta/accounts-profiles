package com.arjun.accounts.profiles.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arjun.accounts.profiles.model.Account;
import com.arjun.accounts.profiles.model.AccountGroupSummary;
import com.arjun.accounts.profiles.model.Accounts;
import com.arjun.accounts.profiles.model.Address;
import com.arjun.accounts.profiles.model.CheckingAccountSummary;
import com.arjun.accounts.profiles.model.CreditCardAccountSummary;
import com.arjun.accounts.profiles.model.Customer;
import com.arjun.accounts.profiles.model.Transaction;

@RestController
@RequestMapping("/v1")
public class AccountsController {
	
	
	
	@GetMapping("/accounts")
	public AccountGroupSummary getAccounts() {
		List<Accounts> accountSummaries = new ArrayList<>();
		
		accountSummaries.add(new Accounts(new CheckingAccountSummary("Personal Savings Account","SA_1000","Personal Savings Account",
				"XXXXXX2391", "3255613852316f2b4d4d796","AUD","ACTIVE","ASSET",10000.25,15000.25)));
		accountSummaries.add(new Accounts(new CreditCardAccountSummary("Personal Savings Account","SA_1000","Personal Savings Account",
				"XXXXXX2391", "3255613852316f2b4d4d796","AUD","ACTIVE","ASSET",10000.25,15000.25,25000.25,256.5,"2016-10-05","USD",1534.25,"PRIMARY")));
		return new AccountGroupSummary("Savings", accountSummaries);
		
	}
	
	@GetMapping("/customer")
	public Customer getCustomer() {
		List<Account> accounts=new ArrayList<>();
		accounts.add(new Account("savings","12345",0.0,new Transaction("12.22","2016-04-15","AUTOMATED PHONE","TELEPHONEReference","545226","POSTED","PAYMENT")));
		accounts.add(new Account("current","12345",0.0,new Transaction("12.22","2016-04-15","AUTOMATED PHONE","TELEPHONE Reference","545226","POSTED","PAYMENT")));
		accounts.add(new Account("loan","12345",0.0,new Transaction("12.22","2016-04-15","AUTOMATED PHONE","TELEPHONE Reference","545226","POSTED","PAYMENT")));
		List<Address> addresses = new ArrayList<>();
		addresses.add(new Address("office","123","mainroad","chennai","tamilnadu"));
		addresses.add(new Address("home","123","mainroad","khammam","telangana"));
		List<String> phoneNumbers=Arrays.asList("8897943772","8897943772");
		return new Customer("arjun",addresses,accounts,phoneNumbers,"arjun@gmail.com");
	}
	
	@GetMapping("/get")
	public String getSomething() {
		return "Return something from Accounts Microservice";
	}
	
	
	
	

}
