package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds the minim values between two integers
 */
public class MinValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please give the first integer: ");
        num1 = scanner.nextInt();

        System.out.println("Please give the second integer: ");
        num2 = scanner.nextInt();

//        if (num1 < num2) {
//            min = num1;
//        } else {
//            min = num2;
//        }
        // Τριαδικός τελεστής (Ternary Operatorß)
        min = (num1 < num2) ? num1 : num2;

        System.out.printf("min = %d \n", min);
    }
}
