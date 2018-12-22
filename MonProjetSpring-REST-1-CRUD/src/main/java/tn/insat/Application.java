package tn.insat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tn.insat.repository.IComptesRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	@Bean
//	public CommandLineRunner runIt(DataSource dataSource) {
//		return args ->  {
//			System.out.println("La datasource par défaut est : "+dataSource);
//		};
//	}
	@Bean
	public CommandLineRunner tousLesComptes(IComptesRepository repo) {
		return args ->  {
			repo.findAll().forEach(System.out::println);
		};
	}
}
