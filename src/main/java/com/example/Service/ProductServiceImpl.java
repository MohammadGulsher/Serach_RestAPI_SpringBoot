package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dto.Product;
import com.example.Repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	@Override
	public List<Product> searchProducts(String query) {
		List<Product> products=productRepository.searchProducts(query);
		return products;
	}
	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

}
