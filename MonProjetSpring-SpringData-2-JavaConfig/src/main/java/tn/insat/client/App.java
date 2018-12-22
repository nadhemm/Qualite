package tn.insat.client;

import java.math.BigDecimal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tn.insat.configuration.AppConfiguration;
import tn.insat.dataaccess.CompteRepository;
import tn.insat.domain.Compte;

public class App {
	
	public static void main(String[] args) {
		System.out
				.println("Illustration de SpringData JPA/Hibernate - JavaConfig");

		// Start the factory
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfiguration.class);

		// Get the bean
		CompteRepository repo = context.getBean(CompteRepository.class);

		// Use with the bean
		repo.save(new Compte("Z200", "Dr. Roy Fielding (REST Style Creator) ",
				new BigDecimal("100.5")));

		// Clean up
		context.close();

		System.out.println("Fin du programme !");
	}
}
