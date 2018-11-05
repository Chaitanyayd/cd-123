package com.cg.productmgmt_160631.dao;

import java.util.Map;

import com.cg.productmgmt_160631.exception.ProductException;

public interface IProductDAO {
	public int updateProducts(String category, int hike) throws ProductException;
	public Map<String, String> getproductDetails() throws ProductException;
}

