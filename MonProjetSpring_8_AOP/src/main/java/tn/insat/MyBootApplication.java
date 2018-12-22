package tn.insat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.insat.service.Calcul;

@SpringBootApplication
//@ComponentScan(basePackages="tn.insat)
public class MyBootApplication {

	@Autowired
	private Calcul calcul;

	public static void main(String[] args) {
		SpringApplication.run(MyBootApplication.class, args);
	}

	@Bean
	public CommandLineRunner runIt() {  // Exécuté immédiatement après le démarrage du conteneur !
		return args -> calcul.additionner(11, 22);
	}
}
