package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts miles to km.
 * 1 mile = 1.6 km
 */
public class MilesToKm {
    public static void main(String[] args) {

        // Define variables
        Scanner scanner = new Scanner(System.in);
        double miles = 0.0;
        double kilometers = 0.0;
        final double MILES_TO_KM = 1.6;

        // Perform logic operations
        System.out.println("Please give the miles");
        miles = scanner.nextDouble();
        kilometers = miles * MILES_TO_KM;

        // Display Output
        System.out.printf("%.3f miles are %.3f km", miles, kilometers);

    }
}
