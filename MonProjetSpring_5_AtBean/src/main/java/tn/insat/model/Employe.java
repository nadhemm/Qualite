package tn.insat.model;

import org.springframework.stereotype.Component;

@Component
public class Employe {
	private String nom;
	private double salaire;

	public Employe() {
	}
	

	public Employe(String nom, double salaire) {
		super();
		this.nom = nom;
		this.salaire = salaire;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", salaire=" + salaire + "]";
	}
	

}
