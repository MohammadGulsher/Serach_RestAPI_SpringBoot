package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.Dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	@Query("SELECT p FROM Product p WHERE "+
			"p.name LIKE CONCAT('%',:name,'%')" +
			"Or p.description LIKE CONCAT('%',:name,'%')")	
	List<Product> searchProducts(String name);
	
	@Query(value="SELECT * FROM products p WHERE " +
			"p.name LIKE CONCAT('%', :name,'%')"+
			"Or p.description LIKE CONCAT('%',:name,'%')",nativeQuery=true)	
			List<Product> searchProductsSQL(String name);
}








