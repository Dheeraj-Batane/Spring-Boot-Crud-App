package com.ms.entity;





import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	private String brand;
	private int price;
	
	
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
