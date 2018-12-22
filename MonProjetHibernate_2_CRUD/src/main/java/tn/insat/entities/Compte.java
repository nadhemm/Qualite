package tn.insat.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Mohamed Romdhani, INSAT Tunis
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "COMPTES")
public class Compte implements Serializable {

	@Id
	private String numero;
	private String proprietaire;
	private BigDecimal solde;

	public Compte() {
	}

	public Compte(String numero, String proprietaire, BigDecimal solde) {
		super();
		this.numero = numero;
		this.proprietaire = proprietaire;
		this.solde = solde;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public BigDecimal getSolde() {
		return solde;
	}

	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", proprietaire=" + proprietaire + ", solde=" + solde + "]";
	}

	@Override
	public int hashCode() {

		return this.numero.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (proprietaire == null) {
			if (other.proprietaire != null)
				return false;
		} else if (!proprietaire.equals(other.proprietaire))
			return false;
		if (solde == null) {
			if (other.solde != null)
				return false;
		} else if (!solde.equals(other.solde))
			return false;
		return true;
	}

}
