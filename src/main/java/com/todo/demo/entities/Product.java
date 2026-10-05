package com.todo.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String name;

	@Column
	private double price;

	protected Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

}
