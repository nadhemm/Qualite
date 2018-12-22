package tn.insat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tn.insat.repository.IComptesRepository;



@SpringBootApplication
public class MyLombokApplication {

		
	public static void main(String[] args) {
		SpringApplication.run(MyLombokApplication.class, args);
	}
	@Bean
	CommandLineRunner runIt (IComptesRepository repo) {
		return args -> {
			repo.findAll().forEach(System.out :: println);
		};
	}
	
}
