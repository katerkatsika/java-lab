package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Reads two integers from stdin (i.e keyboard),
 * calculates and prints the result.
 */
public class ScannerAddApp {
    public static void main(String[] args) {
        //Initialisation of variables
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Requests/orders
        System.out.println("Please insert two integers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        // Print the results
        System.out.printf("The result is: %d", sum);

    }
}
