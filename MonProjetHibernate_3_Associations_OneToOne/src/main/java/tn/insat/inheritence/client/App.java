package tn.insat.inheritence.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import tn.insat.inheritence.domain.BillingInfo;
import tn.insat.inheritence.domain.User;
import tn.insat.util.HibernateUtil;


public class App {
	public static void main(String[] args) {
		System.out.println("==== Démo de l'association OneToOne ====");
		try (SessionFactory factory = HibernateUtil.getSessionFactory()) {
			Session session = factory.openSession();
			
			// Create your objects here  ...
			User user1 = new User("U100", "user@there.com");
			BillingInfo billingInfo1 = new BillingInfo(100L, "VISA");
			user1.setBillingInfo(billingInfo1);
			billingInfo1.setUser(user1);

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
