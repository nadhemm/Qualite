package tn.insat.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Comptes")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String numero;

	private String proprietaire;
	private BigDecimal solde;
	
	

}
