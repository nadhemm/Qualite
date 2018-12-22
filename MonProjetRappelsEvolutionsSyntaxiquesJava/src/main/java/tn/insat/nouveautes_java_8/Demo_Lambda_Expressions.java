package tn.insat.nouveautes_java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo_Lambda_Expressions {

	public static void main(String[] args) {
		
		List<Integer> data =  new ArrayList<>(
				Arrays.asList(-10, -5, -3, -2, 1, 2,3, 5, 10 ));


		List<Integer> negatifs2 =
				data.
				stream().
						filter(x -> x<0).collect(Collectors.toList());
		// Afficher les entiers négatifs	
//		for (int i : data) {
//			if (i <0) {
//				System.out.println(i + " est négatif");
//			}
//		}
		
		Predicate<Integer> isNegatif =  y  ->  y < 0 ;
		Predicate<Integer> isPair =  y -> y %2 == 0;
		 
		 
       List<Integer> negatifs = data.
    		   stream().
    		   filter(isNegatif).
    		   filter(isPair).
    		   map( x -> x*x ).

    		   collect(Collectors.toList());
       
//       for (Integer nbre : negatigs) {
//    	   System.out.println(nbre  +" Négatif obtenu avec LAMBDA" );
//	      }
       
      // negatifs.forEach(System.out :: println);

	
	   CalculInterface calcul = new Addition();
	   int somme = calcul.operation(1,2);
//	   System.out.println(somme);
	
	   
	   
	   CalculInterface calcul2 = new CalculInterface() {		
										@Override
										public int operation(int a, int b) {						
											return a*b;							
										}
	   							};
	   							
      //System.out.println(calcul2.operation(3,4));
      
      
      CalculInterface calcul3 =  (x, y) -> x*y;
      
        calcul3.sontDansLOrdre(11, 22);
      
      System.out.println(calcul3.operation(3,5));
	
	}

}
