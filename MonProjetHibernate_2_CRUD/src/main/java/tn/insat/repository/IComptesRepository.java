package tn.insat.repository;

import tn.insat.entities.Compte;

import java.util.List;

/**
 * @author Mohamed Romdhani, INSAT Tunis
 */
public interface IComptesRepository {

	// Contrat (Facade) du CRUD

	String create(Compte c); // un C du CRUD
	Compte findById(String id); // un R =Read=Retrieve=Find=Get du CRUD
	List<Compte> findAll(); // un autre R
	Compte update(Compte c); // un U du CRUD
	boolean delete(String id); // un D du CRUD
}
