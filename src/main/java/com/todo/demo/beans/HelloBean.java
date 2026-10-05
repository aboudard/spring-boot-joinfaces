package com.todo.demo.beans;

import jakarta.faces.view.ViewScoped;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ViewScoped // Conserve le bean en mémoire tant que l'utilisateur reste sur la page
public class HelloBean implements Serializable {

	public String getMessage() {
		return "Connexion réussie entre Spring Boot et Jakarta Faces !";
	}

}
