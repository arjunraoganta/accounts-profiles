package com.arjun.accounts.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountsProfilesApplication {
	public static void main(String[] args) {
		SpringApplication.run(AccountsProfilesApplication.class, args);
	}

}
