package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Απλός αριθμητικός υπολογιστής με μεθόδους
 * My 1st solution.
 */
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1;
        int num2;
        int choice;
        int result;

        while (true) {
            printChoices();
            choice = getOneInt();

            if (isOutOfRange(choice)) {
                System.out.println("Wrong selection! Please choose a number between 1-6.");
                continue;
            }

            if (exit(choice)) {
                System.out.println("Thank you for using this application!");
                break;
            }

            int[] twoIntegers = getTwoIntegers();
            num1 = twoIntegers[0];
            num2 = twoIntegers[1];

            result = calculation(choice, num1, num2);
            System.out.println("The result is: " + result);
        }

    }


    /* Methods */

    public static void printChoices() {
        System.out.println("Please choose the calculation you want to do:");
        System.out.println("1. Summation");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
    }

    public static int getOneInt () {
        return scanner.nextInt();
    }

    public static boolean isOutOfRange(int choice) {
        return choice < 1 || choice > 6;
    }

    public static boolean exit (int choice) {
        return choice == 6;
    }

    public static int[] getTwoIntegers() {
        System.out.println("Please enter two integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return new int[] {num1, num2};
    }

    public static int calculation (int choice, int num1, int num2) {
        if (choice == 1) {
            return add(num1, num2);
        } else if (choice == 2) {
            return sub(num1, num2);
        } else if (choice == 3) {
            return div(num1, num2);
        } else if (choice == 4) {
            return mul(num1, num2);
        } else {
            return mod(num1,num2);
        }
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static int sub (int a, int b) {
        return a - b;
    }

    public static int div (int a, int b) {
        return a / b;
    }

    public static int mul (int a, int b) {
        return a * b;
    }

    public static int mod (int a, int b) {
        return a % b;
    }

}
