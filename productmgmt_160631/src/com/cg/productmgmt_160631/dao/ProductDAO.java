package com.cg.productmgmt_160631.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.cg.productmgmt_160631.exception.ProductException;

public class ProductDAO implements IProductDAO {

	//map for product name as key and category as value
	static Map<String,String> productDetails;
	//map for product name as key and price as value
	static Map<String,Integer> salesDetails;

	static{
		productDetails = new HashMap<>();
		productDetails.put("lux", "soap");
		productDetails.put("clogate", "paste");
		productDetails.put("pears", "soap");
		productDetails.put("sony", "electronics");
		productDetails.put("samsung", "electronics");
		productDetails.put("facepack", "cosmatics");
		productDetails.put("facecream", "cosmatics");

		salesDetails = new HashMap<>();
		salesDetails.put("lux", 100);
		salesDetails.put("colgate", 50);
		salesDetails.put("pears", 70);
		salesDetails.put("sony", 10000);
		salesDetails.put("samsung", 23000);
		salesDetails.put("facepack", 100);
		salesDetails.put("facecream", 100);
	}



	@Override
	public int updateProducts(String category, int hike)throws ProductException {
		Set<Map.Entry<String,String>> prodDetailsSet = productDetails.entrySet();
		Iterator<Map.Entry<String,String>> it1 = prodDetailsSet.iterator();
		Set<Map.Entry<String,Integer>> salesDetailsSet = salesDetails.entrySet();
		Iterator<Map.Entry<String,Integer>> it2 = salesDetailsSet.iterator();
		while(it1.hasNext())
		{
			Map.Entry entry1 = it1.next();
			Object categoryOfObject = entry1.getValue();
			if (category.equals(categoryOfObject))
			{
				Object prodName = entry1.getKey();
				while(it2.hasNext())
				{
					Map.Entry entry2 = it2.next();
					Object keyOfObject = entry2.getKey();
					String key = keyOfObject.toString();
					if(key.equals(prodName))
					{
						int price = (int) entry2.getValue();
						salesDetails.put(key, price+price*hike/100);
						System.out.println("Products are Updated");
						getproductDetails();
						return price;
					}
				}
			}

		}
		return 0;
	}

	@Override
	public Map<String, String> getproductDetails() throws ProductException {
		System.out.println(productDetails);
		System.out.println(salesDetails);
		return  productDetails;
	}

}
