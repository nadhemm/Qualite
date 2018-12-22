package tn.insat.service;

import org.springframework.stereotype.Component;

@Component
public class Calcul {
	
	public int additionner(int a, int b) {
		int resultat = a+b;
		return  resultat;
		//System.out.println(a + " + "+ b + " = "+ resultat);
	}

}
