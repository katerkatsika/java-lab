package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Calculates base^power using a for loop.
 * base and power are given by the user.
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Please give the base and then the power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.printf("result = %d \n", result);
        scanner.close();
    }
}
