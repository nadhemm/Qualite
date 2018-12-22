package tn.insat.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.insat.domain.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

}



