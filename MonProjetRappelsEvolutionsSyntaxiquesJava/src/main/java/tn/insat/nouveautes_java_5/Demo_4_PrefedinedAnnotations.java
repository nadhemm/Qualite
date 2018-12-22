package tn.insat.nouveautes_java_5;

import java.util.ArrayList;
import java.util.Date;

public class Demo_4_PrefedinedAnnotations {

		
	@Deprecated
	public static void doSomeThingInAnOddWay() {
		// This does something in an odd way ...
	}
	
	public static void doSomeThingInAnElegantWay() {
		// This does something in an elegant way ...
	}


	public static void main(String[] args) {
	
		ArrayList data = new ArrayList();

		doSomeThingInAnOddWay();
		
		
		Date d = new Date();
		d.getMonth();

	}

	@Override
	public String toString() {
		return super.toString();
	}
}
