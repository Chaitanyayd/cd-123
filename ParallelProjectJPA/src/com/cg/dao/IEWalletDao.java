package com.cg.dao;

import java.math.BigDecimal;
import java.util.List;

import com.cg.dto.Customer;

public interface IEWalletDao {

	public Customer createAccount(String name ,String mobileNo, double amount);
	public Customer showBalance (String mobileNo);
	public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, double amount);
	public Customer depositAmount (String mobileNo,double amount );
	public Customer withdrawAmount(String mobileNo, double amount);
	public List<String> showTransaction(String mobileNo);

}
