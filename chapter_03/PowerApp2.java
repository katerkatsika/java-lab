package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The user gives two integers one for base and ond for power.
 * The program calculates the base^power with a FOR LOOP. For example 2^10 = 1024.
 * In other words, it calculates 2 * 2 * 2 * ... * 2 = 1024.
 */
public class PowerApp2 {

    public static void main(String[] args) {

        //Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        int base  = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Perform logic operations
        System.out.println("Please enter base and power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (i = 1; i <= power; i++) {
            result *= base;
        }

        // Display result
        System.out.printf("Final: %d^%d = %d \n", base, power, result);
    }
}
