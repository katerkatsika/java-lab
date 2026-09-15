package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει 3 αριθμούς που εκφράζουν τις πλευρές ενός ορθογωνίου τριγώνου.
 * Έστω a: η υποτείνουσα, b and c οι δύο κάθετες πλευρές.
 * Το πρόγραμμα ελέγχει αν το τρίγωνο είναι ορθογώνιο.
 */
public class RightTriangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        boolean isRight = false;
        final double EPSILON = 0.0000001;


        System.out.println("Please give a, b and c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        isRight = Math.abs(a*a -(b*b + c*c)) < EPSILON;
        System.out.println("The triangle is Right: " + isRight);

        scanner.close();
    }
}
