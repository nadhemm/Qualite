package tn.insat.inheritence.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tn.insat.util.HibernateUtil;


public class App {
	public static void main(String[] args) {
		System.out.println("==== Démo de l'association ManyToMany ====");
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
