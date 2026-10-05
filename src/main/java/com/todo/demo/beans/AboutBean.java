package com.todo.demo.beans;

import jakarta.faces.view.ViewScoped;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ViewScoped // Conserve le bean en mémoire tant que l'utilisateur reste sur la page
public class AboutBean implements Serializable {

	public String getVersion() {
		return "1.0";
	}

}
