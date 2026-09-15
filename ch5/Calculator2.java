package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Απλός αριθμητικός υπολογιστής με μεθόδους
 * Solution based on CF8 solution.
 */
public class Calculator2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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

            result = calculation(choice);
            printResult(result);
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

    public static int calculation (int choice) {
        int num1;
        int num2;

        System.out.println("Please enter two integers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        return  switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> div(num1, num2);
            case 4 -> mul(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static int sub (int a, int b) {
        return a - b;
    }

    public static int div (int a, int b) {
        return (b != 0)? a/b : 0;
    }

    public static int mul (int a, int b) {
        return a * b;
    }

    public static int mod (int a, int b) {
        return (b != 0)? a % b : 0;
    }

    public static void printResult(int result) {
        System.out.println("The result is: " + result);
    }

}

