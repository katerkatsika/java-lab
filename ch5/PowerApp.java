package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates the power of numbers up to a given number (say a) to the power of n.
 * The parameters 'a' and 'n' are given by the user.
 */
public class PowerApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // The user enters the base 'base' (up to which all numbers will be considered) and the power exponent
        int[] parameters = getParameters();
        int base = parameters[0];
        int exponent = parameters[1];

        // The program calculates and displays the 'exponent' power of all the numbers up to 'base'
        printPowersTables(base, exponent);
    }


    /* Methods */

    public static int[] getParameters() {
        System.out.println("Please enter the (max) base 'a' and the power 'n': ");
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        return new int[] {a, n};
    }

    public static void printPowersTables(int a, int n) {

        for (int base = 1; base <= a; base++) {
            int result = 1;
            for (int exponent = 1; exponent <= n; exponent++) {
                result *= base;
                System.out.printf("-- %2d^%2d = %5d ---  ",base, exponent, result);
            }
            System.out.println();
        }
    }

}
