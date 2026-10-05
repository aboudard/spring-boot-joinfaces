package com.todo.demo.services;

import com.todo.demo.ProductRepository;
import com.todo.demo.entities.Product;
import jakarta.inject.Inject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Composant Singleton : unique et permanent pour toute l'application
public class ProductService {

	private final ProductRepository productRepository;

	@Inject
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public void addProduct(String name, double price) {
		Product newProduct = new Product(name, price);
		productRepository.save(newProduct); // Sauvegarde le produit dans H2
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll(); // Récupère tous les produits de H2
	}

}
