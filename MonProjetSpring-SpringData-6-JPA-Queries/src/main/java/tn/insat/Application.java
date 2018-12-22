package tn.insat;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;

import tn.insat.domain.Compte;
import tn.insat.repository.IComptesRepository;

@SpringBootApplication
public class Application {
		
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner myRunner(IComptesRepository repo) {
		return args -> {
			
			 //Step1_Default_CRUD(repo);
			
		 //Step2_DSL(repo);
			
			//Step3_JPA_QL(repo);
			
			// Step 4 - Paging
			
			System.out.println("Pagination - La 2ème page avec des pages de taille 2 ");
			repo.findAll(PageRequest.of(1,5)).forEach(System.out::println);		
		
			
		};
	}

	private void Step3_JPA_QL(IComptesRepository repo) {
		// Step 3 - JPA QL 
		System.out.println("Via une Query - Tous les comptes ayant un solde inférieur à 200");
		repo.findBySoldeInferieurA(new BigDecimal("200")).forEach(System.out::println);		
		
		System.out.println("Via une Query - Tous les comptes ayant un nomcomportant un e");
		repo.findByProprietaireComme("e").forEach(System.out::println);
	}

	private void Step2_DSL(IComptesRepository repo) {
		// Step 2 - DSL
//		System.out.println("Tous les comptes ayant un solde inférieur à 200");
//		repo.findBySoldeIsLessThanEqual(new BigDecimal("200")).forEach(System.out::println);
		
		System.out.println("Tous les comptes ayant nom comportant un e");
		repo.findByProprietaireIsLike("%BEN%").forEach(System.out::println);
	}

	private void Step1_Default_CRUD(IComptesRepository repo) {
		// Step 1 - Utilisation des CRUD par défauts de JPA repositories
	//	repo.findAll().forEach(System.out :: println);			
		
//		Optional<Compte> resultat = repo.findById("C100");		
//		
//		System.out.println(resultat.isPresent() ? resultat.get() : "Inexistant");
//		
//		
		System.out.println("Query By Example");
		for (Compte compte : repo.findAll(Example.of(new Compte(null,"Rod Johnson",null)))) {
			System.out.println("== Un compte de Rod => "+ compte);
		}
	}
	
}
