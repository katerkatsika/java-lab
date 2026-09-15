package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * The user gives the ray of a disc and the program calculates
 * its area given by πr^2.
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        // Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        double radius = 0.0;
        double discArea = 0.0;

        // Perform logic operations
        System.out.println("Please give the radius of the disc: ");
        radius = scanner.nextDouble();
        discArea = Math.PI * Math.pow(radius, 2);

        // Display output/results
        System.out.printf("The disc with radius = %.2f has an area = %.2f. \n", radius, discArea);

        scanner.close();
    }
}
