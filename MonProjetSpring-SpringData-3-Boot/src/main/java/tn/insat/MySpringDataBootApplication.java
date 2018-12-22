package tn.insat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tn.insat.dataaccess.IComptesRepository;

@SpringBootApplication
public class MySpringDataBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringDataBootApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runIt (IComptesRepository repo) {
		return args -> {
			repo.findAll().forEach(System.out :: println);
		};
	}
}
