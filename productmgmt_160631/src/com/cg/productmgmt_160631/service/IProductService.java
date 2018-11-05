package com.cg.productmgmt_160631.service;

import java.util.Map;
import com.cg.productmgmt_160631.exception.ProductException;

public interface IProductService {
	public int updateProducts(String category, int hike) throws ProductException;
	public Map <String,Integer> getProductDetails() throws ProductException;
	public boolean validateHikeRate(int rate ) throws ProductException;
	public boolean validateCategory(String category) throws ProductException;
}
