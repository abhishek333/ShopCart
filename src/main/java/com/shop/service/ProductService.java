package com.shop.service;

import java.util.List;

import com.shop.model.Product;

public interface ProductService {

	Product save(Product product);
	Product update(Product product);
	void delete(Product product);
	Product get(Long id);
	List<Product> list();
}
