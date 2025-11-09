package com.example.Service;

import java.util.List;

import com.example.Dto.Product;

public interface ProductService {
	
	List<Product> searchProducts(String name);
	
	public Product createProduct(Product product);

}
