package com.shop.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.dao.EntityDAO;
import com.shop.model.Product;

@Repository
public class ProductDAOImpl implements EntityDAO<Product> {

	private final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Product save(Product product) {
		logger.debug("New Product save invoked..");
		Long genId = (Long) getCurrentSession().save(product);
		logger.debug("New Product saved with:{} ",genId);
		product.setId(genId);
		return product;
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
