package com.cg.ui;
import java.util.Scanner;

import com.cg.dao.EWalletDaoImpl;
import com.cg.dto.Customer;
import com.cg.service.EWalletServiceImpl;

public class WalletClient {
    
    static EWalletServiceImpl serv = new EWalletServiceImpl();
    static String mobileNo; 
    static Scanner sc=new Scanner(System.in);
    static Boolean Flag = false;
    public static void main(String[] args)
    {
    	int ch = 0;
    	do{
    	
        
        System.out.println("1.Create Account");
        System.out.println("2.Existing User");
        ch = sc.nextInt();
        
        switch(ch) {
        case 1 : addCustomer();break;
        case 2 : signIn();break;
        default : System.out.println("Invalid input!!!!!");
        }
    	}while(Flag==false);
        
        
        while(Flag){
        	
            System.out.println("1.Deposit Fund\n");
            System.out.println("2.Withdraw Fund\n");
            
            System.out.println("3.Fund Transfer\n");
            System.out.println("4.Check Balance \n");
            System.out.println("5.Show Transaction\n");
            System.out.println("6.Exit\n");
            System.out.println("Please enter your choice : ");
            ch = sc.nextInt();

            switch(ch){
            case 1 : deposit(); break;
            case 2 : withdraw(); break;             
            case 3 : fundTransfer();break;
            case 4 : checkBalance(); break;
            case 5 : showTransaction();break;
            case 6 : exit();break;
            default : System.out.println("Invalid input!!!!!");
            }

        }
        
        
    }
    private static void showTransaction() {
		serv.showTransaction(mobileNo);
		
	}
	private static void signIn() {
        System.out.println("Enter mobile number:\t");
        mobileNo = sc.next();
        if(serv.validateMobile(mobileNo) && serv.validateAccount(mobileNo))
        {
            System.out.println("Logged in Successfully ");
            Flag = true;
        }
        else
        Flag= false;        
    }
    private static void exit() {
        System.out.println("Adios Amigo!!!!!!!!");
        System.exit(0);
        
    }
    private static void checkBalance() {
        System.out.println("Enter mobile number/wallet Id:\t");
        mobileNo = sc.next();
        if(serv.validateMobile(mobileNo))
        {
            Customer bal = serv.showBalance(mobileNo);
            System.out.println("Available balance is rs "+bal);
        }
        
    }
    private static void fundTransfer() {
        
        System.out.println("Enter sender mobile number:\t");
        String sender = sc.next();
        if(serv.validateMobile(sender))
        {
            System.out.println("Enter receiver mobile number:\t");
            String receiver = sc.next();
            if(serv.validateMobile(receiver))
            {
                System.out.println("Enter amount to be transferred:\t");
                double amt = sc.nextDouble();
                if(serv.validateAmt(amt))
                {
                    serv.fundTransfer(sender, receiver, amt);
                    System.out.println("Amount transferred successfully!!!!!!!!");
                }
            }
        }
        
        
    }
    private static void withdraw() {
        
        System.out.println("Enter amount to be withdrawn:\t");
        double amt= sc.nextDouble();
        if(serv.validateAmt(amt))
        {
            serv.withdrawAmount(mobileNo, amt);
            System.out.println("Amount withdrawn successfully!!!!!!!");
        }
        
        
    }
    private static void deposit() {
        
        System.out.println("Enter the amount to be deposited:\t");
        double amt = sc.nextDouble();
        if(serv.validateAmt(amt))
        {
            serv.depositAmount(mobileNo, amt);
            System.out.println("Amount deposited successfully!!!!");
        }
        
    }
    private static void addCustomer() {
        System.out.println("Enter your name :\t");
        String nm = sc.next();
        if(serv.validateName(nm))
        {
            System.out.println("Enter Mobile number:\t");
            String mobNo = sc.next();
            if(serv.validateMobile(mobNo))
            {
                System.out.println("Enter the Initial amount:\t");
                double initBal = sc.nextDouble();
                if(serv.validateAmt(initBal))
                {
                    serv.createAccount(nm, mobNo, initBal);
                    System.out.println("Customer Added Successfulyy!!!!!!!");
                }
            }
        }
        
    }
    
}