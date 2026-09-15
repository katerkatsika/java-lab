package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * User gives a 3-digit integer and the program sums up its digits.
 * For example, if the user gives the number 123 the sum of its digits
 * is 1 + 2 + 3 = 6.
 */
public class DigitsCount {
    public static void main(String[] args) {
        // Define and initialize variables
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int integerUnits = 0;
        int integerDecades = 0;
        int integerHundreds = 0;
        int lastTwoDigits = 0;
        int digitsSum = 0;

        // Perform logic operations
        System.out.println("Please give an integer number between 1 and 999: ");
        inputNumber = scanner.nextInt();
        integerHundreds = inputNumber / 100;
        lastTwoDigits = inputNumber % 100;
        integerDecades = lastTwoDigits / 10;
        integerUnits = lastTwoDigits % 10;
        digitsSum = integerHundreds + integerDecades + integerUnits;

        // Display output/results
        System.out.printf("The sum of digits for the inout number: %d, is %d + %d + %d = %d.",
                inputNumber, integerHundreds, integerDecades, integerUnits, digitsSum);
        scanner.close();
    }
}
