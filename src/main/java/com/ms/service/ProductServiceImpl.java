package com.ms.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ms.entity.Product;
import com.ms.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public Product save(Product product) {
		return repo.save(product);
	}

	@Override
	public Iterable<Product> saveAll(Iterable<Product> entities) {
		return repo.saveAll(entities);
	}

	@Override
	public Optional<Product> findById(int id) {
		return repo.findById(id);
	}

	@Override
	public boolean existsById(int id) {
		return repo.existsById(id);
	}

	@Override
	public Iterable<Product> findAll() {
		return repo.findAll();
	}

	@Override
	public Iterable<Product> findAllById(Iterable<Integer> ids) {
		return repo.findAllById(ids);
	}

	@Override
	public long count() {
		return repo.count();
	}

	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);;

	}

	@Override
	public void delete(Product entity) {
		repo.delete(entity);

	}

	@Override
	public void deleteAllById(Iterable<Integer> ids) {
		repo.deleteAllById(ids);

	}

	@Override
	public void deleteAll(Iterable<Product> entities) {
		repo.deleteAll(entities);

	}

	@Override
	public void deleteAll() {
		repo.findAll();

	}

	@Override
	public List<Product> findByPriceBetween(int low, int high) {
		return repo.findByPriceBetween(low, high);
	}

	@Override
	public List<Product> findProductsByBrand(String brand) {
		return repo.findByBrand(brand);
	}

	@Override
	public List<Product> getPriceList() {
		return repo.getPriceList();
	}

	@Override
	public List<Product> findLow(int amount, String brand) {
		return repo.findLow(amount,brand);
	}

	

}
