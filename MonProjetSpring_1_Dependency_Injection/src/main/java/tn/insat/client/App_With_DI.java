package tn.insat.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.domain.Product;

public class App_With_DI {
	public static void main(String[] args) {

		// Démarrer le conteneur léger (factory) de Spring
		try (ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml")) {

			// Récupérer l'object à partir du conteneur
			Product product = context.getBean("product0", Product.class);

			System.out.println("Got from Spring factory : " + product);

			// Arrêter le conteneur
		} // context.close();

	}
}
