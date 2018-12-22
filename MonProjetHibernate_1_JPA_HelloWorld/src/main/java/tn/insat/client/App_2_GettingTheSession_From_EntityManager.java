package tn.insat.client;

import org.hibernate.Session;
import tn.insat.domain.Compte;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App_2_GettingTheSession_From_EntityManager {
	public static void main(String[] args) {

		// Obtenir la EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BanquePU");

		// Obtenir le EntityManager à partir de la Factory
		EntityManager em = emf.createEntityManager();


		// Access the the session from the Entity Manager
		// ATTENTION : CECI SUPPOSE QUE HIBERNATE EST ACTUELLEMENT LE PROVIDER JPA
		Session session = em.unwrap(Session.class);

		// Get the SessionFactory from the session
		//SessionFactory sessionFactory = session.getSessionFactory();

		// Utiliser  la session
		Compte  compte = session.load(Compte.class, "C1000");

		System.out.println(compte);

        session.close();
		emf.close();


		System.out.println("====== FIN DU PROGRAMME =====");


	}
}
