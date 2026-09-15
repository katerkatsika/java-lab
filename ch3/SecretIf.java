package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The users inputs an integer trying to guess a "secret num".
 * Αν τον μαντέψει, τότε κάνει Bingo!
 */
public class  SecretIf {

    public static void main(String[] args) {
        // Define and Initialse variables
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        final int secretNum = 10;

        // Perform logic operations
        System.out.println("Make a guess between 1 and 20: ");
        inputNum = scanner.nextInt();

        if (inputNum == secretNum) {
            System.out.println("Bingo!!!");
        } else {
            while (inputNum != secretNum) {
                System.out.println("Try again");
                inputNum = scanner.nextInt();
            }
            System.out.println("Bingo!!!");
        }

        scanner.close();
    }
}
