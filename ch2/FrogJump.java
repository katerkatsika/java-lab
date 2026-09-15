package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * A small from wants to go to the other side of the road.
 * The frog is currently at position X and wants to go to
 * a position equal or greater than Y.
 * The frog jumps a fixed distance D. The program calculates the
 * minimum number of jumps.
 */
public class FrogJump {
    public static void main(String[] args) {
        // Define and Initialise variables
        double leap = 0.5;
        double initialPositionX = 0.0;
        double finalPositionY = 0.0;
        int jumpsNumber = 0;
        Scanner scanner = new Scanner(System.in);

        // Perform logic operations
        System.out.println("The initial position of the frog is: ");
        initialPositionX = scanner.nextDouble();

        System.out.println("The final position of the frog is: ");
        finalPositionY = scanner.nextDouble();

        jumpsNumber = (int) Math.ceil((finalPositionY - initialPositionX) / leap);

        // Display output/results
        System.out.printf("Frog leap = %.1f. Initial position = %.1f. Final position = %.1f. Minimum number of jumps = %d",
                leap, initialPositionX, finalPositionY, jumpsNumber);

    }
}
