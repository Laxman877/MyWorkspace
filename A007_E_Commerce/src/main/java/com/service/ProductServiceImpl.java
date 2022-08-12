package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;
	@Override
	public void addOrUpdateProduct(Product prod) {
		productDao.addOrUpdateProduct(prod);

	}

	@Override
	public List<Product> getallProduct() {
		// TODO Auto-generated method stub
		return productDao.getallProduct();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.getProductById(id);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(id);
	}

}
