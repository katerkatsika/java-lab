package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The user gives an integer and the program returns its absolute value.
 */
public class AbsTernary {

    public static void main(String[] args) {
        // Define and initialise variables
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        // Perform logic operations
        System.out.println("Please give an integer: ");
        num = scanner.nextInt();

        abs = (num >= 0) ? num : -num;

        // Display result
        System.out.printf("The absolute value of %d is %d \n", num, abs);

        scanner.close();
    }
}
