package tn.insat.client;

import tn.insat.repository.IComptesRepository;
import tn.insat.repository.ComptesRepositoryImp_Hibernate;


/**
 * @author Mohamed Romdhani, INSAT Tunis
 */
public class App {

	public static void main(String[] args) {

		// CECI N EST PAS UN TEST !!!
		IComptesRepository repo = new ComptesRepositoryImp_Hibernate();
		System.out.println(repo.findById("C1000"));
	}
}
