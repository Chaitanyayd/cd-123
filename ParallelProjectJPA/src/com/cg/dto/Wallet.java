package com.cg.dto;

import javax.persistence.*;
@SequenceGenerator(name="walletId", initialValue=100, allocationSize=1 )
public class Wallet {
	
	@Column
	private double balance;
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "walletId")
	private int walletId;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Wallet(double amount) {
		// TODO Auto-generated constructor stub
		this.balance = amount;
	}

	@Override
	public String toString() {
		return "Wallet [balance=" + balance + "]";
	}
	
	
	
}
