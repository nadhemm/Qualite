package tn.insat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.insat.domain.Produit;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, c'est Spring Boot !";
	}

	@GetMapping("/produits")
	public List<Produit> findAll() {
		return Arrays.asList(
				new Produit("P100", 100.5),
				new Produit("P200", 200.5),
				new Produit("P300", 300.5)
				);
	}
}
