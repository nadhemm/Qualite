package tn.insat.nouveautes_java_5;

import static java.lang.Math.PI;

@NoteQualité(value = 4)
class Produit {

}

@NoteQualité(value = 3)
class Client {

}

public class Demo_5_User_Defined_Annotations {

	public static void main(String[] args) {
		
		Client  c = new Client();

		//double pi = PI;
		
		int note = c.getClass().getAnnotation(NoteQualité.class).value();
		System.out.println(" Note détectée : "+ note);


	}

}
