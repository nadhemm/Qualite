package tn.insat.nouveautes_java_8;

@FunctionalInterface
public interface CalculInterface {  // Ici c'est une interface fonctionnelle
	
	default boolean sontDansLOrdre(int a, int b)
	{
		return a >b;
	}
	
	int operation(int a, int b);
	

}
