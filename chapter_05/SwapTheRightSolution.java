package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Αμοιβαία αντταλλαγή των τιμών δύο μεταβλητών.
 * Π.χ. αν a = 5 και b = 10, τότε να γίνει
 * α = 10 και b = 5.
 */
public class SwapTheRightSolution {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // User enters the values of two variables
        int[] parameters = getValues();
        int a = parameters[0];
        int b = parameters[1];

        System.out.printf("a = %d and b = %d \n", a, b);

        // Swap the values of the two variables
        int[] newParameters = swap(a,b);
        a = newParameters[0];
        b = newParameters[1];

        System.out.printf("New a = %d and new b = %d \n", a, b);
    }

    public static int[] getValues() {
        System.out.println("Please enter the value of a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter the value of b: ");
        int b = scanner.nextInt();

        return new int[] {a, b};
    }

    public static int[] swap(int a, int b) {
        return new int[] {b, a};
    }
}
