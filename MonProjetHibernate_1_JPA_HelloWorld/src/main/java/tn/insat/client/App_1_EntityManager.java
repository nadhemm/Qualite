package tn.insat.client;

import tn.insat.domain.Compte;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App_1_EntityManager {
	public static void main(String[] args) {

		// Obtenir la EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BanquePU");

		// Obtenir le EntityManager à partir de la Factory
		EntityManager em = emf.createEntityManager();

		// Utiliser l'EntityManager

		Compte  compte = em.find(Compte.class, "C1000");

		System.out.println(compte);


		em.close();
		emf.close();

		System.out.println("====== FIN DU PROGRAMME =====");


	}
}
