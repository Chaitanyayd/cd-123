package com.cg.service;

import java.util.List;

import com.cg.dto.Customer;

public interface IEWalletService {
	public Customer createAccount(String name, String mobileNo, double amount);
	 public Customer showBalance(String mobileNo);
	 public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, double amount);
	 public Customer depositAmount(String mobileNo, double amount);
	 public Customer withdrawAmount(String mobileNo, double amount);
	 public List<String> showTransaction(String mobileNo);
	 
}
