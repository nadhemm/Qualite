package tn.insat.nouveautes_java_5;

public class Demo_1_Enhanced_For {

	public static void main(String[] args) {
		
		int [] tab = {1,2,3,4,5,6};		
	   
		demoForClassqiue(tab);
	
		demoForNouveau(tab);

	}
	

	private static void demoForNouveau(int[] tab) {
		for (int item : tab) {
			System.out.println("====> Avec le nouveau for : "+item);
		}
	}

	private static void demoForClassqiue(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println("====> Avec un for classique : "+ tab[i]);
		}
	}

}
