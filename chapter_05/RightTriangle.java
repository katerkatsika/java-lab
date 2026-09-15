package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει 3 αριθμούς που εκφράζουν τις πλευρές ενός ορθογωνίου τριγώνου.
 * Έστω a: η υποτείνουσα, b and c οι δύο κάθετες πλευρές.
 * Το πρόγραμμα ελέγχει αν το τρίγωνο είναι ορθογώνιο.
 */
public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double sumSquared;
        double aSquared;
        double epsilon = 0.0000001;

        System.out.println("Please give a, b and c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        sumSquared = Math.pow(b,2) + Math.pow(c,2);
        aSquared = Math.pow(a,2);

        System.out.printf("a^2 = %.10f, b^2 + c^2 = %.10f \n", aSquared, sumSquared);

        if (Math.abs(aSquared - sumSquared) < epsilon) System.out.println("It is a right triangle");
        else System.out.println("It is NOT a right triangle");

        scanner.close();
    }
}
