package tn.insat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.insat.dataaccess.CompteRepository;
import tn.insat.domain.Compte;

@Service
public class ComptesService {
	
	@Autowired
	private CompteRepository repo;
	
	public List<Compte> tousLesComptes() {
		return repo.findAll();
	}

}
