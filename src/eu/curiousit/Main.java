package eu.curiousit;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        double a = 1;
        double res = ( 1 - 2 * Math.pow( Math.sin(a) , 2 ) ) / ( 1 + Math.sin( 2 * a ) );
        System.out.println("Результат: " + res);
    }
}
