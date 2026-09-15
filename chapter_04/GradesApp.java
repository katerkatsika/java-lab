package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * User enters a grade between 1-10 and the program displays
 * a message according to the grade (e.g failure etc)
 */
public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;
        String message;

        System.out.println("Please insert your grade: ");
        grade = scanner.nextInt();

        message = switch (grade) {
            case 1, 2, 3, 4 -> "Failure";
            case 5, 6 -> "Paassed / Good";
            case 7, 8 -> "Paassed / Very Good";
            case 9, 10 -> "Passed / Excellent";
            default -> "Wrong input";
        };
        System.out.println(message);
    }
}
