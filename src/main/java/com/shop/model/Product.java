package com.shop.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	private ProductType productType;
	private BigDecimal price;
	private StockStatus stockStatus;
	
	public Product(){}

	public Product(Long id, String name, ProductType productType,
			BigDecimal price, StockStatus stockStatus) {
		super();
		this.id = id;
		this.name = name;
		this.productType = productType;
		this.price = price;
		this.stockStatus = stockStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public StockStatus getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(StockStatus stockStatus) {
		this.stockStatus = stockStatus;
	}
	
	
}
