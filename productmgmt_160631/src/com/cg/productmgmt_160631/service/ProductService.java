package com.cg.productmgmt_160631.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import com.cg.productmgmt_160631.dao.ProductDAO;
import com.cg.productmgmt_160631.exception.ProductException;

public class ProductService implements IProductService {

	ProductDAO prodDAO = new ProductDAO();

	@Override
	public int updateProducts(String category, int hike)throws ProductException {

		return prodDAO.updateProducts(category, hike);
	}

	@Override
	public Map<String, Integer> getProductDetails() throws ProductException {

		return null;
	}

	@Override
	public boolean validateHikeRate(int rate) throws ProductException {
		Integer input = new Integer(rate);
		String inputStr= input.toString();
		String digitPatter="[0-9]+";
		if(Pattern.matches(digitPatter, inputStr))
		{
			if(rate > 0)
			{
				return true;
			}
		}
		else {
			throw new ProductException("Invalid Input Only digits are allowed");
		}
		return false;
	}

	@Override
	public boolean validateCategory(String category) throws ProductException {
		ProductDAO prodDAO = new ProductDAO();
		Map productDetails = prodDAO.getproductDetails();
		Set<Map.Entry<String,String>> prodDetailsSet = productDetails.entrySet();
		Iterator<Map.Entry<String,String>> it = prodDetailsSet.iterator();
		while(it.hasNext())
		{
			Map.Entry entry = it.next();
			Object name = entry.getValue();
			if (category.equals(name))
				return true;
		}

		return false;
	}

}
