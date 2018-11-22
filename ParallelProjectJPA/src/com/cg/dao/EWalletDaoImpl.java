package com.cg.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.dto.Customer;
import com.cg.dto.Transaction;
import com.cg.dto.Wallet;

public class EWalletDaoImpl implements IEWalletDao {
	private Repository repo;
	private Customer customer;
	private Wallet wallet;
	EntityManager manager = null;
	public EWalletDaoImpl() {
		super();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		manager = emf.createEntityManager();
	}
	@Override
	public Customer createAccount(String name, String mobileNo, double amount) {
		wallet = new Wallet(amount);
		customer = new Customer(name, mobileNo, wallet, new Transaction());
		System.out.println(customer);
		if(Repository.save(customer))
		{	
			return customer;
		}
		else 
			return null;
	}
	@Override
	public Customer showBalance(String mobileNo) {
		Customer customer =Repository.findOne(mobileNo);
		if(customer!= null)
		return customer;
		return null;
	}
	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, double amount) {
		Customer customer1 = Repository.findOne(sourceMobileNo);
		Customer customer2 = Repository.findOne(targetMobileNo);
		
		if(customer1!=null)
		{
			double newAmount = customer1.getWallet().getBalance();
			newAmount = newAmount-amount;
			Wallet wallet = new Wallet(newAmount);
			customer1.setWallet(wallet);
			customer1.getTransaction().getTransaction().add(amount +" transfered to" + customer2.getName());
		}
		
		if(customer2!=null)
		{
			double newAmount = customer2.getWallet().getBalance();
			newAmount = newAmount+amount;
			Wallet wallet = new Wallet(newAmount);
			customer2.setWallet(wallet);
			customer2.getTransaction().getTransaction().add(amount +" received from " + customer.getName());
		}
		return null;
	}
	@Override
	public Customer depositAmount(String mobileNo, double amount) {
		Customer customer = Repository.findOne(mobileNo);
		if(customer!=null)
		{
			double newAmount = customer.getWallet().getBalance();
			newAmount = newAmount+amount;
			Wallet wallet = new Wallet(newAmount);
			customer.setWallet(wallet);
			customer.getTransaction().getTransaction().add(amount +"deposited");
			return customer;
		}
		return null;
	}
	@Override
	public Customer withdrawAmount(String mobileNo, double amount) {
		Customer customer = Repository.findOne(mobileNo);
		if(customer!=null)
		{
			double newAmount = customer.getWallet().getBalance();
			newAmount = newAmount-amount;
			Wallet wallet = new Wallet(newAmount);
			customer.setWallet(wallet);
			customer.getTransaction().getTransaction().add(amount +"withdrawn");
			return customer;
		}
		return null;
	}
	@Override
	public List<String> showTransaction(String mobileNo) {
		Customer customer = Repository.findOne(mobileNo);
		System.out.println(customer.getTransaction().getTransaction());
		return null;
	}
	
	 
}
