package com.todo.demo.beans;

import com.todo.demo.entities.Product;
import com.todo.demo.services.ProductService;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Component
@ViewScoped
@Getter
@Setter
public class ProductBean implements Serializable {

	// Injection du service Spring permanent
	private final ProductService productService;

	// Propriétés pour lier les champs de saisie du formulaire
	private String newProductName;
	private double newProductPrice;

	// Injection par constructeur (recommandé en Spring moderne)
	@Inject
	public ProductBean(ProductService productService) {
		this.productService = productService;
	}

	// Méthode de sauvegarde appelée par add-product.xhtml
	public String saveProduct() {
		// Enregistrement définitif dans le service permanent
		productService.addProduct(this.newProductName, this.newProductPrice);

		// Réinitialisation locale des champs du formulaire
		this.newProductName = "";
		this.newProductPrice = 0.0;

		// Redirection vers la liste
		return "products?faces-redirect=true";
	}

	// Récupère la liste depuis le service à chaque affichage
	public List<Product> getProducts() {
		return productService.getAllProducts();
	}

}
