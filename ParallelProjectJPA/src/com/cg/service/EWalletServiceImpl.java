package com.cg.service;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.dao.EWalletDaoImpl;
import com.cg.dao.Repository;
import com.cg.dto.Customer;
import com.cg.exception.InvalidInputException;

public class EWalletServiceImpl implements IEWalletService {



	EWalletDaoImpl dao = new EWalletDaoImpl();
	Repository repo = new Repository();

	@Override
	public Customer createAccount(String name, String mobileNo, double amount) {

		return dao.createAccount(name, mobileNo, amount);
	}

	@Override
	public Customer showBalance(String mobileNo) {

		return dao.showBalance(mobileNo);
	}

	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, double amount) {
		return dao.fundTransfer(sourceMobileNo, targetMobileNo, amount);
	}

	@Override
	public Customer depositAmount(String mobileNo, double amount) {

		return dao.depositAmount(mobileNo, amount);
	}

	@Override
	public Customer withdrawAmount(String mobileNo, double amount) {

		return dao.withdrawAmount(mobileNo, amount);
	}

	@Override
	public List<String> showTransaction(String mobileNo) {

		return dao.showTransaction(mobileNo);
	}



	public boolean validateMobile(String mobileNo) {
		try{

			if(mobileNo == null)
				throw new InvalidInputException("Null value found");
			Pattern p = Pattern.compile("[0-9]{10}");
			Matcher m = p.matcher(mobileNo);
			if(!m.matches())
				System.out.println("Mobile Number Invalid!");
			return m.matches();
		} catch (Exception e) {

			e.printStackTrace();

		}
		return false;
	}

	public boolean validateAmt(double amount) {
		if(amount == 0){
			try {
				throw new InvalidInputException("Null value found");
			} catch (InvalidInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		String am = String.valueOf(amount);

		if(am.matches("\\d{1,9}\\.\\d{0,3}")){

			return true;
		}
		System.out.println("Invalid Amount!");
		return (false);
	}


	public boolean validateName(String name) {
		if(name == null){
			try {
				throw new InvalidInputException("Null value found");
			} catch (InvalidInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,10}");
			Matcher m = p.matcher(name); 
			if(!m.matches()){
				System.out.println("Name invalid!");
				return false;
			} return true;
				
		}
		return true;
	}
	
	public Boolean validateAccount(String mobNo)
	{
		Customer cust = repo.findOne(mobNo);
		if(cust==null)
			System.out.println("No such account found!");
		return true;
	}
}