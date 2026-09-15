package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Ανταλλάσσει αμοιβαία τα δύο στοιχεία ενός πίνακα.
 */
public class SwapWithArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide 2 integers: \n");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("Initial a = %d and b = %d \n", a, b);

        int[] arr = {a, b};

        int[] newValues = swap(arr);
        a = newValues[0];
        b = newValues[1];
        System.out.printf("New a = %d and new b = %d", a, b);
    }

    /**
     * Swap two elements in an array
     * @param arr The array that contains the two parameters
     * @return The array with the parameters swaped
     */
    public static int[] swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        return arr;

    }

}
