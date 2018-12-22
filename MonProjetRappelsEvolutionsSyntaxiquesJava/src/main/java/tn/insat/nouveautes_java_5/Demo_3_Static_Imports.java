package tn.insat.nouveautes_java_5;

import static java.lang.Math.PI;

public class Demo_3_Static_Imports {

    public static void main(String[] args) {

        System.out.println(new Cercle(10).getSurface());
    }
}

class Cercle {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getSurface() {
        return 2 * rayon * PI;
    }
}
