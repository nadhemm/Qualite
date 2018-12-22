package tn.insat.manytomany.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tn.insat.onetomany.domain.Categorie;
import tn.insat.onetomany.domain.Produit;
import tn.insat.util.HibernateUtil;

import java.time.LocalDate;
import java.util.Arrays;


public class App {
	public static void main(String[] args) {
		
		try (SessionFactory factory = HibernateUtil.getSessionFactory()) {
			Session session = factory.openSession();
			
			// Create your objects here  ...

			Transaction tx = session.getTransaction();
			try {
				tx.begin();

		// save objects here
				tx.commit();
				
			} catch (Exception e) {
			 if ((tx !=null) && (tx.isActive())) {
				 tx.rollback();
				 System.out.println("LOG : Annluation de la transaction "+tx);				
			}
			}			
			
			
		};
		System.out.println("==== FIN DU PROGRAMME ===="); 
		
		
	}
}
