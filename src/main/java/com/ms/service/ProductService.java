package com.ms.service;

import java.util.List;
import java.util.Optional;
import com.ms.entity.Product;

public interface ProductService 
{
	Product save(Product product);
	Iterable<Product> saveAll(Iterable<Product> entities);
	Optional<Product> findById(int id);
	boolean existsById(int id);
	Iterable<Product> findAll();
	Iterable<Product> findAllById(Iterable<Integer> ids);
	long count();
	void deleteById(Integer id);
	void delete(Product entity);
	void deleteAllById(Iterable<Integer> ids);
	void deleteAll(Iterable<Product> entities);
	void deleteAll();
	public List<Product> findByPriceBetween(int low, int high);
	List<Product> findProductsByBrand(String brand);
	List<Product> getPriceList();
	List<Product> findLow(int amount, String brand);
	
	
}
