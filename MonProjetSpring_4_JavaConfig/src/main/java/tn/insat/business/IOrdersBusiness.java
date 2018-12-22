package tn.insat.business;

import java.math.BigDecimal;

public interface IOrdersBusiness {
	
	// Retourner le montant total de la commande 
	BigDecimal computeTotalOrderPrice(String id);

}
