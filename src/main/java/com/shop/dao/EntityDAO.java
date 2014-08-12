package com.shop.dao;

import java.util.List;

import com.shop.model.Product;

public interface EntityDAO<E> {
	
	E save(E entity);
	E update(E entity);
	void delete(E entity);
	E get(Long id);
	List<Product> list();
}
