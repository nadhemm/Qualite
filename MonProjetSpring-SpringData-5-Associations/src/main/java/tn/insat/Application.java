package tn.insat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

		
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
	

////	@Bean
//	CommandLineRunner myRunner(IComptesRepository repoComptes, IOperationsRepository repoOperations ) {
//		return args -> {
//			
//			Compte c1 = new Compte("C1000", "Abdelkarim MARS", new BigDecimal("1000"), null);
//			Compte c2 = new Compte("C2000", "Wejden BEN HAJ SASSI", new BigDecimal("2000"), null);
//			
//			Operation op11 = new Operation();
//			op11.setDateOperation(new Date());  // Maintenant
//			op11.setMontant(BigDecimal.TEN);
//			op11.setSens("CREDIT");
//            op11.setCompte(c1);
//          
//            Operation op12 = new Operation();
//			op12.setDateOperation(new Date());  // Maintenant
//			op12.setMontant(BigDecimal.TEN);
//			op12.setSens("DEBIT");
//            op12.setCompte(c1);
//            
//            Operation op13 = new Operation();
//			op13.setDateOperation(new Date());  // Maintenant
//			op13.setMontant(new BigDecimal("100"));
//			op13.setSens("CREDIT");
//            op13.setCompte(c1);
//            
//            List<Operation> op = Arrays.asList(op11,op12,op13);
//            c1.setOperations(op);
//            
//            repoComptes.save(c1);
//            repoComptes.save(c2);
//            
//            repoOperations.saveAll(op);
//            System.out.println(" ====== FIN DE L'INITIALISATION DES DONNEES ======");
//			
//		};
//			
//	}

