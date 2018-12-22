package tn.insat.client;

import java.math.BigDecimal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.insat.dataaccess.CompteRepository;

public class App {

	public static void main(String[] args) {
		System.out.println("Illustration d'un DAO Hibernate simple");

		// Start the factory
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		// Get the bean
		CompteRepository repo = context.getBean(CompteRepository.class);

		
		
		repo.avoirLesSoldesSuperieursA(new BigDecimal("0")).forEach( System.out :: println);  // Java 8 !!!
		
		
		
		context.close();

		System.out.println("Fin du programme !");
	}
}
