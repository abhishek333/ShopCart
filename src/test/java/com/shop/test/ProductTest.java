package com.shop.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.mchange.util.AssertException;
import com.shop.dao.EntityDAO;
import com.shop.model.Product;
import com.shop.model.ProductType;
import com.shop.model.StockStatus;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:testapplication-context.xml")
@TransactionConfiguration(defaultRollback=true, transactionManager="transactionManager")
@Transactional
public class ProductTest {

	@Autowired
	private EntityDAO<Product> productDAO;
	
	@Test
	public void saveProduct(){
		ProductType productType = new ProductType();
		StockStatus stockStatus = new StockStatus();
		Product product = new Product(null, "Samsung S2 Plus", productType, new BigDecimal(23000.00), stockStatus);

		assertEquals(1L,productDAO.save(product).getId().longValue());
	}
}
