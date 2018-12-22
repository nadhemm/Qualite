package tn.insat.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.domain.Order;

public class App_With_DI_Orders {
	public static void main(String[] args) {

		// Démarrer le conteneur léger (factory) de Spring
		try (ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml")) {

			// Récupérer l'object à partir du conteneur
			Order order = context.getBean("order1", Order.class);

			System.out.println("Got from Spring factory : " + order);

			// Arrêter le conteneur
		} // context.close();

	}
}
