package com.cg.productmgmt_160631.ui;

import java.util.Scanner;

import com.cg.productmgmt_160631.exception.ProductException;
import com.cg.productmgmt_160631.service.ProductService;

public class Client {
	static Scanner sc = null;
	static ProductService prodSer = null;

	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		prodSer = new ProductService();
		int choice= 0;
		while (true)
		{
			System.out.println("1: Update Product Price ");
			System.out.println("2: Exit");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1: updateProd(); break;
			case 2: exit(); break;
			default:System.exit(0);
			}

		}
	}

	private static void updateProd() {
		System.out.println("Enter Category ");
		String category = sc.next();
		System.out.println("Enter Hike Rate");
		int hikeRate = sc.nextInt();
		try {
			if(prodSer.validateCategory(category) && prodSer.validateHikeRate(hikeRate))
			{
				prodSer.updateProducts(category, hikeRate);

			}
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			new ProductException("Category Must exist in database and hike rate must be greater than 0");
		}


	}

	private static void exit() {
		System.out.println("Exit Thank you");
		System.exit(0);

	}



}
