package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Αμοιβαία αντταλλαγή των τιμών δύο μεταβλητών.
 * Π.χ. αν a = 5 και b = 10, τότε να γίνει
 * α = 10 και b = 5.
 */
public class Swap2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // User enters the values of two variables
        int[] parameters = getValues();
        int a = parameters[0];
        int b = parameters[1];
        System.out.printf("a = %d and b = %d \n", a, b);

        // Swap the values of the two variables
        swap(a,b);
        System.out.printf("New a = %d and new b = %d \n", a, b);
        //System.out.println(5*a);
    }

    public static int[] getValues() {
        System.out.println("Please enter the value of a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter the value of b: ");
        int b = scanner.nextInt();

        return new int[] {a, b};
    }

    /**
     * Mutually exchanges the values
     * of the two inputs.
     * @param a the 1st input
     * @param b the 2nd input
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("Temp a = %d and temp b = %d =  \n", a, b);
    }
}
