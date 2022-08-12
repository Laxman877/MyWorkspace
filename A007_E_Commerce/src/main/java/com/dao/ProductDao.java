package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDao {
	public void addOrUpdateProduct(Product prod);
	public List<Product> getallProduct();
	public Product getProductById(int id);
	public void deleteProduct(int id);
}
