package tn.insat.nouveautes_java_5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo_2_Generics {

	public static void main(String[] args) {	
		
		exemple_sans_generics();
		exemple_avec_generics();
	}

	private static void exemple_avec_generics() {
		
		List<String> liste_generique = new ArrayList<>();
		
		liste_generique.add("Bonjour");
		liste_generique.add("Asslama");
		liste_generique.add("Hello");
		
		for (String string : liste_generique) {
			System.out.println(string);
		}
	
		
	}

	private static void exemple_sans_generics() {
		
		ArrayList liste_non_generique  = new ArrayList(); 
		
		liste_non_generique.add(1234);
		liste_non_generique.add("Bonjour");
		liste_non_generique.add(new Date());
		
		// Remarques : 
		//   + : On peut mettre dans la collection n'importe quel type
		//   - : Pas de de possibilite de faire des parcours sans
		//        examen des types  
		
		
	}

}
