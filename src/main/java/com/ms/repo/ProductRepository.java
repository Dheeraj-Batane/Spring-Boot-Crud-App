package com.ms.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ms.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> 
{
	public List<Product> findByPriceBetween(int low, int high);

	public List<Product> findByBrand(String brand);
	
	//@Query("select p from Product p")
	@Query("select new com.ms.entity.Product(p.name, p.price) from Product p")
	public List<Product> getPriceList();

	@Query("select p from Product p where p.price <= ?1 and p.brand=?2")
	public List<Product> findLow(int amount, String brand);

	

	
	
	
}
