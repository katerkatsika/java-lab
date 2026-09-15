package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Demo with arrays and methods.
 * Πως περνάμε πίνακες ως παραμέτρους μεθόδων
 * και πως επιστρέφουμε.
 */
public class ArraysAndMethods {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        printArray(arr);

        System.out.println();
        for (int el : arr) {             // 'el: element'
            System.out.print(el + " ");
        }
        System.out.println();
        printArray(arr, 5, 3  );
    }


    /**
     * Prints the elements of an array
     * @param arr the input array
     */
    public static void printArray(int[] arr) {
            arr[0] = 1000;          // Αυτή η αλλαγή διατηρείται στην αρχική arr στη main.
            //arr = new int[10];
            arr = new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; //Αυτή η αλλαγή είναι προσωρινή,
                                                                        // ζει μόνον όσο τρέχει η μέθοδος και
                                                                        // ΔΕΝ διατηρείται στην αρχική arr στη main.
            //arr[0] = 1000;                                    //Αυτή η αλλαγή περνάει στην προσωρινή μόνον arr
                                                                // και ΔΕΝ διατηρείται στην αρχική arr στη main.

            for (int el : arr) {             // 'el: element'
                System.out.print(el + " ");
            }
    }

    /**
     * Overloaded version of printArray with boundaries.
     * Print an array slice from position low to position high.
     * @param arr   the input array
     * @param low   the low index
     * @param high  the high index
     */
    public static void printArray(int[] arr, int low, int high ) {

        if (low < 0 || high > arr.length ) {
            System.out.printf("low must be between 0 and %d ", arr.length);
            return;
        } else if (low > high) {
            System.out.println("low must be less than high!");
            return;
        } else {
            for (int i = low; i < high; i++) {
                System.out.printf("arr[%d] = %d \t", i, arr[i]);
            }
        }

    }
}



