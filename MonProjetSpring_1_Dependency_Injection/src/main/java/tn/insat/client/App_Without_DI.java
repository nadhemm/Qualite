package tn.insat.client;

import tn.insat.domain.Product;

import java.math.BigDecimal;

public class App_Without_DI {
	public static void main(String[] args) {
		
		// The client controls the creation on the object
		
		// Drawback : Strong coupling between the client and the object
		Product product = new Product("P1000", "Café", new BigDecimal("5.5"));
		
		System.out.println(product);
		
	}
}
