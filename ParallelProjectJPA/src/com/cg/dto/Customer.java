package com.cg.dto;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
	@Column
	private String name;
	@Id
	@Column
	private String mobileNo;
	@OneToOne
	@JoinColumn(name="wallet_Id")
	private int walletId;
	private Wallet wallet;

	private Transaction transaction;
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String mobileNo, Wallet wallet,
			Transaction transaction) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.wallet = wallet;
		this.transaction = transaction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobileNo=" + mobileNo
				+ ", wallet=" + wallet + ", transaction=" + transaction + "]";
	} 
	
	
}
