package tn.insat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.insat.domain.Compte;

//@Repository Cette annotation @Repository n'est pas nécessaire
public interface IComptesRepository  extends JpaRepository<Compte, String>{

}
