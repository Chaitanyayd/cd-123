package com.cg.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Transaction {
	private List <String> transaction = new ArrayList<String>();

	public List <String> getTransaction() {
		return transaction;
	}

	public void setTransaction(List <String> transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Transaction [transaction=" + transaction + "]";
	}
	
	
	
}
