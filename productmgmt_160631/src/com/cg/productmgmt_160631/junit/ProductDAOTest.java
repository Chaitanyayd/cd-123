package com.cg.productmgmt_160631.junit;
import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.productmgmt_160631.dao.ProductDAO;
import com.cg.productmgmt_160631.exception.ProductException;

public class ProductDAOTest {
	static ProductDAO prodDAO = null;
	@BeforeClass
	public static void setUp(){
		
		prodDAO = new ProductDAO();
		
	}
	
	@Test
	public void updateProductsTest() throws ProductException 
	{
		Assert.assertEquals(110, prodDAO.updateProducts("soap", 10));
	}
	
	
	
}
