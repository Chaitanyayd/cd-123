package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cg.dto.Customer;
import com.cg.exception.InvalidInputException;

public class Repository {
	private  static Map<String, Customer> data; 
	private  static Map<String,ArrayList<String>> trans;
	
	
	
	public Repository(){
		data = new HashMap<String, Customer>();
	}

	public Repository(Map<String, Customer> data) 	{
		super();
		this.data = data;
	}
	
	public static boolean save(Customer customer) {
		
		data.put(customer.getMobileNo(), customer);
		
		return true;
	}

	public static Customer findOne(String mobileNo) {
		if(data.containsKey(mobileNo)){
			Customer customer=data.get(mobileNo);
			return customer;
		}
		else
			throw new InvalidInputException("Customer not found");
		}

	public Map<String, ArrayList<String>> getTrans() {
		return trans;
	}

	public void setTrans(Map<String, ArrayList<String>> trans) {
		this.trans = trans;
	}
	
}
